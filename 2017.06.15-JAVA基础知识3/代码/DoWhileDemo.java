/*
��do...while���ʵ��1-1000��������ż������
*/
import java.util.Scanner;
class DoWhileDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int doublenum = 0;
		int simplenum = 0;
		int i=1;
		do{
			if(i%2==0){
				doublenum++;
			}else{
				simplenum++;
			}
			i++;
		}while(i<=1001
		);
		System.out.println("��������Ϊ��"+doublenum+"��ż������Ϊ��"+simplenum);
		
	}
}
