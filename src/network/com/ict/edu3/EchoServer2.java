package network.com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 스레드처리하기
public class EchoServer2 implements Runnable{
	   ServerSocket ss = null;
	   Socket s = null;
	   
	   InputStream in = null;
	   BufferedInputStream bis = null;
	   
	   OutputStream out = null;
	   BufferedOutputStream bos = null;
	   
	   
	   public EchoServer2() {
	      //edu2는 무한 반복만 했고, 여기는 쓰레드 처리를 해보자 
	      
	      try {
	         ss = new ServerSocket(7778);
	         System.out.println("서버 대기중...");
	         new Thread(this).start();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	      
	   }
	   
	   
	   @Override
	   public void run() {
	      while(true) {
	         try {
	            s = ss.accept();
	            String ip = s.getInetAddress().getHostAddress();
	            in = s.getInputStream();
	            bis = new BufferedInputStream(in);
	            
	            //나가는 것
	            out = s.getOutputStream();
	            bos = new BufferedOutputStream(out);
	            
	            byte[] b = new byte[1024];
	            bis.read(b);
	            
	            String msg = new String(b).trim();
	            
	            bos.write(msg.getBytes());
	            bos.flush();
	            //이렇게까지하면 스레드 처리까지 된 것이다. 
	            
	            
	         } catch (Exception e) {
	         } finally {
	            try {
	               s.close();
	               bos.close();
	               out.close();
	               bis.close();
	               in.close();
	            } catch (Exception e2) {
	            }
	         }
	      }
	      
	   }
	   
	   
	   
	   public static void main(String[] args) {
	   new EchoServer2();
	   
	   
	   }

	}