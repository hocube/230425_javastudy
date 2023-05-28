package day05.com.ict.edu;

public class Day05_Test {
public static void main(String[] args) {
	//1. for문을 이용한 누적 합
	//1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
			
			int sum2 = 0;
			int sum3 = 0;
					for (int i = 1; i < 11; i++) {
						 if (i %2 == 0) {
							sum2 = sum2 + (-i); 
						} else {
							sum3 = sum3 + i;
						}
					}System.out.println("누적합 : " + (sum2+sum3));
					System.out.println("============================");

			  
	//2. if~ else문 
	//농구공 5개씩 한 박스에 들어간다. 
	//40개면 8상자,  26개면 6개이다.
	//int k1 = 127개이다. 
	//몇 상자가 필요한가요? 
	//26상자

			int k1 = 127;
			int box;

			if (k1 % 5 == 0) {
			    box = k1 / 5;
			} else {
			    box = (k1 / 5) + 1;
			}

			System.out.println("상자: " + box);
			System.out.println("============================");

			
	//3. for 문으로 플기 
	//0 0 0 0 
	//0 0 0 0
	//0 0 0 0
	//0 0 0 0

			for(int i=1; i < 5; i++){
			 System.out.println("0 0 0 0");
			}
			System.out.println("============================");


	//4. 이중 for문으로 풀기
	//1 0 0 0
	//0 1 0 0
	//0 0 1 0
	//0 0 0 1

			for (int i = 0; i < 4; i++) { 
	            for (int j = 0; j < 4; j++) { 
	                if (i == j) {
	                    System.out.print("1 ");
	                } else {
	                    System.out.print("0 ");
	                }
	            }
	            System.out.println(); 
	        }System.out.println("============================");


	//5. 1+(-2)+3+(-4)+....과 같은 식으로 계속 더해나갔을 때, 
	//몇까지 더해야 총합이 100이상이 되는지 구하시오.
	        int i = 1;
	        int sum = 0;
	        
	          for (i = 1; sum < 100; i++) {
	              if (i % 2 == 0) {
	                  sum -= i;     //sum = sum - i
	              } else {
	                  sum += i;     //sum = sum + i
	              }
	          }

	          System.out.println("누적 합: " + sum);
	          System.out.println("누적 합이 100 이상이 되는 숫자: " + (i - 1));
					System.out.println("============================");
					
		 //5. while로 풀기
			i = 1;
			sum = 0;
					
				while (true) {
					if(sum >= 100)  break; 
						
					if (i %2 == 0) {
						sum -= i;
					}else {
						sum += i;
					}
					i++;
				}System.out.println("누적 합: " + sum);
					System.out.println("누적 합이 100 이상이 되는 숫자: " + (i-1));
				System.out.println("============================");


	//6. 별찍기  (for문)
			for (int a = 1; a < 5; a++) {
				for (int b = 1; b <= a; b++) {	
					System.out.print("*");
				}System.out.println();
		}System.out.println("============================");
			
			
	//7. 별 찍기
		    for (i = 1; i < 5; i++) {
				
				for (int j = 5-1; j >= i; j--) {
					System.out.print(" ");
				}
				  
				   for (int j = 1; j <= i; j++) {
					 System.out.print("*");
				}
		     System.out.println(" ");
			}
		
		
	 }//main
}//class
