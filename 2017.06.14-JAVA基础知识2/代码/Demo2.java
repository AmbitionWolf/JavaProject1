//��ϰ��Ŀ�����
class Demo2{
	public static void main(String[] args){
		//��ȡ����long���������е����ֵ���������
		long a=12,b=23;
		long max1 = (a>b)?a:b;
		System.out.println("max1="+max1);
		
		//��ȡ����floatС���е����ֵ���������
		float c=12.12f,d=12.13f,o=12.14f;
		float max2 = (((c>d)?c:d)>o)?((c>d)?c:d):o;
		System.out.println("max2="+max2);
		
		//�Ƚ�����int�����Ƿ���ͬ���������
		int e=12,f=13;
		System.out.println("result="+(e==f));
	}
}