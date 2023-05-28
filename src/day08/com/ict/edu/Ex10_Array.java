package day08.com.ict.edu;

public class Ex10_Array {
public static void main(String[] args) {
	//가변 길이
	int[][] su = new int[3][ ];  //3개가 몇개 가지고 있는지는 정해지지 않음.
	//뒤에가 없는게 아니라 길이가 다 달라서 어떤걸 써야할지 모르기 때문에 그냥 비워둔거
	
	//1차원 배열이 없으면 무조건 오류!
	//int[][] su2 = new int[ ][ ];  //오류
	//int[][] su3 = new int[ ][4];  //오류
	
	//초기값을 고정길이 방식으로 주면 안됨(오류 발생)
//	su[0][0] = 10;
//	su[0][1] = 20;
//	
//	su[1][0] = 100;
//	su[1][1] = 200;
//	
//	su[2][0] = 1000;
//	su[2][1] = 2000;
	// 이런 식으로 하면 오류 발생!
	
	//가변 길이는 무조건 1차원 배열을 만들어서 넣어야 한다.
	int[] k1 = {10, 20, 30};
	int[] k2 = {100, 200, 300};
	int[] k3 = {1000, 2000, 3000};
	
	//위에서 만든 배열을 다차원 배열에 넣어라
	su[0] = k1;
	su[1] = k2;
	su[2] = k3;
	
	//출력
	for (int i = 0; i < su.length; i++) {
		for (int j = 0; j < su[i].length; j++) {
			System.out.println(su[i][j]);			
		}
	}
	System.out.println("=========================");
	
	
	
	//선언, 생성, 저장 한번에
	String[][] str = { {"java", "자바", "JAVA"}, {"JSP"}, {"HTML", "CSS"} };
	//들어가 있는 갯수가 모두 다름. 가변 길이
	
	//출력
	for (int i = 0; i < str.length; i++) {
		for (int j = 0; j < str[i].length; j++) {
			System.out.println(str[i][j]);			
		}
	}
	


}
}
