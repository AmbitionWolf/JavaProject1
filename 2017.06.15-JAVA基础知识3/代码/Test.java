/*
С�������ÿ�����3ԪǮ������������������ǣ�ÿ����һ��������Ǵ�Ǯ�ĵ�6�����6�ı����Ļ���
�����Ứȥ5ԪǮ�����ʣ����������죬С��ſ��Դ浽100ԪǮ
*/
import java.util.Scanner;
class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int day = 0;
		while(money<100){
			
			day++;
			money = money + 3;
			if(day%6==0){
				money = money - 5;
			}
			System.out.println(day+"�죬����"+money+"Ԫ");
		}
		System.out.println("����"+day+"�죬����"+money+"Ԫ");
		System.out.println("����"+day+"�죬���Դ浽100Ԫ");
	}
}
