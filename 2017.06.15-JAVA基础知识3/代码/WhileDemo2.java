/*
���Ҹ߶ȣ�48m����������һ���㹻���ֽ�ţ����Ϊ��0.12m�����ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ����ڽ��ҵĸ߶�?
*/
import java.util.Scanner;
class WhileDemo2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double n = 0.12;
		while(n<48){
			n=n*2;
			count++;
		}
		System.out.println("count="+count);
		
	}
}
