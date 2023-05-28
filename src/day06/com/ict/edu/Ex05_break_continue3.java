package day06.com.ict.edu;

public class Ex05_break_continue3 {
	public static void main(String[] args) {
		// break label :    레이블이 지정한 블록 탈출
		// continue label : 레이블이 지정한 블록의 증감식으로 간다.
		
		for (int i = 1; i < 4; i++) {
			System.out.println("1111111111");
			for (int j = 1; j < 6; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
		
			System.out.println("2222222222");
		 }		
		 System.out.println("=========================");
		
		 
		 // 레이블 (레이블 다음에는 무조건 반복문이 와야한다)
		 // i에 break esc: 붙였을 때
		 System.out.println("i에 break esc: 붙였을 때");
		 esc:
		 for (int i = 1; i < 4; i++) {
			 System.out.println("1111111111");
			 for (int j = 1; j < 6; j++) {
				 if (i == 2) break esc;
				 System.out.println("i=" + i + ", j=" + j);
			 }
			 
			 System.out.println("2222222222");
		 }	//i == 2를 만났을때는 전체 for문을 빠져나온다. 그래서 마지막에 "========="가 찍힘.	
		 System.out.println("=========================");
		
		
		 // j에 break esc: 붙였을 때
		 System.out.println("j에 break esc: 붙였을 때");
		 esc:
			 for (int i = 1; i < 4; i++) {
				 System.out.println("1111111111");
				 for (int j = 1; j < 6; j++) {
					 if (j == 2) break esc;
					 System.out.println("i=" + i + ", j=" + j);
				 }
				 
				 System.out.println("2222222222");
			 }		
			 System.out.println("=========================");
		
			 
		
		
			// i에 continue esc: 붙였을 때
			 System.out.println("i에 continue esc: 붙였을 때");
			 esc:
			 for (int i = 1; i < 4; i++) {
				 System.out.println("1111111111");
				 for (int j = 1; j < 6; j++) {
					 if (i == 2) continue esc;
					 System.out.println("i=" + i + ", j=" + j);
				 }
				 System.out.println("2222222222");
			 }	
			 System.out.println("=========================");
			
			
			 // j에 continue esc: 붙였을 때
			 System.out.println("j에 continue esc: 붙였을 때");
			 esc:
				 for (int i = 1; i < 4; i++) {
					 System.out.println("1111111111");
					 for (int j = 1; j < 6; j++) {
						 if (j == 2) continue esc;
						 System.out.println("i=" + i + ", j=" + j);
					 }
					 System.out.println("2222222222");
				 }		
				 System.out.println("=========================");
				 			 
				 
		
	}//main
}//class
