/*
����¼���·ݵ�ֵ�������Ӧ�ļ��ڡ�
3��5��Ϊ����
6��8��Ϊ�ļ�
9��11��Ϊ�＾
12�¡�2��Ϊ����
*/
import java.util.Scanner;
class Demo6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int x = sc.nextInt();
		if(x>12 || x<1){
			System.out.println("�������������");
		}else if(x >= 3 && x<=5){
			System.out.println("����");
		}else if(x >= 6 && x<=8){
			System.out.println("�ļ�");
		}else if(x >= 9 && x<=11){
			System.out.println("�＾");
		}else{
			System.out.println("����");
		}
	}
}