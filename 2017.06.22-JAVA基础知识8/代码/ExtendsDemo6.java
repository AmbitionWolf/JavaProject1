/*
�̳����Ӹ����Ա�����Ĺ�ϵ��
	ͨ�����������÷����Ĳ���˳��
		���������෶Χ��
		���û���ҵ������ڸ��෶Χ��
		�����û���ҵ����ͱ���
��������д���������⸸��ķ�����ʱ����������Ҫʹ�ø���Ĺ���ʱ�����ǿ�����������дһ��һģһ���ķ��������Ƿ������������Լ�����
����������к͸�����һģһ���ķ���ʱ�����յ��õ��������Լ���
��д��ע�����
	������д�ķ����ķ���Ȩ�޲��ܱȸ���ĵ�
	�����޷���д�����е�˽�з���
	���������д�ķ����ڸ������Ǿ�̬�ģ���ô������д��ʱ��Ҳ���������Ǿ�̬��(û����д�����ԣ���̬����֤)
*/
class ExtendsDemo6{
	public static void main(String[] args){
		//new Son5().show();
	}
}
class Father5{
	private int age;
	public static void show(){
		System.out.println("����");
	}
	private void test(){
		System.out.println("test");
	}
}
class Son5 extends Father5{
	//�����ǵķ���Ϊstatic
	public static void show(){
		
	}
	/*���ڳ��Է�����͵ķ���Ȩ��; ��ǰΪpublic
	private void show(){
		System.out.println("�Ǻ�");
	}*/
	//�����޷��̳и����˽�з�������������д���൱�������Լ�������һ������
	private void test(){
		
	}
}