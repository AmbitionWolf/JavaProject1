/*

*/
class Test3{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		sb.append(true).append("爱").append(123);
		sb.toString1();
	}
}
class StringBuffer{
	private String s = "";
	public StringBuffer append(Object obj){
		s += obj;
		return this;
	}
	public void toString1(){
		System.out.println(s);
	}
}