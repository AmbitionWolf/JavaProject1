/*
10.�����û�����¼�������ֵ����ӡ��Ӧ�㼶�����ֽ�����ͼ��
�����û�����3��ô��ӡͼ��������ʾ��
	  1
	 222
	33333
*/
import java.util.Scanner;
class Paint{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ݣ�");
		int data=sc.nextInt();
		for(int i=1;i<=data;i++){
			for(int j=0;j<(2*data-1)/2+1-i;j++){
				System.out.print("  ");
					
			}
			for(int j=0;j<2*i-1;j++){
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}
