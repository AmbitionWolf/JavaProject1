/*
��װ��ϰ������һ��ѧ���࣬��������private���Σ���д��get��set����
*/
class StudentDemo{
	public static void main(String[] args) {
		Student s = new Student();
		//s.name = "����";
		//s.age = 21;
		//s.sno = 1414010349;
		s.setName("����");
		s.setAge(21);
		s.setSno(1414010349);
		System.out.println("age="+s.getAge()+",name="+s.getName()+",sno="+s.getSno());
		s.play("������ҫ");
		s.study("Python");
	}
}

class Student{
	//������ֻ��ͨ��
	private String name;
	private int age;
	private int sno;
	
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
