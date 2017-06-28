package cn.lk;

import java.math.BigDecimal;

/*
作者：刘凯
2017年6月28日
*/
public class BigDicemalDemo {
	//在计算float和double时会损失精度,用BigDecimal不会损失精度，一般用String参数表示
	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal("12");
		BigDecimal bd2 = new BigDecimal("5");
//		public BigDecimal add(BigDecimal augend)
		System.out.println(bd.add(bd2).toString());
//		public BigDecimal subtract(BigDecimal subtrahend)
		System.out.println(bd.subtract(bd2).toString());
//		public BigDecimal multiply(BigDecimal multiplicand)
		System.out.println(bd.multiply(bd2).toString());
//		public BigDecimal divide(BigDecimal divisor)
		System.out.println(bd.divide(bd2).toString());
//		public BigDecimal divide(BigDecimal divisor,int scale, int roundingMode)
//		divisor - 此 BigDecimal 要除以的值。
//		scale - 要返回的 BigDecimal 商的标度。
//		roundingMode - 要应用的舍入模式
		System.out.println(bd.divide(bd2, 3, BigDecimal.ROUND_HALF_UP).toString());

	}

}
