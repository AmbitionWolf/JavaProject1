/*

*/
class Test3{
	public static void main(String[] args) {
		
		B b = new B();
		A a = new A();
	}
}
class A{
	{
		System.out.println("���๹������");
	}
	static{
		System.out.println("���ྲ̬�����");
	}
	public A(){
		System.out.println("���๹�췽��");
	}
}

class B{
	{
		System.out.println("b���๹������");
	}
	static{
		System.out.println("b���ྲ̬�����");
	}
	public B(){
		System.out.println("b���๹�췽��");
	}
}

