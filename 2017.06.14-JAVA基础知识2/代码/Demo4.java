//if�����ϰ
import java.util.Scanner;
class Demo4{
	public static void main(String[] args){
		//��������
		Scanner sc = new Scanner(System.in);
		
		//����¼�����ݣ��ж����������Ƿ���ͬ����������
		System.out.print("�������һ�����ݣ�");
		int a = sc.nextInt();
		System.out.print("������ڶ������ݣ�");
		int b = sc.nextInt();
		if(a==b){
			System.out.println("������������ȵ�");
		}else{
			System.out.println("���������ǲ���ȵ�");
		}
		
		//����¼�����ݣ�����������нϴ��ֵ����������
		System.out.print("�������һ�����ݣ�");
		int a1 = sc.nextInt();
		System.out.print("������ڶ������ݣ�");
		int b1 = sc.nextInt();
		if(a1>b1){
			System.out.println("���ֵΪ"+a1);
		}else{
			System.out.println("���ֵΪ"+b1);
		}
		
		//����¼�����ݣ��ж���������������ż��
		System.out.print("������������ݣ�");
		int a3 = sc.nextInt();
		if(a3%2 == 0){
			System.out.println("�������ż��");
		}else{
			System.out.println("�����������");
		}
	}
}