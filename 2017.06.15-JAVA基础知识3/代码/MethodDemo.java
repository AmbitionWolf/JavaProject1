/*
����¼���������ݣ������������еĽϴ�ֵ
����¼���������ݣ��Ƚ��������Ƿ����
����¼���������ݣ������������е����ֵ
*/
import java.util.Scanner;
class MethodDemo{
	public static void main(String[] args) {
		int max=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ��������");
		int a = sc.nextInt();
		System.out.print("������ڶ���������");
		int b = sc.nextInt();
		max = getMax(a,b);
		System.out.println("max="+max);
		isSame(a,b);
		
		System.out.print("�����������������");
		int c = sc.nextInt();
		max = getMax(getMax(a,b),c);
		System.out.println("max="+max);
	}
	
	//����¼���������ݣ������������еĽϴ�ֵ
	public static int getMax(int x, int y){
		int max;
		if(x>y){
			max = x;
		}else{
			max = y;
		}
		return max;
	}
	
	//����¼���������ݣ��Ƚ��������Ƿ����
	public static void isSame(int a,int b){
		boolean flag = false;
		if(a==b){
			System.out.println("����������ͬ");
		}else{
			System.out.println("������������ͬ");
		}
	}
	
	//����¼���������ݣ������������е����ֵ
	public static int isMax(int a, int b, int c){
		int max = 0;
		max = (max=a>b?a:b)>c?max:c;
		return max;
	}
}
