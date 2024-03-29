package day25.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Ex04의 속도 향상을위해서 BufferedOutputStream 사용
//BufferedOutputStream는 혼자서는 사용하지 않는다. 반드시 OutputStream 중 하나와 같이 사용 된다.

public class Ex05_Buffered {
public static void main(String[] args) {
	String pathname = "D:/PJH/test02.txt";
	FileOutputStream fos = null;
	File file = new File(pathname);
	BufferedOutputStream bos = null;
	
	try {
		fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos);
		String msg = "Hell\n안녕\n大韓\n12345";
		
		byte[] b = msg.getBytes();
		bos.write(b);  //오류나면 try/catch할 때 두번째꺼 누르기
		bos.flush();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			bos.close();
			fos.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
}
}