/*
�����븸�෽������ͬ����ͨ��super.������()�����ʸ���
*/
class ExtendsTest2{
	public static void main(String[] args) {
		
		Sun s = new Sun();
		s.test();
		
	}
}

class Father{
	private String name;
	private int age;
	
	public Father(int age){
		System.out.println("���๹�췽����������");
	}
	
	public void show(){
		System.out.println("����show()������");
	}
}
class Sun extends Father{
	public void show(){
		System.out.println("����show()��������");
	}
	
	public Sun(){
		System.out.println("���๹�췽����������");
	}
	
	public void test(){
		//super.show();
		show();
	}
}