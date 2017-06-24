/*
形式参数在不同环境的区别
*/
class Test{
	public static void main(String[] args){
		inter(new A());
		abstr(new B());
		f(new F2());
	}
	//接口
	public static void inter(Inter i){
		i.show();
	}
	//抽象类
	public static void abstr(F1 a){
		a.show();
	}
	//普通类
	public static void f(F2 f){
		f.show();
	}
}
interface Inter{
	void show();//public static abstract
}
class A implements Inter{
	public void show(){
		System.out.println("接口show");
	}
}
abstract class F1{
	public abstract void show();
}
class B extends F1{
	public void show(){
		System.out.println("抽象类show");
	}
}
class F2{
	public void show(){
		System.out.println("普通类show");
	}
}