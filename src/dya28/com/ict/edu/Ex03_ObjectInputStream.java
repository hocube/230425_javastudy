package dya28.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// ObjectInputStream : 객체 입력 스트림
// readObject() : 객체 역직렬화 메서드
public class Ex03_ObjectInputStream {
	public static void main(String[] args) {
		String pathname = "D:/PJH/object01.ser";
		File file = new File(pathname);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			// 역직렬화
			ArrayList<Ex03_VO> list = (ArrayList<Ex03_VO>) ois.readObject();
			// ArrayList<Ex03_VO>로 보냈기 때문에 이걸로 받아야 함.
			// 만약 vo1 한개였으면 그걸로 받으면 된다.
			// 그리도 뒤에는 캐스팅해서 저렇게 된거다.

			for (Ex03_VO k : list) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getAge() + "\t");
				System.out.print(k.getAddr() + "\t");
				// System.out.print(k.isGender()+"\t"); //boolean이라 is
				// 남성, 여성으로 출력하고 싶다면
				if (k.isGender()) {
					System.out.print("남성\t");
				} else {
					System.out.print("여성\t");
				}
				System.out.println(k.getHeight() + "\t");
			}
		} catch (Exception e) {
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
