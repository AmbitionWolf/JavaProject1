/*
дһ�������࣬���������û����ɵĶ���Order�����������������ԣ�
����id
�����������û���username
��Ʒ����items�������д�ŵ��Ƕ����Ʒ����
�����ܽ��amount�������õ�����ֱ�Ӹ�ֵ��Ӧ�����ڲ��Զ�����!!! �����ܽ��=��Ʒ�����и���Ʒ�۸���ܺͣ�
����ʵ��Ӧ֧����payment�������õ�����ֱ�Ӹ�ֵ��Ӧ�����ڲ��Զ�����!!!
       ʵ��Ӧ֧����ļ����߼���
       ��� �����ܽ�� ��[0-99] ֮�䣬��Ӧ֧����=�ܽ��
       ��� �����ܽ�� ��[100-199] ֮�䣬��Ӧ֧����=�ܽ��*0.9
       ��� �����ܽ�� ��[199-200] ֮�䣬��Ӧ֧����=�ܽ��*0.85
       ��� �����ܽ��  >200����Ӧ֧����=�ܽ��*0.8��
*/
class Test4{
	public static void main(String[] args) {
		
		Item[] i = new Item[3];
		i[0] = new Item(001,"Java",13.0f);
		i[1] = new Item(002,"C++",57.0f);
		i[2] = new Item(003,"Python",85.0f);
		
		Order o = new Order(1,"����",i);
		float amount = o.amount(i);
		float payment = o.payment(amount);
		System.out.println("amount="+amount+",payment="+payment);
		
	}
}
//����
class Order{
	private int id;
	private String username;
	private Item[] items;
	private float amount;
	private float payment;
	
	public Order(int id,String username,Item[] items){
		this.id = id;
		this.username = username;
		this.items = items;
	}
	
	public float amount(Item[] items){
		float sum = 0.0f;
		for(int i=0;i<items.length;i++){
			sum += items[i].getPrice();
		}
		return sum;
	}
	
	public float payment(float amount){
		float result = 0.0f;
		if(amount>0 && amount<100){
			result = amount;
		}else if(amount>=100 && amount<200){
			result = amount*0.9f;
		}else if(amount>=100 && amount<200){
			result = amount*0.85f;
		}else{
			result = amount*0.8f;
		}
		return result;
	}
}
//��Ʒ
class Item{
	private int id;
	private String name;
	private float price;
	
	public Item(int id,String name,float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(float price){
		if(price<1){
			System.out.println("������ļ۸�����");
		}
		this.price = price;
	}
	public float getPrice(){
		return price;
	}
	
	public void show(){
		System.out.println("id="+id+",name="+name+",price="+price);
	}
}
