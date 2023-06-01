package day27.com.ict.edu;

import java.io.File;
import java.io.FileWriter;

//FileOutputStream => 1byte 처리, write(아스키코드), write(byte[] b)
//FileWriter       => 2byte 처리, write(String str);
public class Ex03_writer {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			String pathname = "D:/PJH/ex01.txt";
			File file = new File(pathname);
			fw = new FileWriter(file);
			// 내용
			String msg = "안녕하세요\n12345\nHello";
			fw.write(msg);
			fw.flush();

		} catch (Exception e) {
		} finally {
			try {

			} catch (Exception e2) {
			}
		}
	}

}
