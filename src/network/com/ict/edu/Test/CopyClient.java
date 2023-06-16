package network.com.ict.edu.Test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	ChatServer server;

	// 객체 직렬화
	ObjectInputStream in; // 클라이언트로부터 오는 객체를 읽기 위해 사용
	ObjectOutputStream out; // 클라이언트로 객체를 보내기 위해 사용
	String nickName;

	public CopyClient(Socket s, ChatServer server) {
		this.s = s;
		this.server = server;

		try {
			// Socket 객체 s의 입력 스트림을 가져와서
			// ObjectInputStream 객체 in을 생성함.
			// 클라이언트로부터 오는 객체를 읽을 수 있다.
			in = new ObjectInputStream(s.getInputStream());

			// 클라이언트로부터 오는 객체를 보낼 수 있다.
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (IOException e) {
		}
	}

	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 접속 종료
						out.writeObject(p);
						break esc;
						
					case 1: // 닉네임 받기
						nickName = p.getMsg();
						p.setCmd(2);
						p.setMsg(nickName + "님 입장");
						
						// 접속자 모두에게 전달
						server.sendMsg(p);
						break;
						
					case 2: // 메세지 일반 채팅
						p.setCmd(2);
						p.setMsg(nickName + ":" + p.getMsg());
						server.sendMsg(p);
						break;
					}
				}
			} catch (Exception e) {
			} //무한 반복 끝
			
			// 클라이언트가 이제 그만할래 하면 연결이 종료될 때 필요한 작업
			try {
				out.close();
				in.close();
				s.close();
				
				// server 객체의 removeClient() 메서드를 호출하여 
				// 현재 클라이언트를 제거.
				server.removeClient(this);
				// 클라이언트 퇴장 메시지를 담을 목적의
				// 새로운 프로토콜 객체 p2를 생성
				Protocol p2 = new Protocol();
				// p2의 cmd 값을 2로 설정. 
				// 퇴장 메시지를 나타내는 명령어.
				p2.setCmd(2); // cmd 2는 메세지
				p2.setMsg(nickName + "님 퇴장");
				server.sendMsg(p2);
			} catch (Exception e) {
			}
		}
	}
}