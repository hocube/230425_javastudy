package day02.com.ict.edu;
class Test{
   public static void main(String[] args){
     int kor = 90;
     int eng = 80;
     int math = 80;
     int sum = kor + eng + math;
     int avg = sum/3;
     System.out.println(avg);

     double avg2 = (double)(sum/3);
     System.out.println(avg2);

     double avg3 = (double)(sum)/3;
     System.out.println(avg3);

    double avg4 = sum/3.0;
    System.out.println(avg4);

    double avg5 = (int)(avg4*100)/100.0;
    System.out.println(avg5);

    int num1=1234;
    int num2 = (num1/10)*10;
     System.out.println(num2);
   }
}