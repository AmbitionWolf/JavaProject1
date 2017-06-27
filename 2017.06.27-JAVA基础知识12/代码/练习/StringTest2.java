package cn.lk;

/*
作者：刘凯
2017年6月27日
*/
public class StringTest2 {
	/*
	 * 	String s = “abcJJLKjlkJLKJ89HKJhhHJ789HJ889H”;
	 * 	课堂练习：
	 * 	 	1：遍历获取字符串中的每一个字符
	 * 		2：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
	 */
	public static void main(String[] args) {
		String s = "abcJJLKjlkJLKJsdf3489HKJhhHJ789HJ889H";
		int lowCount = 0;
		int upperCount = 0;
		int digitCount = 0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]<= 'Z' && ch[i] >= 'A'){
				upperCount++;
			}else if(ch[i] <= 'z' && ch[i] >= 'a'){
				lowCount++;
			}else if(ch[i] <= '9' && ch[i] >= '0'){
				digitCount++;
			}
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		System.out.println("大写字母个数："+upperCount);
		System.out.println("小写字母个数："+lowCount);
		System.out.println("数字字符个数："+digitCount);
		
	}

}
