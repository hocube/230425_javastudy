package network.com.ict.edu9;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class DB_Server implements Runnable{
	ServerSocket ss = null;
	Socket s = null;
		
	public DB_Server() {
		try {
			ss = new ServerSocket(7780);
			System.out.println("서버 대기중....");
			
			new Thread(this).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("DB_Server의 Run()");
				s = ss.accept();
				System.out.println("DB_Server의 ss.accept();");
				CP_Client cc = new CP_Client(s, this);
				System.out.println("DB_Server의 new CP_Client(s, this)");
				cc.start();
				System.out.println("DB_Server의 cc.start();");
			} catch (Exception e) {
			    e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		new DB_Server();
	}
}
