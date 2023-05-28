package day11.com.ict.edu;

public class Ex04_main {
public static void main(String[] args) {
	Ex04_method t1 = new Ex04_method();
	
	t1.add();
	t1.add(100);
	t1.add(100,24);
	
	System.out.println(t1.result); //124
	//변수는 맨 마지막에 가지고 있는 것만 가지기 때문에 100+24가 나온다.
	System.out.println("================");
	
	
	t1.add(); 
	System.out.println(t1.result); //30
	
	t1.add(100);
	System.out.println(t1.result); //
	
	t1.add(100,24);
	System.out.println(t1.result); // 124
	System.out.println("================");
	
	
	
	//빼기
	int k1 = t1.sub();
	System.out.println(k1);
	
	int k2 = t1.sub(120);
	System.out.println(k2);
	
	int k3 = t1.sub(24, 12);
	System.out.println(k3);
}
}
