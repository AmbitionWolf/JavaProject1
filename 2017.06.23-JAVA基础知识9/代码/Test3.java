/*
有一群动物，狮子，猴子，海豚，他们都有毛发的颜色，年龄属性，还都有睡觉和训练行为，现在需要对猴子爬树速度进行单独训练，
请用所学知识：分析，这个案例中有哪些抽象类，哪些接口，哪些具体类。

*/
abstract class Animal{
	private String color;
	private int age;
	
	public Animal(){
		
	}
	public Animal(String color,int age){
		this.color = color;
		this.age = age;
	}
	
	public void show(){
		System.out.println("color="+color+",age="+age);
	}
	
	public abstract void sleep();
	public abstract void train();
}
class Monkey extends Animal{
	public Monkey(){
		super("红色",12);
	}
	public void sleep(){
		System.out.println("猴子睡觉");
	}
	public void train(){
		System.out.println("猴子训练");
	}
}
class Test3{
	public static void main(String[] args){
		Animal a = new Monkey();
		a.show();
		a.train();
	}
}
