/*

*/
class AbstractTest{
	public static void main(String[] args){
		//Father是抽象的; 无法实例化
		Father f = new Son();
		f.show();
	}
}
abstract class Father{
	public int age;
	public abstract void show();
}
class Son extends Father{
	public void show(){
		System.out.println("show");
	}
}