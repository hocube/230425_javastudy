package network.com.ict.edu5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	ChatServer server;

	BufferedReader in;
	PrintWriter out;
	String ip;

	public CopyClient(Socket s, ChatServer server) {
		// 소켓 가지고 입력, 출력 모두 다 할 수 있는 기능을 만들어 놓음.
		this.s = s;
		this.server = server;
		try {
			// 3줄로 쓸걸 1줄로 한번에 넣었음.
			in = new BufferedReader(new InputStreamReader(s.getInputStream())); //입력
			out = new PrintWriter(s.getOutputStream(), true); //출력
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				if(msg.equals("exit")) {
					//원격에 있는 실제 클라이언트에게 종료 메세지 보냄
					out.println("~~ bye");
					break;
				}	
				server.sendMsg(ip + ":" + msg);
			} catch (Exception e) {
			}
		} // 무한반복
		try {
			out.close();
			in.close();
			s.close();
			
			// server에 있는 list에 현재 객체 삭제
			server.removeClient(this);
			server.sendMsg(ip + "님 퇴장");
		} catch (Exception e) {
		}
	}
}
