/*
成员访问特点
	成员变量
		编译看左边，运行看左边
	成员方法
		编译看左边，运行看右边
	静态方法
		编译看左边，运行看左边
		所以前面我说静态方法不能算方法的重写
*/
class DuoTaiTest{
	public static void main(String[] args){
		Bus b = new X();
		System.out.println(b.price);
		b.test();
		b.show();
		
	}
}
class Bus{
	public int price = 10;
	public void show(){
		System.out.println("bus show");
	}
	public static void test(){
		System.out.println("bus test");
	}
}
class X extends Bus{
	public int price = 20;
	public void show(){
		System.out.println("X show");
	}
	public static void test(){
		System.out.println("X test");
	}
}