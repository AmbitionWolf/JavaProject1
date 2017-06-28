package cn.lk;

import java.util.Arrays;

/*
作者：刘凯
2017年6月28日
*/
public class SystemDemo {

	public static void main(String[] args) {
		/*
		 * public static void gc()-->垃圾回收站
			public static void exit(int status)-->终止虚拟机运行
			public static long currentTimeMillis()-->显示从1970年开始到现在的毫秒数
			
			public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
			src - 源数组。
			srcPos - 源数组中的起始位置。
			dest - 目标数组。
			destPos - 目标数据中的起始位置。
			length - 要复制的数组元素的数量
		 * */
		int[] i = {1,2,3,4};
		int srcPos = 1;
		int[] i2 = new int[5];
		int destPos = 2;
		int length = 3;
		System.out.println(Arrays.toString(i));
		System.arraycopy(i, srcPos, i2, destPos, length);
		System.out.println(Arrays.toString(i2));
		//System.exit(0);
		System.out.println(System.currentTimeMillis());
	}

}
