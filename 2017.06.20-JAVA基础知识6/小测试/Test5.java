/*
дһ������ģ������5����Ʒ���󣬱��磺
 ��Ʒ����1��
    id=��pdt_001��
    name = ��С��5sPlus��
    price = 1999.00

Ȼ��ģ������һ���������󣬱���
   ����1��
      id="order_001"
      username = "Զ��"
      items = [��Ʒ����1����Ʒ����2����Ʒ����3����Ʒ����4]
      amount = <����Ʒ�۸��ۼ�>
      payment = <������4�������Ĺ������>

Ȼ���ڳ����д�ӡ�ö�����������Ϣ��
*/
class Test5{
	public static void main(String[] args) {
		
		Item[] i = new Item[3];
		i[0] = new Item(001,"Java",13.5f);
		i[1] = new Item(002,"C++",57.34f);
		i[2] = new Item(003,"Python",85.9f);
		
		Order o = new Order(1,"����",i);
		float amount = o.amount(i);
		float payment = o.payment(amount);
		System.out.println("----------------------------------------");
		System.out.println("��Ʒ1ID��"+o.getItems()[0].getId());
		System.out.println("��Ʒ1���ƣ�"+o.getItems()[0].getName());
		System.out.println("��Ʒ1�۸�"+o.getItems()[0].getPrice());
		System.out.println("----------------------------------------");
		System.out.println("��Ʒ2ID��"+o.getItems()[1].getId());
		System.out.println("��Ʒ2���ƣ�"+o.getItems()[1].getName());
		System.out.println("��Ʒ2�۸�"+o.getItems()[1].getPrice());
		System.out.println("----------------------------------------");
		System.out.println("��Ʒ3ID��"+o.getItems()[2].getId());
		System.out.println("��Ʒ3���ƣ�"+o.getItems()[2].getName());
		System.out.println("��Ʒ3�۸�"+o.getItems()[2].getPrice());
		System.out.println("----------------------------------------");
		System.out.println("������ţ�"+o.getId());
		System.out.println("�û�����"+o.getUsername());
		System.out.println("�����ܽ�"+amount);
		System.out.println("����Ӧ����"+payment);
		
	}
}
//����
class Order{
	private int id;
	private String username;
	private Item[] items;
	private float amount;
	private float payment;
	
	public Item[] getItems(){
		return items;
	}
	public int getId(){
		return id;
	}
	public String getUsername(){
		return username;
	}
	
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

