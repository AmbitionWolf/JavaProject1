/*
�̳���ϰ
*/
class ExtendsTest{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sleep();
		System.out.println("name="+d.getName()+",age="+d.getAge());
		d.voice();
		System.out.println("----------------------------------");
		Cat c = new Cat();
		c.eat();
		c.sleep();
		System.out.println("name="+c.getName()+",age="+c.getAge());
		c.voice();
	}
}
class Animal{
	private String name;
	private int age;
	
	public void voice(){
		System.out.println("������");
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("���Թ�ͷ");
	}
	public void sleep(){
		System.out.println("��˯��");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("è��С��");
	}
	public void sleep(){
		System.out.println("è˯��");
	}
}
