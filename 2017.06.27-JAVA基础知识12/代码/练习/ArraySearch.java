package cn.lk;

import java.util.Scanner;

/*
作者：刘凯
2017年6月27日
*/
public class ArraySearch {

	public static void main(String[] args) {
		int[] arr = {21,23,65,3,67,346,2,1};
		ArraySort.show(arr);
		ArraySort.selectSort(arr, true);
		ArraySort.show(arr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要查找的数值：");
		int key = sc.nextInt();
		int result = binarySearch(arr, key);
		if(result<0){
			System.out.println("数组中没有你输入的数据!");
		}else{
			System.out.println("在数组中索引："+result);
		}
		
		
	}
	
	/**
	 * 二分查找
	 * @param arr 	要查找的数组
	 * @param key	要查找的数据
	 * @return		若为-1，则数组中没有这个数据，否则返回数据在数组中的结果
	 */
	public static int binarySearch(int[] arr,int key){
		//定义开始与结束的索引
		int start = 0;
		int end = arr.length-1;
		int middle = 0;
		//循环遍历数组，若start>end，则跳出循环
		while(start<=end){
			middle = (start+end)/2;
			if(key==arr[middle]){
				return middle;
			}else if(arr[0]-arr[arr.length-1]<=0){//对于升序，若key<middle，end = middle-1；否则，start = middle+1;
				if(key<arr[middle]){
					end = middle-1;
				}else{
					start = middle+1;
				}
			}else{//降序
				//对于降序，若key>middle，end = middle-1；否则，start = middle+1;
				if(key>arr[middle]){
					end = middle-1;
				}else{
					start = middle+1;
				}
			}
		}
		return -1;
	}
	
	/**
	 * 普通查找
	 * @param arr 	要查找的数组
	 * @param key	要查找的数据
	 * @return		若为-1，则数组中没有这个数据，否则返回数据在数组中的结果
	 */
	public static int generalSearch(int[] arr,int key){
		for(int i=0;i<arr.length;i++){
			if(key==arr[i]){
				return i;
			}
		}
		return -1;
	}

}
