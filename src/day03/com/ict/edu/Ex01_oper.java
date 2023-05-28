package day03.com.ict.edu;

public class Ex01_oper {
    public static void main(String[] args) {
		// 산술 연산자 : +  -  *  /  %(나머지)
    	int su1 = 9;
    	int su2 = 4;
    	int result = 0;
    	
    	result = su1 + su2 ; 
    	//결과값 13이 result에 저장. 과정이 저장 되는건 아님.
    	System.out.println("결과 : " + result);
    	
    	result = su1 - su2;    
    	System.out.println("결과 : " + result);
    	
    	result = su1 / su2;    
    	System.out.println("결과 : " + result);
    	
    	double res = su1 / su2;
    	System.out.println("결과 : " + res);
    	
    	res = (double)(su1) / su2;  // *1.0하는 방법도 있음.
    	System.out.println("결과 : " + res);
    	
    	res = su1 / (double)(su2);  
    	System.out.println("결과 : " + res);
    	
    	res = su1 / (su2*1.0);  
    	//su1 / su2*1.0; -> 앞에서부터 계산하기 때문에 이렇게 하면 x
    	//1.앞에 있는 su1에 *1.0을 하던가, 2.뒤에 괄호로 먼저 할 수 있도록 묶던가
    	System.out.println("결과 : " + res);
 
    	result = su1 % su2;    
    	System.out.println("결과 : " + result);
    	
	}
}
