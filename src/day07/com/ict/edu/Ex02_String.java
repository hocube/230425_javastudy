package day07.com.ict.edu;

public class Ex02_String {
	public static void main(String[] args) {
		// String 클래스는 문자열을 처리하는 클래스
		// 기본자료형은 아니지만 기본자료형처럼 사용
		
		// String에서 자주 사용되는 메서드들
		// 메서드(인자) : 실행 결과의 자료형
		// 인자 = 메서드가 실행하기 위해서 받은 재료(source)
		
		// 1. charAt(int index) : char 
		//	  위치정보 = index를 받아서 해당 위치의 존재하는 글자를 char형으로 반환
		//    위치정보를 받아서 해당 위치의 존재하는 글자를 char형으로 반환
		
		String str = "한국 ICT 인재개발원 1강의장";
		char k1 = str.charAt(3);
		System.out.println("결과: " + k1);
		
		
		// 모두 대문자로 만들자 (대문자는 그대로, 소문자는 -32해서 대문자로 변경)
		// 소문자에서 대문자로 바꿀 땐 -32하면 됨.)
		// str.length() => str의 문자열의 길이를 구해준다.
		str = "대한민국 I Love You 123";
		for (int i = 0; i < str.length(); i++) {
			char k2 = str.charAt(i);
			if (k2 >= 'a' && k2 <= 'z') {
				System.out.print((char) (k2 - 32));
				// 앞에 형변환 안하면 k2=char, 32 = int라서 H69767679 W79827668 숫자로 나옴.
			} else {
				System.out.print(k2);
			}
		}
		System.out.println();
		
		
		// 2. concat(String str) : String
		//    입력된 문자열을 현재 문자열과 합친다. ("문자열" + "문자열")
		String s1 = "대한민국";
		String s2 = "KOREA";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1 + s2);
		
		
		// 3. contains(CharSequence s) : boolean
		// CharSequence : char 값을 읽을 수 있는 시퀀스, 인터페이스
		// CharSequence을 지금은 String이라고 생각하자.
		// 현재 가지고 있는 문자열 중에 인지로 들어온 문자나 문자열을 가지고 있으면 true, 없으면 false
		
		String s4 = "KOREA @ 대한민국";
		System.out.println(s4.contains("@"));  // @ 있니?
		System.out.println(s4.contains("REA"));  // REA 있니?
		System.out.println(s4.contains("rea"));  // rea 있니?
		System.out.println("================================");
		
		
		// 4. equals(Object anObject) : boolean
		//    입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자를 구별)
		// 5. equalsIgnoreCase(String anotherString) : boolean
		//    입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자를 구별하지 않음)

		String s5 = "Korea";
		String s6 = "KOREA";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println("================================");

		
		// 6. format(String format, Object... args) : static String
		//    형식을 지정하고 형식에 맞춰 생성
		
		String s7 = "ICT 인재 개발원";
		// 문자열이면 => %s
		String s8 = String.format("%s",s7);
		System.out.println(s8);
		
		// %30s => 30자리 차지하는 문자열 (남은 자리는 비워둔다.) 오른쪽 정렬
		s8 = String.format("%30s",s7);
		System.out.println(s8);
		
		// %30s => 30자리 차지하는 문자열 (남은 자리는 비워둔다.) 왼쪽 정렬
		s8 = String.format("%-30s",s7);
		System.out.println(s8);
		
		// 자리가 모자르면 알아서 나옴
		s8 = String.format("%4s",s7);
		System.out.println(s8);
		
		// 자리가 모자르면 짤린다. 
		s8 = String.format("%.7s",s7);
		System.out.println(s8);
		System.out.println("================================");

		
		// %d => 정수 형식 지정
		int s9 = 23144544;
		
		s8 = String.format("%d**", s9);
		System.out.println(s8);
		
		// 오른쪽 정렬
		s8 = String.format("%5d", s9); //숫자니깐 자동으로 오른쪽 정렬
		System.out.println(s8);
		
		// 왼쪽 정렬
		s8 = String.format("%-5d", s9);
		System.out.println(s8);
				
		// 오른쪽 정렬 (빈 공간 0으로 채운다.)
		s8 = String.format("%05d", s9); 
		System.out.println(s8);
		
		// 오른쪽 정렬 (세자리마다 콤마)
		s8 = String.format("%,d", s9); 
		System.out.println(s8);
		System.out.println("================================");
		

