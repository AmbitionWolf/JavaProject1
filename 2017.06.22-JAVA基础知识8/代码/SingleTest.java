/*
�������ģʽ
*/
class SingleTest{
	public static void main(String[] args) {
		SingleInstence s = SingleInstence.getInstence();
		SingleInstence s1 = SingleInstence.getInstence();
		System.out.println(s);
		System.out.println(s1);
		
	}
}
class SingleInstence{
	
	//����ʽ
	//����˽�л����캯��
	private SingleInstence(){
		
	}
	//����һ��˽�еģ���̬�Ķ���
	private static SingleInstence instence;
	//����һ�������ķ��������ض��������ж϶����Ƿ�Ϊ�գ���Ϊ�գ��򴴽����󣬷���ֱ�ӷ���
	public static SingleInstence getInstence(){
		if(instence == null){
			instence = new SingleInstence();
		}
		return instence;
	}
	
	
	/*//��ʽ
	//����˽�л����캯��
	private SingleInstence(){
		
	}
	//����һ��˽�еģ���̬�ģ����յĶ���
	private static final SingleInstence instence = new SingleInstence();
	//�����������������ض���
	public static SingleInstence getInstence(){
		return instence;
	}*/
}
