/*
返回值类型在三种方式下的区别
*/
class Test2{
	public static void main(String[] args){
		getInter().show();
		getAbs().show();
		getC().show();
	}
	public static Inter2 getInter(){
		return new A();
	}
	public static Abs getAbs(){
		return new B();
	}
	public static C getC(){
		return new C();
	}
}
//接口
interface Inter2{
	void show();
}
class A implements Inter2{
	public void show(){
		System.out.println("接口show");
	}
}
abstract class Abs{
	public abstract void show();
}
class B extends Abs{
	public void show(){
		System.out.println("抽象类show");
	}
}
class C{
	public void show(){
		System.out.println("普通类show");
	}
}