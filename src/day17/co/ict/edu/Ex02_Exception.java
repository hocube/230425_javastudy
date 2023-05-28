package day17.co.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

//다중 catch : 예외가 하나가 아니라 여러가지가 발생할 경우 사용
//	 주의사항 : Exception을 사용할 경우 반드시 가장 아래 catch문에 사용
//		형식 : try{
//			 	예외 발생 가능한 문장들;
//				예외가 발생 되면 아래 문장들을 무시하고, catch문으로 이동한다.
//				예외 발생 가능한 문장들;
//				예외 발생 가능한 문장들;
//			 }catch { (발생한 예외 객체 e) {
//	      		예외 발생시 처리하는 문장;
//		 	 }catch { (발생한 예외 객체 e) {
//				예외 발생시 처리하는 문장;
//			 }
public class Ex02_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		//While문 안에 스캐너가 있으면 scan.nextLine();을 써줘야 함.
		//스캐너가 안에 있으면 없어도 됨. 스캐너가 계속 새로 생성 되니깐.
		while (true) {
			try {
				//Scanner scan = new Scanner(System.in);
				int su1 = 50;
				System.out.println("정수 입력: ");
				int su2 = scan.nextInt();
				System.out.println("정답: " + (su1 / su2));

			} catch (InputMismatchException e) { // 문자 입력 시
				System.out.println("숫자를 입력하세요.");
				scan.nextLine(); //이게 없으면 뒤에 엔터 친게 메모리에 남아있기 때문에 문자 입력 시 무한루프 생김.
								 //nextLine();으로 정리를 해줘야 함.
			} catch (ArithmeticException e) { // 0 입력 시
				System.out.println("0으로는 나눌 수 없습니다.");
			}
		}
		// System.out.println("수고하셨습니다.");
	}
}