package cn.lk;
/*
作者：刘凯
2017年6月27日
*/
public class StringConvertDemo {

	public static void main(String[] args) {
		String s = "我的世界";
		//byte[] getBytes()--将该字符串转换成字节数组
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length);
		
		//char[] toCharArray()--将该字符串转换为字符数组
		char[] charArray = s.toCharArray();
		System.out.println(charArray.length);
		
		//static String valueOf(char[] chs)--将字符数组转换成字符串
		System.out.println(s.valueOf(charArray));
		
		//static String valueOf(int i)--将一个int型整数转换成字符串
		System.out.println(s.valueOf(12));
		System.out.println("12");
		
		//String toLowerCase()--将字符串全部变成小写，不改变原来字符串
		s = "ASDwaerasAWSD";
		System.out.println(s);
		System.out.println(s.toLowerCase());
		
		//String toUpperCase()--将字符串全部变成大写，不改变原来字符串
		System.out.println(s);
		System.out.println(s.toUpperCase());
		
		//String concat(String str)--将该字符串与参数字符产拼接
		System.out.println(s+",你好");
		System.out.println(s.concat(",你好"));

	}

}
