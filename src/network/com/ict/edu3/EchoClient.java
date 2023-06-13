package network.com.ict.edu3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Socket s = null;
	OutputStream out = null;
	InputStream in = null;
	try {
		s = new Socket("192.168.0.78",7777);
		System.out.println("클라이언트 연결 성공");
		
		// 입출력 스트림
		out = s.getOutputStream();
		in = s.getInputStream();
		
		// 메세지 전송
		System.out.println("메세지 입력: ");
		String sc = scan.next();
		//String msg = "안녕하세요!! Hello!";
		out.write(sc.getBytes());
		out.flush();
		
		// 서버에서 전송된 데이터 수신
		byte[] buff = new byte[100];
		in.read(buff);
		//String receive_msg = new String(buff).trim();
		String receive_sc = new String(buff).trim();
		
		System.out.println("에코메세지 : " + receive_sc);
		
	} catch (Exception e) {
	} finally {
		try {
			s.close();
			in.close();
			out.close();
		} catch (Exception e2) {
		}
	}
}
}
