//����
import java.util.Scanner;
class Demo3{
	public static void main(String[] args){
		//��������
		Scanner sc = new Scanner(System.in);
		
		//��������
		//����¼������int�������ݣ�����������������ͣ��������
		System.out.println("����¼������int�������ݣ�����������������ͣ��������");
		int a,b;
		System.out.print("a=");
		a = sc.nextInt();
		System.out.print("b=");
		b = sc.nextInt();
		System.out.println("sum="+(a+b));
		
		//����¼������long�������ݣ���ȡ�����������е����ֵ���������
		System.out.println("����¼������long�������ݣ���ȡ�����������е����ֵ���������");
		long c,d,max;
		System.out.print("c=");
		c = sc.nextLong();
		System.out.print("d=");
		d = sc.nextLong();
		max = (c>d)?c:d;
		System.out.println("max="+max);
		
		//����¼������float�������ݣ���ȡ������ �����е����ֵ���������
		System.out.println("����¼������float�������ݣ���ȡ������ �����е����ֵ���������");
		float maxf,f1,f2,f3;
		System.out.print("f1=");
		f1 = sc.nextFloat();
		System.out.print("f2=");
		f2 = sc.nextFloat();
		System.out.print("f3=");
		f3 = sc.nextFloat();
		maxf = (((f1>f2)?f1:f2)>f3)?((f1>f2)?f1:f2):f3;
		System.out.println("maxf="+maxf);

		//����¼������byte�������ݣ��Ƚ������������Ƿ���ȣ��������
		System.out.println("����¼������byte�������ݣ��Ƚ������������Ƿ���ȣ��������");
		byte b1,b2;
		System.out.print("b1=");
		b1 = sc.nextByte();
		System.out.print("b2=");
		b2 = sc.nextByte();
		System.out.println(b1==b2);
	}
}