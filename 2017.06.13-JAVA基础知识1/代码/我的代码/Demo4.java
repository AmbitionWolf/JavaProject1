//ǿ������ת����ϰ
class Demo4{
	public static void main(String[] args){
		byte a1 = 3,a2 = 4,b;
		b = (byte)(a1 + a2);
		System.out.println(b);
		b = 3 + 4;
		System.out.println(b);
		double d = 12.345;
		float f = (float)d;//�����ݵ�����: ��doubleת����float���ܻ�����ʧ
		System.out.println(f);
		float f1 = (float)12.345;//ǿ��ת��Ϊfloat
		float f2 = 12.345f;//ֱ�Ӷ���Ϊfloat
		System.out.println(f2);
		double l = 12345.923;
		long d1 = (long)l;//��ֱ�ӽ�С����������
		System.out.println(d1);
		
		//byte by = 130;// ��intת����byte���ܻ�����ʧ
		//byte by = (byte)130;// -126
		/*
			���룺00000000 00000000 00000000 10000010
			��ȡ��10000010
			���룺10000001
			ԭ�룺11111110   ->  -126
		*/
		int by = 130;// 130
		System.out.println(by);
		
		char ch = 'w';
		int in = ch; //119
		System.out.println(in);
		
		int in1 = 143; //119
		//char ch1 = in1;//��intת����char���ܻ�����ʧ
		char ch1 = (char)in1;//  ?  
		System.out.println(ch1);
		
		
	}
}