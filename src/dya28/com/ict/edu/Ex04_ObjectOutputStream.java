package dya28.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ObjectOutputStream : 객체 출력 스트림
// WriteObject : 객체 직렬화 메서드
public class Ex04_ObjectOutputStream {
	public static void main(String[] args) {
		// 1. 객체 만들기
		Ex04_VO vo1 = new Ex04_VO("고둘리", 27, "서울 마포구", true, 179.5);
		Ex04_VO vo2 = new Ex04_VO("케로로", 18, "서울 용산구", false, 164.3);
		Ex04_VO vo3 = new Ex04_VO("김길동", 15, "서울 강남구", true, 156.5);
		Ex04_VO vo4 = new Ex04_VO("맹짱구", 6, "서울 서초구", true, 130.8);
		Ex04_VO vo5 = new Ex04_VO("콩순이", 30, "서울 중랑구", false, 160.7);

		// 2. 만들어진 객체를 컬렉션으로 모으자.
		ArrayList<Ex04_VO> list = new ArrayList<>();
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		list.add(vo5);

		// 3. 모은 객체들을 직렬화 한 후에 파일에 저장한다.
		// 직렬화가 된 정보는 볼 수 없다.
		// 읽을 때 역직렬화를 해야 볼 수 있다.
		String pathname = "D:/PJH/object02.ser"; // 보통 확장자를 ser을 쓴다.
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			// 4. 객체 직렬화
			oos.writeObject(list);
			oos.flush();
			// 직렬화 끝

		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}

	}
}
