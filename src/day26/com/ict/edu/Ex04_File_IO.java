package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//D:/PJH/java1.png 읽어서 D:/PJH/util/java1.png에 쓰기(복사)
public class Ex04_File_IO {
	public static void main(String[] args) {
		String pathnameIn = "D:/PJH/java1.png";
		String pathnameOut = "D:/PJH/util/java1.png";

		File fileIn = new File(pathnameIn);
		File fileOut = new File(pathnameOut);

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			// 읽는거
			fis = new FileInputStream(fileIn);
			bis = new BufferedInputStream(fis);

			// 쓰는거
			fos = new FileOutputStream(fileOut, true);
			bos = new BufferedOutputStream(fos);

			// 모든 파일의 복사, 이동은 해당 방식으로 해야한다.
			// 바로 읽고 쓰려면 배열처리보다 이게 더 속도가 빠르다.
			int b = 0;
			while ((b = bis.read()) != -1) { // -1이 아닐 때까지 읽는다.
				bos.write(b);
			}

		} catch (Exception e) {
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				bos.close();

			} catch (Exception e2) {
			}
		}
	}
}