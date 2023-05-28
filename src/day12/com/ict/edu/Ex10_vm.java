package day12.com.ict.edu;

public class Ex10_vm {
		// 얘네들은 초기값
		// 생성자가 들어오는 순간 의미 없어짐
		private String name = "물";
		private int price = 500;
		
		//기본 생성자
		public Ex10_vm() {
			
		}

		// 생성자 
		public Ex10_vm(String name, int price) {
			this.name = name;
			this.price = price;
		}

		// getter/setter
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
	}
