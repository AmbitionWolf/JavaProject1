package cn.lk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
作者：刘凯
2017年6月28日
*/
public class DateDemo {

	public static void main(String[] args) throws Exception {
		//打印当前时间
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = sdf.format(date);
		System.out.println(s);
		
		sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		s = sdf.format(date);
		System.out.println(s);
		
		//解析时间
		String s1 = "2017年06月28日 16:56:35";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date date1 = sdf1.parse(s1);
		System.out.println(date1.toString());
		
		s1 = "17-6-28 下午5:00";
		sdf1 = new SimpleDateFormat();
		System.out.println(sdf1.parse(s1).toString());
	}

}
