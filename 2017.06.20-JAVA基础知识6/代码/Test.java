/*
����һ����Demo,���ж���һ�����������ݺ͵ķ���������һ��������Test�����в���
*/
class Test{
	public static void main(String[] args) {
		Demo d = new Demo();
		int sum = d.sum(12,12);
		d.show(sum);
	}
}

class Demo{
	public int sum(int m,int n){
		return m+n;
	}
	
	public void show(int sum){
		System.out.println("sum="+sum);
	}
}
