package network.com.ict.edu2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
public static void main(String[] args) {
	ServerSocket ss = null;
	InputStream in = null;
	OutputStream out = null;
	Socket s = null;
	
	try {
		// 생성
		ss = new ServerSocket(7777);
		System.out.println("서버 대기중...");
		
		// 무한 반복
		while (true) {
			// 클라이언트에게 요청이 올 때까지 대기하다가
			// 요청이 오면 클라이언트와 통신할 소켓을 만든다.
			s = ss.accept();  // 무한 대기상태
			
			// 입출력 스트림
			in = s.getInputStream();
			out = s.getOutputStream();
			
			// 데이터 수신
			byte[] buff = new byte[100]; //크기 모르니깐 임의 지정
			in.read(buff); // byte배열로 해야함. 글자 깨지는거 방지하기 위해 배열처리
			
			String read_data = new String(buff).trim(); //byte배열로 해야함.
			String client_ip = s.getInetAddress().getHostAddress();
			System.out.println("서버에 수신된 데이터 : " + read_data+(client_ip)); //받은 데이터
			
			// 데이터 통신
			out.write(read_data.getBytes());
			out.flush();  //서버가 데이터 받아서 찍고 다시 보낸거.
		}
	} catch (Exception e) {
	} finally {
		try {
			s.close();
			out.close();
			in.close();
		} catch (Exception e2) {
		}
	}
	
}
}
