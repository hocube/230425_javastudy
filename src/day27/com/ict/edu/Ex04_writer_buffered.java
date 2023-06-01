package day27.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//BufferedWriter : newLine() => 줄바꿈 기능
public class Ex04_writer_buffered {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			String pathname = "D:/PJH/ex02.txt";
			File file = new File(pathname);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw) ;
			
			// 내용
			//String msg = "안녕하세요\n12345\nHello";
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("123456");
			bw.newLine();
			bw.write("hello");
			
			bw.flush();

		} catch (Exception e) {
		} finally {
			try {

			} catch (Exception e2) {
			}
		}
	}

}
