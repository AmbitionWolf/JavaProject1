package cn.lk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
作者：刘凯
2017年6月29日
*/
public class PatternMatcherGainTest {

	public static void main(String[] args) {
		/*
		 * jin tian yao xia yu,da jia pa bu pa ?huang bu huang ?are you sure?
			获取由三个字符组成的单词
		 * */
		String s = "jin tian yao xia yu,da jia pa bu pa ?huang bu huang ?are you sure?";
		String regex = "\\b\\w{3}\\b";
		// 将给定的正则表达式编译到模式中
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while(m.find()){
			System.out.println(m.group());  
		}
	}

}
