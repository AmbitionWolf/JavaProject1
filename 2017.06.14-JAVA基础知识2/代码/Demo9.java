/*

*/
import java.util.Scanner;
class Demo9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���ڿ���̨�������1-10
		for(int a=1;a<=10;a++){
			System.out.print(a+",");
		}
		System.out.println("");
		//���ڿ���̨�������10-1
		for(int b=10;b>=1;b--){
			System.out.print(b+",");
		}
		System.out.println("");
		
		
		//���1-10֮������֮��
		int sum=0;
		for(int c=1;c<=10;c++){
			sum += c;
		}
		System.out.println("sum="+sum);
		
		
		//���1-100֮��ż����
		int sum2=0;
		for(int c=1;c<=10;c++){
			if(c%2==0){
				sum2 += c;
			}
		}
		System.out.println("sum2="+sum2);
		
		
		//���1-100֮��������
		int sum3=0;
		for(int c=1;c<=10;c++){
			if(c%2==1){
				sum3 += c;
			}
		}
		System.out.println("sum3="+sum3);
	}
}
