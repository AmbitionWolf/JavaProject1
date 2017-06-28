package cn.edu360;
/*
 * Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。
 * 	public static int abs(int a)返回参数的绝对值
	public static double ceil(double a)返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数
	public static double floor(double a)返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数
	public static double pow(double a,double b)返回a的b次方
	public static double random()返回带正号的 double 值，该值大于等于 0.0 且小于 1.0
	public static int round(float a) 返回最接近参数的 int
	public static double sqrt(double a)把参数开平方根
 */
public class MathDemo {

	public static void main(String[] args) {
		//public static int abs(int a)返回参数的绝对值
		System.out.println(Math.abs(-100));
		
		//public static double ceil(double a)返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数
		double a = 12.1;
		System.out.println(Math.ceil(a));//13.0
		
		//public static double floor(double a)返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数
		System.out.println(Math.floor(a));//12.0
		
		//public static double pow(double a,double b)返回a的b次方
		System.out.println(Math.pow(2, 3));//8.0
		
		//public static double random()返回带正号的 double 值，该值大于等于 0.0 且小于 1.0
		System.out.println(Math.random());
		
		//public static int round(float a) 四舍五入
		System.out.println(Math.round(12.4));
		
		//public static double sqrt(double a)把参数开平方根
		System.out.println(Math.sqrt(64));//8.0
	}

}
