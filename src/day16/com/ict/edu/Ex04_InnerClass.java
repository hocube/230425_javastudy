package day16.com.ict.edu;

public class Ex04_InnerClass {
	//내부 클래스 : 클래스 안에 다른 클래스가 정의 되어 있는 클래스
	//   종류   : Member(멤버), Local(지역), static, Anonymous(익명)
	// 1. Member 
	//		외부클래스{
	//			외부 멤버필드
	//			생성자
	//			외부 멤버 메서드
	//			내부 클래스{
	//				내부 멤버필드
	//				생성자
	//				내부 멤버 메서드
	//			   }
	//			}
	
	// 	특징) 내부 클래스에서는 외부 클래스의 멤버들을 마음대로 사용가능 (상속과 비슷)
	//		 단, 상속에서는 private 접근 안됨, 내부 클래스에서는 private 접근 가능
	//		 외부 클래스를 통해서만 내부클래스를 생성할 수 있다. (내부 클래스만 별도로 생성 안됨)
	
	// 2. Local : 외부 클래스 메서드 안에 내부 클래스가 존재
		// 		  외부 클래스가 지역 변수처럼 사용
		//  	  외부 클래스의 메서드가 호출(실행)될 때 생성할 수 있다.
		// 		  지역변수 처럼 외부 클래스의 해당 메서드가 종료되면 내부 클래스도 지워진다.  
		//	외부 클래스{
		//		외부 멤버필드
		//		생성자
		//		외부 멤버 메서드
		//			내부 클래스{
		//			내부 멤버필드
		//			생성자
		//			내부 멤버 메서드
		//		}
		//	  }
		// }
	
	// 3. static 내부 클래스 : 구조는 Member 내부 클래스와 같다.
	//						내부 클래스의 멤버 변수는 static을 사용할 수 없다.
	//						어쩔 수 없이 내부 클래스의 멤버 변수를 static으로 사용할 때
	//						내부 클래스를 static 내부 클래스로 만든다.
	//						접근 방법은 static 접근 방법을 사용하면 된다. (클래스 이름.변수)
	//						내부 클래스를 별도로 생성할 수 있다.
		//		외부클래스{
		//			외부 멤버필드
		//			생성자
		//			외부 멤버 메서드
		//			static 내부 클래스{
		//				static 내부 멤버필드
		//				생성자
		//				내부 멤버 메서드
		//			   }
		//			}
	
	// 4. Anonymous(익명) : 정의 된 이름이 없는 클래스
	//					   다시 호출 할 수 없다. (일회용으로 한 번 사용하고 다시 사용할 수 없다)
}
