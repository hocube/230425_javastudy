package day11.com.ict.edu;

public class Ex03_main {
public static void main(String[] args) {
	
	//생성자 만듦
	Ex03_method t1 = new Ex03_method();
	
	/*
	t1.getSum();
	t1.getAvg();
	t1.getHak();
	
	System.out.println(t1.sum);
	System.out.println(t1.avg);
	System.out.println(t1.hak);
	*/
	
	//변수에 다시 담아서 이렇게 해야 함.
	//return이 있으면 무조건 담아줘야 함.
	int k1 = t1.getSum();
	double k2 = t1.getAvg();
	String k3 = t1.getHak();
	
	System.out.println("총점: " + k1);
	System.out.println("평균: " +k2);
	System.out.println("학점: " +k3);
}
}
