package day27.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

//PrintStream은 모든 데이터를 출력할 수 있다. (입력은 아님. print니깐 출력!)
//기본생성자가 없어서 BufferedStream처럼 FileStream을 이용해야 한다.
public class TEST {
	public static void main(String[] args) {
		String pathname = "D:/PJH/test05.txt";
		File file = new File(pathname);

		FileOutputStream fos = null; //버퍼도 사용 가능함. 3개 연결 간으
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);

			ps.println("바보");
			ps.print('A');
			ps.print(98);
			ps.print(3.14);
			ps.println("오늘은 월요일");
			
		} catch (Exception e) {
		} finally {
			try {
				ps.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}

	}
}