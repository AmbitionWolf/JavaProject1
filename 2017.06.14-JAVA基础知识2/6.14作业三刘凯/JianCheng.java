/*
9.�����û�����¼�������ֵ�������Ӧ�Ľ׳ˡ�����5�Ľ׳˾���5*4*3*2*1
*/
import java.util.Scanner;
class JianCheng{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ����ֵ��");
		int num = sc.nextInt();
		
		long result=1;
		for(int i=1;i<=num;i++){
			result *=i; 
		}
		System.out.println("result="+result);
	}
}
