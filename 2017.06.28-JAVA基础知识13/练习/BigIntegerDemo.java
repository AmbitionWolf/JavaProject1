package cn.lk;

import java.math.BigInteger;

/*
作者：刘凯
2017年6月28日
*/
public class BigIntegerDemo {
	public static void main(String[] args) {
		/*	BigInteger类概述
			可以让超过Integer范围内的数据进行运算
		 **/
		//BigInteger(String val) 将 BigInteger 的十进制字符串表示形式转换为 BigInteger
		BigInteger bi1 = new BigInteger("12");
		BigInteger bi2 = new BigInteger("5");
//		public BigInteger add(BigInteger val)
		System.out.println(bi1.add(bi2));
//		public BigInteger subtract(BigInteger val)
		System.out.println(bi1.subtract(bi2));
//		public BigInteger multiply(BigInteger val)
		System.out.println(bi1.multiply(bi2));
//		public BigInteger divide(BigInteger val)
		System.out.println(bi1.divide(bi2));
//		public BigInteger[] divideAndRemainder(BigInteger val)  返回包含 (this / val) 后跟 (this % val) 的两个 BigInteger 的数组
		//两个 BigInteger 的数组：商 (this / val) 是初始元素，余数 (this % val) 是最终元素。 
		BigInteger[] bt = bi1.divideAndRemainder(bi2);
		System.out.println("商为："+bt[0]+",余数为："+bt[1]);

	}
}
