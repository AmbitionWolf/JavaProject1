/*
���췽����ϰ�����ָ�ֵ��ʽ��
*/
class StudentDemo2{
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		s.play("������ҫ");
		s.study("Python");
		//s.name = "����";
		//s.age = 21;
		//s.sno = 1414010349;
		//s.setName("����");
		//s.setAge(21);
		//s.setSno(1414010349);
		Student s1 = new Student("Jack",20,1414010349);
		s1.show();
		s1.play("������ҫ");
		s1.study("Python");
	}
}

class Student{
	//������ֻ��ͨ��
	private String name = "Tom";
	private int age = 21;
	private int sno = 123465;
	
	//�������췽��
	public Student(){}
	public Student(String name,int age,int sno){
		this.name = name;
		this.age = age;
		this.sno = sno;
	}
	
	public void show(){
		System.out.println("age="+age+",name="+name+",sno="+sno);
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
	
	public void setSno(int sno){
		this.sno = sno;
	}
	public int getSno(){
		return sno;
	}
	
	public void play(String gname){
		System.out.println(name+"��"+gname);
	}
	
	public void study(String cname){
		System.out.println(name+"��"+cname);
	}
}
