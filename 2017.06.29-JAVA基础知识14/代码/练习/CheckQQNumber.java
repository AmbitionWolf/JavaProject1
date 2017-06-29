package cn.lk;

import java.util.Scanner;

/*
作者：刘凯
2017年6月29日
*/
public class CheckQQNumber {
	/*
	 * 举例：校验QQ号码
		1.要求必须是5-15位数字
		2.不能以数字0不能开头
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入QQ号：");
		String s = sc.nextLine();
		if(regexCheck(s)){
			System.out.println("QQ号格式正确");
		}else{
			System.out.println("QQ号格式错误");
		}
		if(isTrue(s)){
			System.out.println("QQ号格式正确");
		}else{
			System.out.println("QQ号格式错误");
		}
	}

	private static boolean regexCheck(String s) {
		return s.matches("[1-9][0-9]{4,14}");
	}

	private static boolean isTrue(String s) {
		//判断字符串长度是否符合5-15位
		if(s.length()<=15 && s.length()>=5)
			//不能以数字0开头
			if(!s.startsWith("0")){
				for(int i=0;i<s.length();i++){
					char ch = s.charAt(i);
					if(!Character.isDigit(ch)){
						return false;
					}
				}
				return true;
			}
		return false;
	}

}
