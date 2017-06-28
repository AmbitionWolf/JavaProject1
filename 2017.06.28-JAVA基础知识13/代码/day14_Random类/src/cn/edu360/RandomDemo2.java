package cn.edu360;

import java.util.Random;

/*
 * 有一个区间：start-end
 * 现在想定义一个方法获取start-end之间的随机数
 */
public class RandomDemo2 {

	public static void main(String[] args) {
		/*
		 * start:2
		 * end:100
		 * 
		 * (end-start)=98
		 * start+nextInt(end-start+1);的取值范围：2-100
		 * 
		 */
		System.out.println(getRange(2, 5));
	}
	
	/**
	 * 获取start到end之间的随机数
	 * @param start	开始值
	 * @param end	结束值
	 * @return
	 */
	public static int getRange(int start,int end){
		Random r = new Random();
		return start+r.nextInt(end-start+1);
	}

}
