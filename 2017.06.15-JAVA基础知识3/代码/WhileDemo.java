/*
��whileѭ��ʵ��1-10�ĺ�
*/
import java.util.Scanner;
class WhileDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,i = 1;
		while(i<=10){
			sum += i;
			i++;
		}
		System.out.println("sum="+sum);
		
	}
}
