package day27.com.ict.edu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//DataInputStream과 DataOutputStream
//기본 자료형의 데이터를 주고 받을 때 사용한다.
//**반드시 입력순서와 출력순서를 맞춰야한다.
//기본생성자가 없어서 BufferedStream처럼 FileStream을 이용해야 한다.

public class Ex01_datastream {
	public static void main(String[] args) {
		String pathname = "D:/PJH/test03.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		DataOutputStream dos = null; // 혼자는 못 쓰고 outputStream 중 한개를 넣어야 함.
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file); // 여기다 써주세요
			dos = new DataOutputStream(fos);

			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);

			// 쓸 때는 writeXXXX() => XXX는 기본자료형을 말한다.
			// 한글은 깨진다. 배열처리 안했기 때문에!
			// write할 때는 일반인이 제대로 볼 수 없다. read할 때는 제대로 읽힌다.
			dos.writeChar(97);
			dos.writeChar('A');
			dos.writeInt(7777);
			dos.writeDouble(77.789);
			dos.writeBoolean(false);
			dos.writeChar('가');
			dos.writeChar(97);
			dos.writeChar('A');
			dos.flush();

			// 읽을 때는 readXXX() => XXX는 기본 자료형을 말한다.
			// 반드시 쓰기 순서대로 읽어야 한다. 첫번째 char였으니깐 읽을 때도 char 순서대로!
			// 예) Char로 써놓고, 읽을 때는 Int로 쓰면 다른거 나온다
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());

		} catch (Exception e) {
		} finally {
			try {
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (Exception e2) {

			}
		}
	}
}