		// %f => 실수형식
		double s10 = 1245.44547954;
		
		System.out.println(String.format("%f", s10));
		System.out.println(String.format("%20f", s10));
		System.out.println(String.format("%.3f", s10));
		System.out.println(String.format("%.1f", s10));  
		System.out.println(String.format("%,.1f", s10));  //세자리마다 컴마		
		System.out.println("================================");

		
		
		// 7. getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환 시킨다.
		// 보통 입출력할 때 사용한다.(대/소문자, 숫자, 일부 특수문자만 가능(아스키코드), 영어를 제외한 글자 안됨)
		
		String a1 = "java";   //j에 해당되는 숫자, a에 해당되는 숫자 .. 이렇게 바꿔줌
		byte[] b1 = a1.getBytes();
		
		System.out.println(b1[0]);   //j의 숫자
		System.out.println(b1[1]);   //a의 숫자
		System.out.println(b1[2]);   //v의 숫자
		System.out.println(b1[3]);   //a의 숫자
		System.out.println("================================");

		//반복문으로 바꿀 수도 있음.
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
		System.out.println("================================");

		//형변환 가능
		for (int i = 0; i < b1.length; i++) {
			System.out.println((char)(b1[i]));
		}
		System.out.println("================================");
		
		
		// 8. hashCode() : int
		// 일반적인 hashCode는 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값
		// String hashCode는 각 문자열에서 한 글자씩 가지고 와서 정수값으로 변경
		
		String a2 = "홍길동";
		System.out.println(a2.hashCode());
		
		String a3 = "홍길동";
		System.out.println(a2.hashCode());
		System.out.println("================================");

		
		// 문자열일 때 == 주소가 같냐? 라고 물어보는 것.
		System.out.println(a2 == a3); 
		// 문자열일 때 equals는 내용이 같냐? 라고 물어보는 것.
		System.out.println(a2.equals(a3));
		System.out.println("================================");
		
		
		// 9 . indexOf(int ch), indexOf(String str) : int
		// 입력된 char, String을 해당 문자열에 char나 String의 위치값을 알려준다.
		// 찾는 문자나 문자열이 없으면 -1 반환
		
		String a4 = "BufferedReader";
		
		// 'R'을 찾아라
		System.out.println(a4.indexOf('R'));  // 8
		// 'r'를 찾아라
		System.out.println(a4.indexOf('r'));  // 5
		// 'K'를 찾아라
		System.out.println(a4.indexOf('K'));  // 찾는 문자가 없기 때문에 -1 출력
		// 'er'을 찾아라
		System.out.println(a4.indexOf("er"));  // er이 R뒤랑 d뒤에도 있지만 맨앞에 것만 찾음.
		System.out.println("================================");
		
		
		// 10. lastIndexOf(int ch), lastIndexOf(String str) : int
		// 입력된 char, String을 해당 문자열에 char나 String의 마지막 위치값을 알려준다.
		
		a4 = "BufferedReader";
		
		// 'R'을 찾아라
		System.out.println(a4.lastIndexOf('R')); // 8
		// 'r'를 찾아라
		System.out.println(a4.lastIndexOf('r')); // 5
		// 'K'를 찾아라
		System.out.println(a4.lastIndexOf('K')); // 찾는 문자가 없기 때문에 -1 출력
		// 'er'을 찾아라
		System.out.println(a4.lastIndexOf("er")); // 맨 뒤에 있는 d 뒤 er만 찾음.
		System.out.println("================================");
		
		
		// 11. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		// 2번째, 3번째 문자나 문자열 찾기 위함.
		// fromIndex => 시작 위치 값 
		
		a4 = "BufferedReader";
		System.out.println(a4.indexOf('e', 0));  // a4.indexOf('e')와 같은 내용. 0이니깐 처음거 찾겠다는 말.
		
		// 첫번째 'e'의 위치가 4로 나왔기 때문에 5부터 시작
		System.out.println(a4.indexOf('e', 5));  //5는 첫번째꺼 찾아서 +1한거. 
		// ↓ 이렇게 바꿀 수 있다.
		System.out.println(a4.indexOf('e', a4.indexOf('e', 0)+1));  //6
		
