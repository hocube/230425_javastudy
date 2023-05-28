package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
	// 삼항 연산자 :  조건식 => 조건이 참 일때와 거짓 일때를 구분해서 실행한다.
	// 형식) 자료형 변수이름 = (조건식) ? 조건식이 참 일때 실행할 문장 : 조건식이 거짓일 때 실행할 문장
	// 조건식에는 boolean(true, false), 비교연산자(>,<...), 논리 연산자(&&, ||, !)
	// **주의사항) 변수와 참일 때 실행 결과, 거짓일 때 실행 결과 모두 같은 자료형이어야 한다.
		
	// 자바스크립트는 3개 모두 다른 자료형을 써도 상관 없다. 하지만 자바는 안됨.
	// 분기문 : 조건이 있고 성공했을 때와 실패했을 때로 나누어짐. ex: 로그인: 실패와, 성공으로 나뉨
		
		String str = (true) ? "강아지" : "고양이";
		//true니깐 강아지. 강아지가 str에 저장 됨.
		//고양이를 지우거나 자료형을 틀리게 하면 오류.
		//앞에 자료형 String을 지워도 오류. 꼭 모두 같은 자료형이여야 함.
		System.out.println("결과 : " + str);
		
		//int avg = 80;
		double avg = 55.3;
		str = (avg >= 60) ? "합격" : "불합격" ;
		System.out.println("결과 : " + str);
		
		char c1 = 'g';  //char이기 때문에 'g'도 숫자이다.
		str = (c1 >= 'a' && c1 <= 'z') ? "소문자" : "소문자 아님";
		//char는 숫자이기 때문에 숫자로 비교 할 수 있다.
		//c1('g')이 a보다는 크고 z보다는 작아야 하는 두가지 조건이 모두 만족해야 하기 때문에
		System.out.println("결과 : " + str);
		
		//1 또는 3이면 남자 아니면 여자 (1과 3 둘다 일 수 없으니깐 or)
		int gender = 1;
		str =(gender == 1 || gender ==3) ? "남자" : "여자";
		System.out.println("결과 : " + str);
		//이런 경우 5,6,7,8... 숫자들 넣으면 여자로 나옴. 이런 문제는 좋지 않은 문제.
		
		//홀수이면 남자, 짝수이면 여자
		gender = 4;
		str = (gender % 2 == 1) ? "남자" : "여자";
		System.out.println("결과 : " + str);
		//배수로 계산하면 됨. 
		//남자가 true값이니깐 조건식에 gender % 2 == '1' 1이 들어가야 함.
		
		//3의 배수인지 아닌지 알아보자
		int su = 157;
		str = (su % 3 == 0) ? "3의 배수" : "3의 배수 아니다";
		System.out.println("결과 : " + str);
		
		// 근무시간이 8시간까지는 시간당 9620원이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?
		
	   
		//int work = 10; 
		//int time = 8;
	    
		//int won = 9620;
		//int overwon = (int)(9620 * 1.5);
		
		//int money = (work > time) ? time*won+(work-time)*overwon : time*won;
		//System.out.println("결과는: " + money + "입니다");
		
		
		//선생님
	    int time = 10;
	    int dan =9620;
	    
	    int pay = (time > 8) ? (8 * dan)+(int)((time-8)*dan*1.5) : time * dan;
	    System.out.println("결과 : " + pay);
	    
	    
	    //더 큰 숫자 뽑아내기
	    int num1 = 47;
	    int num2 = 32;
	    int res = (num1 > num2) ?  num1 : num2;
	    System.out.println("큰값 : " + res);
		
	    //다른 풀이
	    res = (num1 - num2 > 0) ?  num1 : num2;
	    System.out.println("큰값 : " + res);
	    
	    //더 큰 숫자 뽑아내는 클래스 있음.
	    int res2 = Math.max(num1, num2);
	    System.out.println("큰값 : " + res);  
	    
	    //절대값 구하기
	    int res3 = -38;
	    int res4 = (res3 > 0) ? res3 : res3*-1;
	    System.out.println("결과 : " + res4);  
	    
	    //절대값 구하는 클래스.
	    int res5 = Math.abs(res3);
	    System.out.println("결과 : " + res5);  
	    
		
	}

}
