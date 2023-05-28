package day16.com.ict.edu;

interface Animal {   
	public void sound();   //반환형 없고
}
interface Animal2{
public String play();    //반환형 있고
}


class Dog implements Animal, Animal2 {   //인터페이스는 다중 상속 가능
	@Override
	public void sound() {
		System.out.println("멍~머엉~");
	}

	@Override
	public String play() {   //return이라 받은 쪽에서 찍어야 함.
		return "꼬리잡기";
	}
}

class Cat {
	void music(Animal animal) {
		animal.sound();
	}
	
	void game (Animal2 animal2) {
		System.out.println(animal2.play());
	}
}

public class Ex09_Anonymous {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		System.out.println(dog.play());
		System.out.println();

		Cat cat = new Cat();
		cat.music(new Animal() {

			@Override
			public void sound() {
				System.out.println("야옹~ 야옹~");
			}
		});
		
		cat.game(new Animal2() {
			
			@Override
			public String play() {
				return "그루밍";
			}
		});
	}
}