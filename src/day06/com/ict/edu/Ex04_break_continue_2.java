package day06.com.ict.edu;

public class Ex04_break_continue_2 {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println( "i=" + i + ", j=" + j);
			}
		}
		System.out.println("===============================");
		
		
		
		System.out.println("break 사용");
		for (int i = 1; i < 4; i++) {   
			for (int j = 1; j < 6; j++) {
				if (i == 2) break;
				System.out.println( "i=" + i + ", j=" + j);
			}
		}
		System.out.println("===============================");
		
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 2) break;    //j2를 만나면 블록 바깥으로 빠져나가기 때문에 j3~5가 아예 다 없는거임.
				System.out.println( "i=" + i + ", j=" + j);
			}
		}
		System.out.println("===============================");
		
		
		
		
		System.out.println("continue 사용");
		for (int i = 1; i < 4; i++) {   
			for (int j = 1; j < 6; j++) {
				if (i == 2) continue;
				System.out.println( "i=" + i + ", j=" + j);
			}
		}
		System.out.println("===============================");
		
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 2) continue;  
				System.out.println( "i=" + i + ", j=" + j);
			}
		}
		System.out.println("===============================");
		
		//break는 아예 블록 자체를 빠져나오니깐 얘 밑으로는 다 안 함.
		//continue를 만나면 바로 밑에 코드 수행 안 하고 위에 있는 증감식으로 이동.
		
		
		
	}//main
}//class
