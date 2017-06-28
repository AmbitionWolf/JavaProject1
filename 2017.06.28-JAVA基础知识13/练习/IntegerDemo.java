package cn.lk;

import java.util.Arrays;

/*
作者：刘凯
2017年6月28日
*/
public class IntegerDemo {

	public static void main(String[] args) {
		//Integer 类在对象中包装了一个基本类型 int 的值最常用的就是	int与string类型的转换
		
		//int->String]
		int i = 12;
		System.out.println(i+"");//方法一
		System.out.println(Integer.toString(i));//方法二
		
		//String->int
		String s = "123";
		Integer integer = new Integer(s);//方法一
		System.out.println(integer);
		int parseInt = Integer.parseInt(s);//方法二
		System.out.println(parseInt);
		
		/*
		 * 常用的基本进制转换
			public static String toBinaryString(int i)
			public static String toOctalString(int i)
			public static String toHexString(int i)
		 */
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toHexString(i));
		
		/*
		 * 十进制到其他进制
			public static String toString(int i,int radix)
			其他进制到十进制
			public static int parseInt(String s,int radix)
		 */
		System.out.println(Integer.toString(i,2));
		System.out.println(Integer.toString(i,8));
		System.out.println(Integer.toString(i,16));
		
		System.out.println(Integer.parseInt(Integer.toString(i,2),2));
		System.out.println(Integer.parseInt(Integer.toString(i,8),8));
		System.out.println(Integer.parseInt(Integer.toString(i,16),16));
	}

}
