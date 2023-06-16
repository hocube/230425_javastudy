package network.com.ict.edu.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.PublicKey;
import java.util.ArrayList;

import network.com.ict.edu.Test.ChatServer;
import network.com.ict.edu.Test.CopyClient;
import network.com.ict.edu.Test.Protocol;

public class ChatServer {
	
	ServerSocket ss = null; // 클라이언트의 연결을 수신할 준비
	ArrayList<CopyClient> list = null; //CopyClient 객체들을 저장하는 용도
	
	public ChatServer() {
		list = new ArrayList<>();
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기중...");
			
			//exec():
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// exec() 메서드는 
	// ChatServer 클래스에서 클라이언트의 연결을 대기하고, 
	// 연결이 수락되면 해당 클라이언트와 통신을 수행하는 역할을 함. 
	// exec() 메서드는 무한 루프를 통해 계속해서 클라이언트의 연결을 대기하고, 
	// 연결이 수락될 때마다 새로운 CopyClient 객체를 생성하여 클라이언트와 통신을 시작함.
	private void exec() {
		// 클라이언트 연결을 계속해서 받기 위해 무한루프
		while (true) {
			try {
				// ServerSocket 객체인 ss에서 클라이언트의 연결 요청을 수락하고, 
				// 연결된 클라이언트와의 통신을 위한 Socket 객체를 생성하는 역할
				Socket s = ss.accept();
				
				// Socket 객체 s와 현재의 ChatServer인스턴스(this)를 매개변수로 하여 
				// CopyClient 객체 cc를 생성. 
				// 클라이언트와의 통신을 처리하는 CopyClient 객체가 생성됨
				CopyClient cc = new CopyClient(s, this);
				cc.start();
				list.add(cc);
			} catch (Exception e) {
			}
		}
	}
		
		public void sendMsg(Protocol p) {
			try {
				for (CopyClient k : list) {
					k.out.writeObject(p);
				}
			} catch (Exception e) {
			}
		}

		public void removeClient(CopyClient cc) {
			list.remove(cc);
		}

		public static void main(String[] args) {
			new ChatServer();
		}
	}