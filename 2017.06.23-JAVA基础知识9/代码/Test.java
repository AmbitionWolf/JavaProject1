/*
多态成员方法必须继承父类
*/
class Test{
	public static void main(String[] args){
		Fu f = new Zi();
		//f.method();//method方法不是继承的
		f.show();
	}
}
class Fu{
	public void show(){
		System.out.println("fu show");
	}
}
class Zi extends Fu{
	public void show(){
		System.out.println("zi show");
	}

	public void method(){
		System.out.println("zi method");
	}
}

