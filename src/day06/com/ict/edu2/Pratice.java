package day06.com.ict.edu2;

import java.util.Scanner;

public class Pratice {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("첫 번째 숫자 입력: ");
	int res1 = scan.nextInt();
	
	System.out.print("두 번째 숫자 입력: ");
	int res2 = scan.nextInt();
	
	System.out.print("연산자 입력:\n 1 => + \n 2 => - \n 3 => * \n 4 => / \n 입력>");
	int res3= scan.nextInt();
	
	String str ="";
	double su1 = 0;
	if (res3 == 1) {
		str = "+";
		su1 = res1 + res2;
	}else if (res3 == 2) {
		str = "-";
		su1 = res1 - res2;
	}else if (res3 == 3) {
		str = "*";
		su1 = res1 * res2;
	}else if (res3 == 4) {
		str = "/";
		su1 = res1*1.0 / res2*1.0;
	}
System.out.print
("결과: " + res1 + " " + str + " " + res2 + " = " + (int)(su1*100)/100.0);
}
}
