/*
дһ���࣬����������ƷItem����Ʒ�����������ԣ�
��Ʒid
��Ʒ����
��Ʒ����
*/
class Test3{
	public static void main(String[] args) {
		Item i = new Item(001,"�����뺣",23.9f);
		i.show();
	}
}
class Item{
	private int id;
	private String name;
	private float price;
	
	public Item(int id,String name,float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void show(){
		System.out.println("id="+id+",name="+name+",price="+price);
	}
}
