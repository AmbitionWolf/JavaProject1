package cn.lk;

/*
作者：刘凯
2017年6月27日
*/
public class StringBufferDemo {

	public static void main(String[] args) {
		/*
		 * 添加功能 
		 * public StringBuffer append(String str) 
		 * public StringBuffer insert(int offset,String str)
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("我").append("的").append("世界");
		System.out.println(sb);

		sb.insert(3, "123");// int整数指的的偏移量
		System.out.println(sb);

		/*
		 * 删除功能 
		 * public StringBuffer deleteCharAt(int index) 
		 * public StringBuffer lete(int start,int end)
		 */
		sb.deleteCharAt(2);
		System.out.println(sb);//下标
		
		sb.delete(2, 5);
		System.out.println(sb);//下标
		
		/*
		 * 替换功能
				public StringBuffer replace(int start,int end,String str)
		 **/
		sb.replace(2,3, "中国");
		System.out.println(sb);
		
		/*
		 * 反转功能	 
				public StringBuffer reverse()
		 **/
		StringBuffer s = sb.reverse();
		System.out.println(s);
		/*
		 * 截取功能
				public String substring(int start)
				public String substring(int start,int end)
		 **/
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,3));
		
		
	}

}
