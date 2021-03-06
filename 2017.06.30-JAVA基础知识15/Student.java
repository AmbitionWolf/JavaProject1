package cn.edu360;

public class Student {
	private String name;
	private int age;
	private char sex;
	public Student() {
	}
	public Student(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	/**
	 * 只需要传入食物的名字
	 * @param food	食物的名字
	 */
	public void eat(String food){
		System.out.println(name+"吃"+food);
	}
	/**
	 * 只需要传入睡觉的毫秒值
	 * @param time	睡觉的毫秒值
	 */
	public void sleep(long time){
		System.out.println(name+"睡"+time/1000/60/60+"小时");
	}
	
	/**
	 * 只需要传入学习的课程
	 * @param classes	学习的课程
	 */
	public void study(String classes){
		System.out.println(name+"学习的是"+classes);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}
