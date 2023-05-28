package day13.com.ict.edu2;

import day13.com.ict.edu.Ex03_static;

public class Ex03_main {
public static void main(String[] args) {
	System.out.println(Ex03_static.k1);
	//System.out.println(Ex03_static.k2);
	//System.out.println(Ex03_static.k3);

	//k2는 default이기 때문에
	//같은 패키지에 있는 건 접근 허용하고 (com.ict.edu)
	//다른 패키지에 잇는 건 접근 못한다. (com.ict.edu2)
	
}
}
