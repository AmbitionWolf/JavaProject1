package cn.edu360;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
	public static void main(String[] args) {
		/*
		 * jin tian yao xia yu,da jia pa bu pa ?huang bu huang ?are you sure?
		 * 获取由三个字符组成的单词
		 */
		String regex = "\\b[a-zA-Z]{3}\\b";
		String input = "jin tian yao xia yu,da jia pa bu pa ?huang bu huang ?are you sure?";
		// public static Pattern compile(String regex)将给定的正则表达式编译到模式中
		Pattern p = Pattern.compile(regex);
		// public Matcher matcher(CharSequence input)创建匹配给定输入与此模式的匹配器
		Matcher m = p.matcher(input);
		/*
		 * //public boolean find()尝试查找与该模式匹配的输入序列的下一个子序列 boolean b = m.find();
		 * //public String group()返回由以前匹配操作所匹配的输入子序列
		 * System.out.println(m.group());
		 */

		while (m.find()) {
			System.out.println(m.group());
		}
		// System.out.println(m.group());//No match
		// found：必须先调用find方法找到值才能调用group方法返回

		/*
		 * String regex = "a*b"; String input = "aaaaab";
		 * System.out.println(input.matches(regex));
		 * 
		 * //Pattern和Matcher也可以做匹配功能但是毕竟麻烦 Pattern p = Pattern.compile(regex);
		 * Matcher m = p.matcher(input); //方法尝试将整个输入序列与该模式匹配 boolean b =
		 * m.matches(); System.out.println(b);
		 */
	}
}
