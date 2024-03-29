package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

//읽는 속도 향상을 위해서 BufferedInputStream을 사용
//혼자서는 사용 못 함, 반드시 InputStream 중 하나를 이용해야 한다.
public class Ex02_Buffered {
	public static void main(String[] args) {
		String pathname = "D:/PJH/test02.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);

			byte[] b = new byte[(int) file.length()];
			bis.read(b); // byte[] 선택해야 함.

			// 한글 안깨지려면 string에 넣어야함.
			String msg = new String(b);
			System.out.println(msg);

		} catch (Exception e) {
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
