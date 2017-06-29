package cn.lk;

import java.util.Scanner;

/*
作者：刘凯
2017年6月29日
*/
public class CheckPhone {

	public static void main(String[] args) {
		//校验电话号码格式
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入电话号码：");
		String s = sc.nextLine();
		String regex = "157\\d{8}";
		System.out.println(s.matches(regex));
		
		//校验邮箱
		System.out.println("请输入邮箱地址：");
		s = sc.nextLine();
		regex = "\\w+@\\w{2,}\\.com";
		System.out.println(s.matches(regex));
	}

}
