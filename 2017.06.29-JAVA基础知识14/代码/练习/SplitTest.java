package cn.lk;

import java.util.Arrays;

/*
作者：刘凯
2017年6月29日
*/
public class SplitTest {
	/*
	 * 我有如下一个字符串:”19 89 76 3 65”
		请写代码实现最终输出结果是：”3 19 65 76 89
	 * */
	public static void main(String[] args) {
		String s = "19 89 76 3 65";
		String[] strings = s.split(" ");
		int[] int1 = new int[strings.length];
		for(int i=0;i<strings.length;i++){
			int1[i] = Integer.parseInt(strings[i]);
		}
		System.out.println(Arrays.toString(int1));
		Arrays.sort(int1);
		System.out.println(Arrays.toString(int1));
		for(int i=0;i<int1.length;i++){
			System.out.print(int1[i]+" ");
		}
		
	}

}
