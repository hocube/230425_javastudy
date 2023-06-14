package network.com.ict.edu5;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	ServerSocket ss = null;
	ArrayList<CopyClient> list = null;

	public ChatServer() {
		list = new ArrayList<>();
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 시작!");

			exe();

		} catch (Exception e) {
		}
	}

	public void exe() { 
		// 무한루프 돌고 있다가 누가 접속하면 소켓 만들어서, 소켓을 이용해서 카피클라이언트로 간다.
		// 만약 다섯명이 접속하면 다섯개의 스레드가 각각 만들어지고, 각각 입출력 함.
		while (true) {
			try {
				Socket s = ss.accept(); // 생성자들의 정보가 담긴 소켓
				CopyClient cc = new CopyClient(s, this); // 소켓정보와 내 정보를 다 줌.
				cc.start(); // 스레드 처리
				list.add(cc); // cc를 list에 담음
				sendMsg(" ** " + cc.ip + "님 입장 **"); 
				// sendMsg: ArrayList에 있는 모든 사람들한테 메세지 보내주는 역할
			} catch (Exception e) {
			}
		}
	}

	public void sendMsg(String msg) {
		// 리스트 안에 있는 모든 클라이언트에게 받은 메세지를 보내자 
		for (CopyClient k : list) {
			k.out.println(msg); 
		}
	}
	
	public void removeClient(CopyClient cc) {
		list.remove(cc);
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
}
