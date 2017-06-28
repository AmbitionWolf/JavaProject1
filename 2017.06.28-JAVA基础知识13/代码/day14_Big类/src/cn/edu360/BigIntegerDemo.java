package cn.edu360;

import java.math.BigInteger;

/*
 * BigInteger可以接收超过int和long的值
 * BigInteger的范围是多大呢？
 * 	BigInteger内部有Integer.MAX_VALUE个数组，每个数组元素的范围是20多亿，20亿*20亿=4亿兆
 */
public class BigIntegerDemo {

	public static void main(String[] args) {
		//int i = Integer.MAX_VALUE;
		//System.out.println(i);//2147483647
		//int i = 2147483648;
		long i = 2147483648l;
		System.out.println(Long.MAX_VALUE);//9223372036854775807
		//i = 9223372036854775808l;
		
		BigInteger bi = new BigInteger("10");
		BigInteger bi2 = new BigInteger("2");
		
		//public BigInteger add(BigInteger val)加
		System.out.println(bi.add(bi2));//12
		
		//public BigInteger subtract(BigInteger val)减
		System.out.println(bi.subtract(bi2));//8
		
		//public BigInteger multiply(BigInteger val)乘
		System.out.println(bi.multiply(bi2));//20
		
		//public BigInteger divide(BigInteger val)除
		System.out.println(bi.divide(bi2));//5
		
		//public BigInteger[] divideAndRemainder(BigInteger val)两个 BigInteger 的数组：商 (this / val) 是初始元素，余数 (this % val) 是最终元素
		BigInteger[] divideAndRemainder = bi.divideAndRemainder(bi2);
		System.out.println("商："+divideAndRemainder[0]+",余数："+divideAndRemainder[1]);//商：5,余数：0
		
		//public String toString()此 BigInteger 的十进制字符串表示形式
		
	}

}
