package cn.edu360;

public class IntegerDemo2 {

	public static void main(String[] args) {
		int i = 50;
		// 常用的基本进制转换
		// public static String toBinaryString(int i)
		System.out.println(Integer.toBinaryString(i));//110010
		// public static String toOctalString(int i)
		System.out.println(Integer.toOctalString(i));//62
		// public static String toHexString(int i)
		System.out.println(Integer.toHexString(i));//32
		// 十进制到其他进制
		// public static String toString(int i,int radix)
		String binaryString = Integer.toString(i, 2);
		System.out.println(binaryString);
		String octalString = Integer.toString(i, 8);
		System.out.println(octalString);
		String hexString = Integer.toString(i, 16);
		System.out.println(hexString);
		// 其他进制到十进制
		// public static int parseInt(String s,int radix)
		System.out.println(Integer.parseInt(binaryString, 2));//50
		System.out.println(Integer.parseInt(octalString, 8));//50
		System.out.println(Integer.parseInt(hexString, 16));//50
	}

}
