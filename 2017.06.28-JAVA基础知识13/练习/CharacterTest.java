package cn.lk;
/*
作者：刘凯
2017年6月28日
*/
public class CharacterTest {

	public static void main(String[] args) {
		/*	String s = “JKLhHKKjhkHKJHkgk*(n^*&6788)()9090JJLLJhbjkkljl”;
			统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
		 **/
		String s = "JKLhHKKjhkHKJHkgk*(n^*&6788)()9090JJLLJhbjkkljl";
		int lowerCount = 0;
		int upperCount = 0;
		int digitCount = 0;
		int other = 0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(Character.isUpperCase(ch[i])){
				upperCount++;
			}else if(Character.isLowerCase(ch[i])){
				lowerCount++;
			}else if(Character.isDigit(ch[i])){
				digitCount++;
			}else{
				other++;
			}
		}
		System.out.println(upperCount);
		System.out.println(lowerCount);
		System.out.println(digitCount);
		System.out.println(other);
		
		
		int z2 = 128;
		Integer z3 = 128;
		Integer z4 = 128;
		Integer z5 = new Integer(128);
		System.out.println(z2==z3);//true
		System.out.println(z3==z4);//false
		System.out.println(z2==z5);//true
		System.out.println(z3==z5);//false
		System.out.println(z4==z5);//false

	}

}
