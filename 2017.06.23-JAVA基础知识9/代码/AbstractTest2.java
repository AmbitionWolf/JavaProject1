/*
学生案例
	具体事务：基础班学员，大数据班学员
	共性：姓名，年龄，班级，学习，吃饭
*/
class AbstractTest2{
	public static void main(String[] args){
		show(new StudentL());
		show(new StudentP());
	}
	
	public static void show(Student s){
		s.study();
		s.eat();
		s.show();
	}
}

abstract class Student{
	private String name;
	private int age;
	private int cls;
	
	public Student(){
		
	}
	public Student(String name,int age,int cls){
		this.name = name;
		this.age = age;
		this.cls = cls;
	}
	
	public void show(){
		System.out.println("name="+name+",age="+age+",cls="+cls);
	}
	
	public abstract void study();
	public abstract void eat();
}
class StudentL extends Student{
	public StudentL(){
		super("Tom",10,001);
	}
	public void study(){
		System.out.println("Tom study");
	}
	public void eat(){
		System.out.println("Tom eat");
	}
}
class StudentP extends Student{
	public StudentP(){
		super("Pop",12,002);
	}
	public void study(){
		System.out.println("Pop study");
	}
	public void eat(){
		System.out.println("Pop eat");
	}
}

