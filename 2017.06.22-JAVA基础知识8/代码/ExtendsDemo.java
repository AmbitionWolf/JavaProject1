/*
��̬�����-->��������-->���췽��-->��ͨ�����
��̬�����ֻ����һ��
��ͨ�����ֻ���ڵ��÷���ʱ�ŵ���
*/
class ExtendsDemo{
	public static void main(String[] args) {
		new Test().show();
		new Test();
		
	}
}
class Test{
	{
		System.out.println("���ǹ�������");
	}
	static{
		System.out.println("���Ǿ�̬�����");
	}
	public Test(){
		System.out.println("���ǹ��췽��");
	}
	public void show(){
		System.out.println("show����");
		{
			System.out.println("������ͨ�����");
		}
	}
}