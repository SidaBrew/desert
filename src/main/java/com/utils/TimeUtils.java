package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtils {

	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM");
	
	public static void main(String[] args) {
		
		System.out.println(TimeUtils.getDayMonth("2017/2")); 
		
	}
	
	// 根据年月获取天数 
	public static int getDayMonth(String yeardate) {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy/MM"); // 如果写成年月日的形式的话，要写小d，如："yyyy/MM/dd"
		try {
			rightNow.setTime(simpleDate.parse(yeardate)); // 要计算你想要的月份，改变这里即可
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int days = rightNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		return days;
	}

	// 根据年份月获取当月天数 
	public static int getDayOfMonth(int year, int month) {
		 Calendar calendar = Calendar.getInstance();
	     calendar.set(Calendar.YEAR, year - 1);
	     calendar.set(Calendar.MONTH, month);
	     return calendar.getActualMaximum(Calendar.DATE);
	}
	
	// String 转 Date
	public static Date strToDat(String sTime) {
		Date dTime = null;
		try {
			dTime = sdf.parse(sTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dTime;
	}
	//String 转data
	public static Date strToDat1(String sTime) {
		Date dTime = null;
		try {
			dTime = sdf1.parse(sTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dTime;
	}
	//String 转data
		public static Date strToDat2(String sTime) {
			Date dTime = null;
			try {
				dTime = sdf2.parse(sTime);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return dTime;
		}

	// Date 转 String
	public static String datToStr(Date dTime) {
		String sTime = null;
		try {
			sTime = sdf.format(dTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sTime;
	}

	// Long 转 Date
	public static Date lonToDat(Long lTime) {
		Date dTime = new Date(lTime);
		return dTime;
	}

	// String 转 Long
	public static Long datToLon(String dTime) throws Exception {
		Long lTime = sdf.parse(dTime).getTime();
		return lTime;
	}

	/**
	 * 
	* @Title: getLastTime
	* @Author victor 2016年2月17日
	* @Description: TODO(描述)
	* @param startTime 开始时间
	* @param afterTime 提前或者延后的月份数(正数后延，负数提前)
	* @return    
	* @return Date    
	* @throws
	 */
	public static Date getLastTime(Date startTime, int afterTime) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(startTime);
		cal.add(Calendar.MONTH, afterTime);
		return cal.getTime();
	}

	// 获取前改变n分钟后的时间，+为增加分钟，-为减小分钟
	public static Date getChangeTime(Date startTime, int afterTime) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(startTime);
		cal.add(Calendar.MINUTE, afterTime);
		return cal.getTime();
	}
	
	// 获取前改变n年后的时间，+为增加年，-为减年
		public static Date getChangeYearTime(Date startTime, int afterTime) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(startTime);
			cal.add(Calendar.YEAR, afterTime);
			return cal.getTime();
		}

	// 获取前改变n秒钟后的时间，+为增加秒，-为减小秒数
	public static Date getSecondTime(Date startTime, int afterTime) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(startTime);
		cal.add(Calendar.SECOND, afterTime);
		return cal.getTime();
	}
	
	//当前时间 + 天数  
	public static Date check(Date now,int n)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		cal.add(Calendar.DATE, n);//增加一天 
		return cal.getTime();
	}
	
	// 获取本月的第一天
	public static Date getFirstDay(Date now)
	{
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
		String first = sdf1.format(c.getTime());
		System.out.println("===============first:" + first);
		return c.getTime();
	}
	
	// 获取本月的最后一天
	public static Date getLastDay(Date now)
	{
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
		String last = sdf1.format(ca.getTime());
		System.out.println("===============last:" + last);
		return ca.getTime();
	}
	
	/**
	 * 判断两个时间的差
	 */
	public static String  DateGap(Date startDate, Date endDate){
		 long l=endDate.getTime()-startDate.getTime();
		 long day=l/(24*60*60*1000);
		 long hour=(l/(60*60*1000)-day*24);
		 long min=((l/(60*1000))-day*24*60-hour*60);
		 long s=(l/1000-day*24*60*60-hour*60*60-min*60);
		 String  time=day+"天"+hour+"小时"+min+"分"+s+"秒";
		return time;
		
	}
	public static long  timeGap(Date startDate, Date endDate){
		 long l=endDate.getTime()-startDate.getTime();
		 long day=l/(24*60*60*1000);
		return day;
		
	}
	public static Date  timestamp2DateTime( Long  timestamp ){
		Date  date=null; 
		SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		String d = format.format(timestamp);  
		try {
			date = format.parse(d);
			System.out.println(date.toString());
		} catch (ParseException e) {
		}
		return date;  
	}
	
	//改变传入的时间的年份  +为增加年，-为减小年
	public static Date setYearTime(Date startTime, int afterTime) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(startTime);
		cal.add(Calendar.YEAR, afterTime);
		return cal.getTime();
	}
	
}
