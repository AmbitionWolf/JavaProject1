package cn.lk;

import java.util.Scanner;

/*
作者：刘凯
2017年6月27日
*/
public class StringTest {

	public static void main(String[] args) {
		//字符串反转，例如键盘录入abc，输出cba
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		for(int start=0,end=ch.length-1;start<end;start++,end--){
			char temp = ' ';
			temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
		}
		String s1 = new String(ch);
		System.out.println(s1);
		
		//将字符串”axhhauububbuaa”中的字母”a,b”删除然后输出
		s = "axhhauububbuaa";
		String s2 = s.replace("a", "");
		String s3 = s2.replace("b", "");
		System.out.println(s);
		System.out.println(s3);
		
		//截取字符串”中国你最美，中中国你是我的祖国中”中的“中国”然后直接输出
		s = "中国你最美，中中国你是我的祖国中";
		String s4 = s.replace("中国", "");
		System.out.println(s4);
		
	}

}
