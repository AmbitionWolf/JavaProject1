/*
��ͳ��1-1000֮��ֱ��������������������ж��ٸ���
��3������2
��5������3
��7������2
*/
import java.util.Scanner;
class Demo10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a3=0,a5=0,a7=0;
		for(int i=1;i<=1000;i++){
			if(i%3==2){
				a3++;
			}
			if(i%5==3){
				a5++;
			}
			if(i%7==2){
				a7++;
			}
		}
		System.out.println("a3="+a3+",a5="+a5+",a7="+a7);
		
	}
}
