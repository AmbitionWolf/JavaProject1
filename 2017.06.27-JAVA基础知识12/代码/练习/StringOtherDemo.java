package cn.lk;
/*
作者：刘凯
2017年6月27日
*/
public class StringOtherDemo {

	public static void main(String[] args) {
		/*替换功能
		String replace(char old,char new)--将旧字符替换为新字符
		String replace(String old,String new)--将旧字符串替换为新字符串
		**/
		//String replace(char old,char new)--将旧字符替换为新字符
		String s = "我的世界";
		String s1 = s.replace('我', '你');
		System.out.println(s);
		System.out.println(s1);
		
		//String replace(String old,String new)--将旧字符串替换为新字符串
		s1 = s.replace("世界", "家");
		System.out.println(s1);
		
		//String trim()--去除字符串首尾空格
		s = " 12 12 ";
		System.out.println(s.length());
		String trim = s.trim();
		System.out.println(trim.length());
		
		//int compareTo(String str)--如果参数字符串等于此字符串，则返回值 0；如果此字符串按字典顺序小于字符串参数，则返回一个小于 0 的值；
								   //如果此字符串按字典顺序大于字符串参数，则返回一个大于 0 的值。
		//int compareToIgnoreCase(String str)--忽略大小写比较
		s = "abc";
		s1 = "ABC";
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s1));

	}

}
