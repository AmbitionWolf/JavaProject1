/*
��װһ��������
       ���Խ���һ���������������͵�����
       ���ؽ���������е�Ԫ��ƴ���������ַ���
*/
import java.util.Scanner;
class Test2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"������");
			arr[i] = sc.nextInt();
		}
		System.out.println("---------------------------------");
		System.out.println("ƴ�ӽ�����£�");
		showArray(arr);
		
	}
	
	public static void showArray(int[] arr){
		for(int j=0; j<arr.length; j++){
			if(arr.length==1){
				System.out.println("["+arr[j]+"]");
			}else if(j==0){
				System.out.print("["+arr[j]+",");
			}else if(j==arr.length-1){
				System.out.println(arr[j]+"]");
			}else{
				System.out.print(arr[j]+",");
			}
		}
	}
}