		// 두번째 'e'의 위치는 6이 나왔기 때문에 7부터 시작
		System.out.println(a4.indexOf('e', a4.indexOf('e', a4.indexOf('e', 0)+1)+1));
		System.out.println("================================");

		
		// 12. length() : int => 문자열의 길이(갯수)   => 1부터 시작
		//						 문자열의 위치(index) => 0부터 시작 
		System.out.println(a4.length());
		System.out.println("================================");

		
		// 13. replace(char oldChar, char newChar)  : String
		// 	  replace(String oldChar, char newChar) : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기)한다.
		
		String a5 = "대한민국";
		String a6 = a5.replace('한', '韓');   //a5가 바뀐건 아님!
		String a7 = a5.replace("한", "한 ❤ ");   //window + .입력
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println("================================");

		
		// 이름의 첫자와 마지막 자를 제외하고 * 찍기
		// 예 ) 홍길동 => 홍*동,  선우은숙 => 선**숙
		String a8 = "홍길동";
		int t1 = a8.length();//이름의 길이//굳이 변수에 안 넣고 for문에 a8.length(); 이렇게 그냥 써도 되긴 함.
		String res = "";
		
		for (int i = 0; i < t1; i++) {
			char s = a8.charAt(i);    //한글자씩 끄집어 냄.
			if(i == 0 || i == t1-1) {   //길이(갯수)랑 index는 1 적기 때문에 길이에 -1 해줘야 함. 
				res += s;  //그대로 유지
			}else {
				res += "*"; //아닌 곳은 별 찍기
			}
		}
		System.out.println("결과 : " + res);
		
		
		// 전화번호: 010-1234-5678  => 010-1234-***,  010-****-5678 으로 변경
		// 끝에를 *로 변경
		a8 = "010-1234-5678";
		int t2 = a8.length();   //a8 의 길이
		int t3 = a8.lastIndexOf("-"); //'-' 얘의 위치가 나오니깐 +1하면 그 다음 자리인(내가 *처리 시작해야하는 부분)이 나옴
		res = "";
		for (int i = 0; i < t2; i++) {
			char s = a8.charAt(i);
			if(i>=0 && i<=t3) {
				res += s;  //그대로 유지
			}else {
				res += "*";  //아닌 곳은 별 찍기
			}
		}
		System.out.println("결과 : " + res);

		
		// 가운데를 *로 변경		
		a8 = "010-1234-5678";
		t2 = a8.length();   //a8 의 길이
		t3 = a8.lastIndexOf("-");   //첫번째 바
		int t4 = a8.indexOf("-");   //두번째 바
		
		//첫번째 바와 두번째 바 사이에 있는 애들 * 처리 하기.
		res = "";
		for (int i = 0; i < t2; i++) {
			char s = a8.charAt(i);
			if(i >= t4+1 && i <= t3-1) { //1234의 범위//+,-하는 이유는 "-"는 *처리할 필요가 없기 때문에. 
				res += "*";  //아닌 곳은 별 찍기
			}else {
				res += s;  //그대로 유지
			}
		}
		System.out.println("결과 : " + res);
		System.out.println("================================");

		
		
		// 14. isEmpty() : boolean
		// 해당 문자열이 비어있으면 true, 내용이 있으면 false
		String t5 = "HelloWorld";
		System.out.println(t5.isEmpty());
		
		t5="";
		System.out.println(t5.isEmpty());
		System.out.println("================================");

		
		// 15. split(String regex), : String[]  //배열!
		//     split(String regex, int limit) : String[]   //배열!
		// regex => 구분자(나눌 기준), limit => 배열의 크기 (방의 갯수)
		
		t5 = "사과, 딸기, 망고, @ 오렌지, 두리안, 용과";  //t5를 부르면 전부 다 옴.
		//String[] arr = t5.split(",");   //과일들을 구분하기 위해 ',' 를 넣어놨었음.
		//이제 방이 여러개 만들어졌음. ',' 단위로 만들어 지기 때문에 총 6개 만들어졌음.
		//방 여러개가 있으면 무조건 방 번호가 달림. 방 번호를 index라고 부름. 0부터 시작 함.
		//ex) arr[3]을 하면 오렌지가 나옴.
		
		//방 크기를 정해주고 만약 방이 모자르면 나머지는 한 방에 다!
		//     1      2             3                 : 방의 갯수 3개 설정
		//   "사과"   "딸기"   "망고, 오렌지, 두리안, 용과"    : 이렇게 들어가게 됨.
		
