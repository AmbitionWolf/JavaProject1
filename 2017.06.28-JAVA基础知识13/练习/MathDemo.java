package cn.lk;
/*
作者：刘凯
2017年6月28日
*/
public class MathDemo {

	public static void main(String[] args) {
//		public static int abs(int a)-->获取整数的绝对值
		System.out.println(Math.abs(-123));
//		public static double ceil(double a)-->将参数向上取整
		System.out.println(Math.ceil(12.23));
//		public static double floor(double a)-->将参数向下取整
		System.out.println(Math.floor(12.34));
//		public static double pow(double a,double b)-->获取参数a的b次方
		System.out.println(Math.pow(2, 3));
//		public static double random()-->在0-1中随机获取一个小数
		System.out.println(Math.random());
//		public static int round(float a)-->将参数进行四舍五入
		System.out.println(Math.round(12.34));
//		public static double sqrt(double a)-->将参数进行开平方根
		System.out.println(Math.sqrt(16));
//		public static double rint(double a)-->返回最接近参数并等于某一整数的 double 值
		System.out.println(Math.rint(12.45));
	}

}
