/*
��׼���ֻ���(��ϰ)
Person s = new Person ();���ڴ���������Щ����?
����Person .class�ļ����ڴ�
��ջ�ڴ�Ϊs���ٿռ�
�ڶ��ڴ�Ϊ������󿪱ٿռ�
���������ĳ�Ա��������Ĭ�ϳ�ʼ��
���������ĳ�Ա����������ʾ��ʼ��
ͨ�����췽�����������ĳ�Ա������ֵ
��������ʼ����ϣ��Ѷ����ַ��ֵ��s����

*/
class PhoneTest{
	public static void main(String[] args) {
		Phone p = new Phone();
		p.setName("����");
		p.setPrice(4999.9f);
		p.show();
		Phone p1 = new Phone("ƻ��",6999.9f);
		p1.show();
		
	}
}

//����һ���ֻ���
class Phone{
	//����˽�л�����
	private String name;
	private float price;
	
	//���췽��
	public Phone(){}
	public Phone(String name,float price){
		this.name = name;
		this.price = price;
	}
	
	//get��set����
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	public float getPrice(){
		return price;
	}
	
	//��ʾ���
	public void show(){
		System.out.println("name="+name+",price="+price);
	}
}
