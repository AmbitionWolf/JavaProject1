/*
��дһ���������ͻ�Customer���ͻ������������ԣ�
   �ͻ�����username
   �ͻ��ȼ����ȼ���ֵ�����ǡ�������ʯVIP��������׽�VIP������ͨ�ͻ�����
Ȼ����4�еĶ������username���Ըĳ��ÿͻ���������ʾ,������������4һ�£�����
   ����id
���������û����� Customer c;
   ��Ʒ����items�������д�ŵ��Ƕ����Ʒ����
   �����ܽ��amount�������ܽ��=��Ʒ�����и���Ʒ�۸���ܺͣ�  ����ʵ��Ӧ֧����payment���ı�֮ǰ�߼�����֮ǰ���ܽ����ۻ����ϣ����ݿͻ��ĵȼ��ٴ��ۣ����磺������ʯVIP����һ��8�ۣ�����׽�vip����һ��9�ۣ���ͨ�ͻ��������ۿۣ�
Ȼ��д����ģ�ⴴ��������Ʒ��һ��������Ȼ���ӡ������Ϣ����չ���󣺿���ͨ�����ö��������ϵ�һ���Զ��巽��ֱ�ӻ�ȡ�ö�����������Ʒ��
*/
class Test6{
	public static void main(String[] args) {
		
		Item[] i = new Item[3];
		i[0] = new Item(001,"Java",13.5f);
		i[1] = new Item(002,"C++",97.34f);
		i[2] = new Item(003,"Python",85.9f);
		
		Order o = new Order(1,new Customer("����","������ʯVIP"),i);
		float amount = o.amount(i);
		float payment = o.payment(amount);
		for(int j=0;j<o.getItems().length;j++){
			System.out.println("----------------------------------------");
			System.out.println("��Ʒ"+(j+1)+"ID��"+o.getItems()[j].getId());
			System.out.println("��Ʒ"+(j+1)+"���ƣ�"+o.getItems()[j].getName());
			System.out.println("��Ʒ"+(j+1)+"�۸�"+o.getItems()[j].getPrice());
		}
		System.out.println("----------------------------------------");
		System.out.println("�۸�������Ʒ��Ϣ���£�");
		System.out.println("��ƷID��"+o.maxPrice(i).getId());
		System.out.println("��Ʒ���ƣ�"+o.maxPrice(i).getName());
		System.out.println("��Ʒ�۸�"+o.maxPrice(i).getPrice());
		System.out.println("----------------------------------------");
		System.out.println("������ţ�"+o.getId());
		System.out.println("�û�����"+o.getCustomer().getUsername());
		System.out.println("����ȼ���"+o.getCustomer().getRank());
		System.out.println("�����ܽ�"+amount);
		System.out.println("����Ӧ����"+payment);
		
	}
}

//�ͻ�
class Customer{
	private String username;
	private String rank;
	
	public Customer(String username,String rank){
		this.username = username;
		this.rank = rank;
	}
	
	public String getUsername(){
		return username;
	}
	public String getRank(){
		return rank;
	}
	
}

//����
class Order{
	private int id;
	private Customer customer;
	private Item[] items;
	private float amount;
	private float payment;
	
	public Item[] getItems(){
		return items;
	}
	public int getId(){
		return id;
	}
	public Customer getCustomer(){
		return customer;
	}
	
	public Order(int id,Customer customer,Item[] items){
		this.id = id;
		this.customer = customer;
		this.items = items;
	}
	//�����ܽ��
	public float amount(Item[] items){
		float sum = 0.0f;
		for(int i=0;i<items.length;i++){
			sum += items[i].getPrice();
		}
		return sum;
	}
	//����Ӧ�����
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
		if(customer.getRank()=="������ʯVIP"){
			result *= 0.8;
		}else if(customer.getRank()=="����׽�VIP"){
			result *= 0.9;
		}
		return result;
	}
	
	//��ȡ�۸�������Ʒ
	public Item maxPrice(Item[] items){
		Item max = new Item();
		for(int i=0;i<items.length-1;i++){
			if(items[i].getPrice()>items[i+1].getPrice()){
				max = items[i];
			}else{
				max = items[i+1];
			}
		}
		return max;
	}
}
//��Ʒ
class Item{
	private int id;
	private String name;
	private float price;
	
	public Item(){}
	
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


