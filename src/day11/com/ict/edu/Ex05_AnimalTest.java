package day11.com.ict.edu;

public class Ex05_AnimalTest {
public static void main(String[] args) {
	// 객체 생성
	Ex05_Animal animal = new Ex05_Animal();
	
	// 이름 큰뿔소
	animal.setName("큰뿔소");
	
	// 나이 3
	animal.setAge(3);
	
	// 생존 여부 살아있음
	animal.setLive(true);
	//true하니깐 setLive가고 true가 live로 가서 boolean live로 감.
	
	// 결과 출력
	//System.out.println("이름: " + animal.getName());
	//위에처럼 하는 것보다 변수에 넣어서 부르는게 더 좋다. 밑에 처럼
	
	String m1 = animal.getName();
	System.out.println("이름: " + m1);
	
	int m2 = animal.getAge();
	System.out.println("나이: " + m2);
	
	boolean m3 = animal.getLive();
	if(m3) {
		System.out.println("생사여부: 살았음");
	}else {
		System.out.println("생사여부: 죽었음");
	}
	System.out.println("===============");
	
	// 이름을 펭귄, 나이 1, 생존여부 살아있음 으로 변경
	animal.setName("펭귄");
	animal.setAge(1);
	animal.setLive(true);

	// 결과 출력
	String p1 = animal.getName();
	System.out.println("이름: " + p1);
	
	int p2 = animal.getAge();
	System.out.println("나이: " + p2);
	
	boolean p3 = animal.getLive();
	if(p3) {
		System.out.println("생사여부: 살았음");
	}else {
		System.out.println("생사여부: 죽었음");
	}
	
	
	//play 부분 출력해보기
	System.out.println("================");
	//이건 Ex05_Animal에서 play 세번째꺼
	animal.play(false, 14, "엄지");
	animal.prn();
	
	//이건 Ex05_Animal에서 play 첫번째꺼
	System.out.println("================");
	animal.play("까치", 14, true);
	animal.prn();
}
}
