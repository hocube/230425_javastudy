package day26.com.ict.edu;

import java.awt.image.DataBufferDouble;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//  D:/PJH/test01.txt읽어서
//  D:/PJH/test02.txt에 내용 추가
//  path 2개 있어야함. 읽는거 쓰는거.
public class Ex03_File_IO {
	public static void main(String[] args) {
		String pathnameIn = "D:/PJH/test01.txt";
		String pathnameOut = "D:/PJH/test02.txt";
		
		File fileIn = new File(pathnameIn);
		File fileOut = new File(pathnameOut);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			//읽는거
			fis = new FileInputStream(fileIn);
			bis = new BufferedInputStream(fis);
			
			//쓰는거
			fos = new FileOutputStream(fileOut, true);
			bos = new BufferedOutputStream(fos);
			
			//모든 파일의 복사, 이동은 해당 방식으로 해야한다.
			int b = 0;
			while ((b = bis.read()) != -1) { //-1이 아닐 때까지 읽는다.
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
