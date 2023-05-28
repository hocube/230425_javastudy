package day02.com.ict.edu;
class Ex04{
  public static void main(String[] args){
   //�ڷ��� ��ȯ : ���θ�ǰ� ����
   //���θ�� : ���� �ڷ����� ū �ڷ������� ��ȯ(����)�� �� ���� ���� �ڵ����� ��ȯ(����)��.
   //���� : ū �ڷ����� ���� �ڷ������� ��ȯ(����)�� �� ���� �߻�
   //������ �߻� �Ǿ��� �� ������ �ڷ����� �����ؼ� ������ ���������� ���� �ս�(���ϴ� ������ �ƴ� ����)�� �߻��� ���� �ִ�.

   byte b1 = 120;
   int su1 = b1;
   System.out.println(su1);

   int su2 = 129;
  // byte b2 = su2;

  // ������ ��ȯ�� =(��ȣ) �������� ������ �ڷ����� ���� �ڷ������� �����.
  //   ���� �ڷ��� = (���� �ڷ���)(������ �ڷ���(������));
     byte b2 = (byte)(su2);
     System.out.println(b2);

    char c1 = 'K';
    int su3 = c1;
    System.out.println(su3);

    int su4 = 107;
    //char c2 = su4;
    char c2 = (char)(su4);
    System.out.println(c2);
  }
}
  