//ѡ��ṹ--if�����ϰ
import java.util.Scanner;
class Demo5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//����¼��x��ֵ�������y�Ĳ����
		/*
			x��y�Ĺ�ϵ�������£�
			x>=3	y = 2x + 1;
			-1<=x<1	y = 2x;
			x<-1	y = 2x �C 1;
		*/
		System.out.print("������x��ֵ��");
		int x = sc.nextInt(),y=0;
		if(x >= 3){
			y = 2*x+1;
			System.out.println("y��ֵΪ��"+y);
		}else if(x<1 && x>=-1){
			y = 2*x;
			System.out.println("y��ֵΪ��"+y);
		}else{
			y = 2*x-1;
			System.out.println("y��ֵΪ��"+y);
		}
		
	}
}