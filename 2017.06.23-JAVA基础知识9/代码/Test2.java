/*

*/
class Test2{
	public static void main(String[] args) {
		A a = new A();
		a.show();//我
		
		A b = new B();
		b.show();//是
		
		B c = new C();
		c.show();//神
	}
}
class A{
	public void show(){
		show2();
	}
	
	public void show2(){
		System.out.println("我");
	}
}
class B extends A {
	public void show2(){
		System.out.println("是");
	}
}
class C extends B {
	public void show(){
		super.show();
	}
	
	public void show2(){
		System.out.println("神");
	}
}


