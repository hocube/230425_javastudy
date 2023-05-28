package day14.com.ict.edu.practice;

import java.util.Random;

import day14.com.ict.edu.Ex06_extends;

public class Ex05_extends extends Random{
int su = nextInt();

public Ex05_extends() {
System.out.println("Ex05: " + su);
}

public static void main(String[] args) {
	Ex05_extends test = new Ex05_extends();
}
}
