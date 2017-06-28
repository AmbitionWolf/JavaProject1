package cn.lk;

import java.util.Random;

/*
作者：刘凯
2017年6月28日
*/
public class RandomTest {

	public static void main(String[] args) {
		//题目：获取两个数之间的随机数
		int i = getRange(3, 5);
		System.out.println(i);
	}
	/**
	 * 获取两个数之间的随机数
	 * @param start	开始值
	 * @param end	结束值
	 * @return		返回的随机数
	 */
	public static int getRange(int start,int end){
		Random r = new Random();
		return start+r.nextInt(end-start+1);
	}

}
