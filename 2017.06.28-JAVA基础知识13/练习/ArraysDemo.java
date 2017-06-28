package cn.lk;

import java.util.Arrays;

/*
作者：刘凯
2017年6月28日
*/
public class ArraysDemo {

	public static void main(String[] args) {
		//将int数组转换成字符串
		int[] in = {12,34,2,45};
		System.out.println(Arrays.toString(in));
		
		//数组的排序
		Arrays.sort(in);
		System.out.println(Arrays.toString(in));
		
		//数组的二分查找
		int i = Arrays.binarySearch(in, 12);
		System.out.println(i);
	}

}
