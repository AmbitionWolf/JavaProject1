/*
�Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�����long���ͣ�����main�����н��в���
*/
class EquilsTest{
	public static void main(String[] args) {
		byte a = 1,b = 2;
		equils(a,b);
		short x = 3,y = 3;
		equils(x,y);
		int m = 4,n = 5;
		equils(m,n);
		long i = 8,o = 8;
		equils(i,o);
	}
	
	public static void equils(byte a,byte b){
		if(a==b){
			System.out.println("�����������");
		}else{
			System.out.println("�������������");
		}
	}
	public static void equils(int a,int b){
		if(a==b){
			System.out.println("�����������");
		}else{
			System.out.println("�������������");
		}
	}
	public static void equils(short a,short b){
		if(a==b){
			System.out.println("�����������");
		}else{
			System.out.println("�������������");
		}
	}
	public static void equils(long a,long b){
		if(a==b){
			System.out.println("�����������");
		}else{
			System.out.println("�������������");
		}
	}
}
