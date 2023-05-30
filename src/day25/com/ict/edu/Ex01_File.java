package day25.com.ict.edu;

import java.io.File;

// File 클래스 : 특정 위치(경로=path)에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
// 주요 생성자 : File(String 경로), File(String 상위경로, String 하위경로)
// 		  	  File(File 상위경로, File 하위경로)
// 주요 메서드 : createNewFile() : 파일 생성
//			   mkdir() 	  	   : 디렉토리 생성
//			   isFile() 	   : 파일이면 true
//			   isDirectory()   : 디렉토리면 true
// 			파일과 디렉토리의 차이점 : 크기가 존재하면 파일
//				list()		   : 특정 위치의 내용을(파일, 디렉토리) 배열에 저장
//				exists()  	   : 존재유무
//				getName()      : 이름반환
// 				length() 	   : 파일 크기를 byte로 변환해서 표시
//			 getAbsolutePath   : 절대 주소 표시 (루트부터 시작해서 위치 표시)
// 			 getPath() 		   : 상대 주소 표시
public class Ex01_File {
public static void main(String[] args) {
//JAVA 에서 경로 구분자 표시 알아서 자동으로 인식하는 방법
//	- 윈도우  예) c:\temp...
//	- 리눅스  예) /home/yangyag/..
	String pathname = "D:/PJH";
	File file = new File(pathname);
	String[] arr = file.list();
	for (String k : arr) {
		//System.out.println(k);
		File file2 = new File(pathname, k); //상위경로와 하위경로 (예- D:\PJH\dbstudy)
		//System.out.println(file2);
		if(file2.isDirectory()) { //디렉트로니?
			System.out.println("디렉토리 : " + k);  //디렉토리는 크기가 없음.
		}else { //파일이니?
			System.out.println("파일 : " + k);
			
		}
	}
}
}
