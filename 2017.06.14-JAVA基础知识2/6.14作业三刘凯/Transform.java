/*
1.���ʵ�ֶ���������������ֵ���л�����Ҫ��ʹ�õ�����������
*/
import java.util.Scanner;
class Transform{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=10,b=12;
		//����һ
		/*int a=10,b=12; //a=1010^b=1100;
		a=a^b; //a=0110^b=1100;
		b=a^b; //a=0110^b=1010;
		a=a^b; //a=1100=12;b=1010;*/
		
		//������
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
		//������
		a=b-a; //a=2;b=12
		b=b-a; //a=2;b=10
		a=b+a; //a=10;b=10
		
		System.out.println("a="+a+",b="+b);
	}
}
