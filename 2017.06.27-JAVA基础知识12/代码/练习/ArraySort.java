package cn.lk;
/*
作者：刘凯
2017年6月27日
*/
public class ArraySort {

	public static void main(String[] args) {
		int[] arr = {1,43,12,5,23,567,12,-8};
		show(arr);
		//maopaoSort(arr,false);
		selectSort(arr,false);
		show(arr);
	}
	
	/**
	 * 选择排序
	 * @param arr	要排序的数组
	 * @param b		false为升序，true为降序
	 */
	public static void selectSort(int[] arr, boolean b) {
		//遍历次数	-->数组长度减一                                     用到索引，指针开始为0
		for(int i=0;i<arr.length;i++){
			//比较次数 -->数组长度-遍历次数
			for(int j=i+1;j<arr.length;j++){
				if(b){
					if(arr[i]<arr[j]){
						swap(arr, i, j);
					}
				}else{
					if(arr[i]>arr[j]){
						swap(arr, i, j);
					}
				}
			}
		}
	}

	/**
	 * 冒泡排序
	 * @param arr	要排序的数组
	 * @param b		true为升序，false为降序
	 */
	public static void maopaoSort(int[] arr,boolean b) {
		//遍历数组，遍历次数-->数组长度减一
		for(int i=1;i<arr.length;i++){
			//比较次数-->数组长度－遍历次数
			for(int j=0;j<arr.length-i;j++){
				if(b){
					if(arr[j]>arr[j+1]){
						swap(arr, j, j+1);
					}
				}else{
					if(arr[j]<arr[j+1]){
						swap(arr, j, j+1);
					}
				}
			}
		}
	}
	
	/**
	 * 将数组中两个数据进行交换
	 * @param arr	要交换数据的数组
	 * @param i		索引一
	 * @param j		索引二
	 */
	public static void swap(int[] arr, int i,int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
	}
	
	/**
	 * 遍历数组，将数组格式化输出
	 * @param arr	要遍历的数组
	 */
	public static void show(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr.length==1){
				System.out.println("["+arr[i]+"]");
			}else if(i==arr.length-1){
				System.out.println(arr[i]+"]");
			}else if(i==0){
				System.out.print("["+arr[i]+",");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}

}
