/*
11.���1-1000֮�ڵ������������Ǵ���1����Ȼ���������ǳ���1���������ܱ���������������������3����һ��������
��Ϊ��ֻ�ܱ�1��3�������ֱ���4����һ����������Ϊ������ͬʱ��1,2,4����
*/
import java.util.Scanner;
class Number{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,i;
		for(int a=2;a<=1000;a++){
			for(i=2,t=0;i<a;i++){
				if(a%i==0){
					t=1;
					break;
				}
			}
			if(t==0){
				System.out.println(a);
			}
		}
		
	}
}
