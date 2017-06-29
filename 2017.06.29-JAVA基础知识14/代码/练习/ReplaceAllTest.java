package cn.lk;
/*
作者：刘凯
2017年6月29日
*/
public class ReplaceAllTest {

	public static void main(String[] args) {
		/*
		 * public String replaceAll(String regex,String replacement)
			将敏感词替换成*
		 * */
		String s = "垃圾，笨蛋，白痴";
		String regex = "[(垃圾)(笨蛋)(白痴)]";
		System.out.println(s);
		String all = s.replaceAll(regex, "*");
		System.out.println(all);
	}

}
