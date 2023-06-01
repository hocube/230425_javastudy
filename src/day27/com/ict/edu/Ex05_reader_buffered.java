package day27.com.ict.edu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//BufferedReader : readLine() : 한 줄씩 읽는다. 더이상 읽을 수 없을 때 null;
public class Ex05_reader_buffered {
	public static void main(String[] args) {
		String pathname = "D:/PJH/ex01.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(pathname);
			br = new BufferedReader(fr);

			// 전체 읽기
			String msg = null;
			while ((msg = br.readLine()) != null) { // null이 아닐 땐 계속 읽어라
				System.out.println(msg);
			}
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
