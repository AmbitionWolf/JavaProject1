/*
8.��д����ʵ���������ݣ�if���ʵ��
���Գɼ��ֵȼ���
	90~100	A�ȡ�
	80-89	B�ȡ�
	70-79	C�ȡ�
	60-69	D�ȡ�
	60����	E�ȡ�
����ݸ����ɼ��������Ӧ�ĵȼ���
*/
import java.util.Scanner;
class ScoreTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ɼ���");
		int score = sc.nextInt();
		if(score>100 || score<0){
			System.out.print("����ɼ�����");
		}else if(score>=90 && score<=100){
			System.out.println("A��");
		}else if(score>=80 && score<=89){
			System.out.println("B��");
		}else if(score>=70 && score<=79){
			System.out.println("C��");
		}else if(score>=60 && score<=69){
			System.out.println("D��");
		}else{
			System.out.println("E��");
		}
		
	}
}
