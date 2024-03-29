package day15.com.ict.edu2;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("선택하세요(1. 고양이, 2. 강아지) >>");
			int su = scan.nextInt();

			// 다형성의 정적 바인딩: 가장 일반적인 방법
			/*
			 * switch (su) { 
			 * case 1: Ex04_Cat cat = new Ex04_Cat(); cat.sound(); cat.play();
			 * break;
			 * 
			 * case 2: Ex04_Dog dog = new Ex04_Dog(); dog.sound(); dog.play(); 
			 * break; 
			 * }
			 */

			// 다형성의 동적 바인딩
			// 객체가 정해져있지 않고 그때 그때 변하는거
			Ex04_Abstract animal = null;
			switch (su) {
			case 1:animal = new Ex04_Cat(); break;
			case 2:animal = new Ex04_Dog(); break;
			}
			animal.sound();
			animal.play();
			
			//변경안됨
			//System.out.println(animal.name); //홍길동
			System.out.println(animal.getName());
			
		}
	}
}