		String[] arr = t5.split(",");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);   이렇게 값을 하나씩 다 써주는건 좋지 못함.
//		System.out.println(arr[4]);   왜냐면 값이 수정되면 오류 생길 확률이 높음.
//		System.out.println(arr[5]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);     //6으로 올라가면 빠져나감.
		}
		System.out.println("================================");

		
		String[] arr2 = t5.split(",", 3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);  
		}
		System.out.println("================================");

		
		// 16. substring(int beginIndex) : String
		//  입력된 시작 위치부터 끝까지 문자열 추출
		String t6 = "010-1234-5678";
		String t7 = t6.substring(4);
		System.out.println(t7);
		
		t7=t6.substring(t6.lastIndexOf("-")+1);  //마지막 '-'에서 +1하면 그 다음꺼부터 찾는거 
		System.out.println(t7);
		System.out.println("================================");

		
		// 16-2 substring(int beginIndex, int endIndex) : String
		// beginIndex 위치부터 endIndex 위치까지 (endIndex 위치는 포함하지 않는다.)
		
		t6 = "010-1234-5678";
		t7 = t6.substring(4, 8); //-> 8로 해야지만 중간껄 뽑아낼 수 있음. endIndex 위치는 포함하지 않기 때문에 
		System.out.println(t7);  //7번째 자리이지만 마지막 endIndex 위치가 포함되지 않기 때문에 +1해서 8로 해야함.
		
		
		// 첫글자 추출
		t7 = t6.substring(0, 1); 
		System.out.println(t7);
		
		
		//전화번호: 010-1234-5678  => 010-1234-***,  010-****-5676 으로 변경
		//010-1234-***
		String t8 = "010-1234-5678";
		String t9 = "****";
		String t10 = t8.replace(t8.substring(4, 8), t9);
		System.out.println(t10);
		
		t10 = t8.replace(t8.substring(t8.indexOf("-")+1, t8.lastIndexOf("-")), t9);
		System.out.println(t10);
		
		//010-****-5679
		t10 = t8.replace(t8.substring(t8.lastIndexOf("-")+1), t9);
		System.out.println(t10);
		System.out.println("================================");

		
		//split 사용해서 하기
		String[] arr3 = t8.split("-");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		System.out.println(arr3[0] + "-****" + "-" + arr3[2]);
		System.out.println(arr3[0] + "-" + arr3[1] + "-****");
		
		
		// 17. toLowerCase() : String => 해당 문자열을 모두 소문자로 변경
		//     toUpperCase() : String => 해당 문자열을 모두 대문자로 변경
		
		//이런 방법도 있지만 안 씀!!!!!
		String str1 = "javaLand03Exam";
		String str2 ="";    //결과 저장하는 변수
		for (int i = 0; i < str1.length(); i++) {
			char k = str1.charAt(i);
			// 다 대문자 만들기
			// 소문자 => 대문자로 변경
			if(k>='a' && k<='z') {
				str2 = str2 + (char)(k-32);    //대문자와 소문자의 차이는 32여서 -32//형변환 해야함
			}else {
				str2 = str2 + k;  // 나머지는 그대로 출력
			}
		}
		System.out.println(str2);
		System.out.println("================================");

		//이렇게 함!!!!
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println("================================");

		
		// 18. toString : String
		// 객체(클래스)에서 toString : 모든 클래스(객체)에서 사용 가능한 메서드
		//                        클래스(객체)가 가지고 있는 정보나 값(데이터)들을 문자열로 만들어서 반환
		// String에서의 toString : 문자열 자체 반환
		String u1 = "java 11 자바11";
		String u2 = u1.toString();
		System.out.println(u1);
		System.out.println(u2);
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		
		// 19. trim() : String
		// 해당 문자열의 앞, 뒤 공백 제거, 글자 사이의 공백은 제거 못 함.
		String u3 = "   java    자바    JAVA   ";
		System.out.println("길이 : " + u3.length());   //개수(1부터) //24개
		System.out.println(u3);
		
		String u4 = u3.trim();
		System.out.println("길이 : " + u4.length());
		System.out.println(u4);  //앞, 뒤 공백을 지움. //정보를 받을 때 혹시 모를 띄어쓰기를 지우기 위해 사용함.
		System.out.println("================================");
		
		
		// 20. startsWith(String prefix) : boolean
		//	   주어진 문자열로 시작하는지 검사
		
		//     startsWith(String prefix, int toffset) : boolean
		//     주어진 문자로 시작하는지 검사, toffset => 시작 위치
		
		//     endWith(String suffix) : boolean
		//     주어진 문자로 끝났는지 검사
		
		String u5 = "java   자바   JAVA";
		System.out.println(u5.startsWith("JAVA")); //"JAVA"로 시작하니? f
		System.out.println(u5.startsWith("java"));  //"java"로 시작하니? t
		System.out.println(u5.startsWith("자바")); //"자바"로 시작하니? f
		System.out.println("================================");
		
		System.out.println(u5.endsWith("JAVA")); //"JAVA"로 끝나니? t
		System.out.println(u5.endsWith("java"));  //"java"로 끝나니? f
		System.out.println(u5.endsWith("자바")); //"자바"로 끝나니? f
		System.out.println("================================");

		
		// 21. valueOf(기본형) : 들어온 기본 자료형을 String으로 변경 시킴
		boolean bo1 = true;
		char ch1 = 'a';
		int num1 = 34;
		long num2 = 37L;
		double num3 = 345.127;
		
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("================================");
		
		//현재는 숫자이기 때문에 boolean 빼고는 모두 +1이 됨. 
		//System.out.println(bo1+1); 참, 거짓으로만 나오기 때무네 +1 할 수 없음.
		System.out.println(ch1+1);   //'a'는 97 + 1 = 98
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println("================================");
		
		//String으로 변했기 때문에 문자열 뒤에 1(숫자)이 붙음.
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		System.out.println("================================");
		
		
		//그냥 이렇게 쓰면 편하지만 " "이라는 데이터가 만들어짐. 
		System.out.println(bo1 + "" + 1);
		System.out.println(ch1 + "" + 1); 
		System.out.println(num1 + "" + 1);
		System.out.println(num2 + "" + 1);
		System.out.println(num3 + "" + 1);
		System.out.println("================================");

		
		// 22. Wrapper Class
		//     기본자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스들
		// 22-1. "true" , "false"  => true, false : Boolean.parseBoolean()
		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg);
		System.out.println(msg);    //"true" -> 문자열
		System.out.println(msg2);   //true -> boolean형
		if(msg2) {
			System.out.println("변경1");
		}else {
			System.out.println("변경2");
		}
		
		// 22-2. "142", "25" => 142, 25 => Integer.parseInt()
		msg = "142";
		int msg3 = Integer.parseInt(msg);  // 142 -> int
		System.out.println(msg + 10);   //14210  -> 문자열이라 숫자가 뒤에 붙어버림.
		System.out.println(msg3 + 10);  //152 -> 숫자로 변경됐기 때문에 계산이 됨.
		
		// 22-3. "123213", "3423423" => 123213, 3423423 => Long.parseLong();
		// l 자를 뒤에 붙이면 오류남.
		// "숫자" => OK, "숫자L" => err
		msg = "1231231212312312";  // 뒤에 l붙이면 오류남!
		long msg4 = Long.parseLong(msg);
		System.out.println(msg + 9);
		System.out.println(msg4 + 9);
		
		// 22-4. "347.457" => 347.457 => Double.parseDouble()
		msg = "347.457";
		double msg5 = Double.parseDouble(msg);
		System.out.println(msg + 0.04);
		System.out.println(msg5 + 0.04);
		System.out.println("=============");
		
		msg = "347.457f";  //오류발생 안됨.
		msg5 = Double.parseDouble(msg);
		System.out.println(msg + 0.04);
		System.out.println(msg5 + 0.04);
		
		
		// 22-5. Character.parseCharacter()는 존재하지 않는다.
		// String의 charAt() 이용하면 char를 가져올 수 있다.
		msg = "p";
		char msg6 = msg.charAt(0);
		System.out.println(msg6);
		System.out.println("***************");

		
		////////////////////////////
		msg = "java 자바 JAVA 大韓民國 2023 %*";
		// String.getBytes() => byte[]  (영문자 대/소문자, 숫자 및 일부 특수문자만 가능)
		byte[] result = msg.getBytes();
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] + " : " + (char)(result[i]));
		}
		System.out.println("=============");
		
		
		// String.toCharArray() => char[]  모든 문자 처리 가능
		char[] result2 = msg.toCharArray();
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
			
			
		
	}// main
}// class
