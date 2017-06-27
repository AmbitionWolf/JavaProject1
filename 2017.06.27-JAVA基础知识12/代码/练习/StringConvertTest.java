package cn.lk;
/*
作者：刘凯
2017年6月27日
*/
public class StringConvertTest {

	public static void main(String[] args) {
		//课堂练习：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
		String s = "asdfASDFE";
		String start = s.substring(0, 1);
		String end = s.substring(1);
		String str = start.toUpperCase()+end.toLowerCase();
		System.out.println(str);
	}

}
