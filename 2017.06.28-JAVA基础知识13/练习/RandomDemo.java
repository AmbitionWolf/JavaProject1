package cn.lk;

import java.util.Random;

/*
作者：刘凯
2017年6月28日
*/
public class RandomDemo {

	public static void main(String[] args) {
		/*
		 * Random类概述
			此类用于产生随机数
			如果用相同的种子创建两个 Random 实例，则对每个实例进行相同的方法调用序列
		 * */
		Random r = new Random(10);
		Random r2 = new Random(10);
		System.out.println(r.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r.nextInt());
		System.out.println(r2.nextInt());
		
	}

}
