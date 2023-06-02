package day25.com.ict.edu;

import java.io.File;
import java.io.IOException;

public class Ex01_File_02 {
	public static void main(String[] args) {
//회원가입할 때 내 폴더가 만들어지는 기능은 이런걸 쓴다.
		String pathname = "D:/PJH/exam01.txt";
		File file = new File(pathname);
		try {
			boolean res = file.createNewFile();
			if (res) { // createNewFile()이 true면
				System.out.println("파일 생성 성공");
			} else {
				System.out.println("파일 생성 실패(기존에 같은 이름의 파일이 존재)");
				// 기존에 같은 이름의 파일이 존재 하여 못 만든다.
			}
			System.out.println("==============");
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("상대경로 : " + file.getPath());
			System.out.println("파일이름 : " + file.getName());
			System.out.println("==============");

			File file2 = new File("D:/PJH/EXAM1/AAABBBB");
			// 중간에 하나라도 없으면 만들어지지 않는다.
			// boolean res2 = file2.mkdir();

			// 중간에 디렉토리가 없어도 만들어진다.
			boolean res2 = file2.mkdir();
			if (res2) {
				System.out.println("디렉토리 생성");
			} else {
				System.out.println("디렉토리 생성 실패(기존에 같은 이름의 파일이 존재)");
			}
			System.out.println("==============");
			
			
			//파일 삭제
			pathname = "D:/PJH/exam01.txt";
			File file3 = new File(pathname);
			boolean res3 = file3.delete();
			if(res3) {
				System.out.println("파일 삭제 성공");
			}else {
				System.out.println("파일 삭제 실패");
			}
			System.out.println("==============");

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}