/*
����¼���������ݣ�Ȼ���ȡ���ֵ
*/
import java.util.Scanner;
class Demo7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ�����ݣ�");
		int a = sc.nextInt();
		System.out.print("������ڶ������ݣ�");
		int b = sc.nextInt();
		System.out.print("��������������ݣ�");
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.println("���ֵΪ��"+a);
		}else if(a<b && c<b){
			System.out.println("���ֵΪ��"+b);
		}else{
			System.out.println("���ֵΪ��"+c);
		}
	}
}