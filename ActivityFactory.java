package com.dc2;

import java.util.Calendar;

public class ActivityFactory 
{
	public static Activity createActivity(String name, String startTime, 
									  String dueTime, ActivityType type, 
								      Calendar date)
	{
		Calendar sTime, dTime;
		sTime = date;
		dTime = date;
		
		sTime.set(Calendar.HOUR_OF_DAY,Integer.parseInt(startTime.substring(0, 2)));
		sTime.set(Calendar.MINUTE, Integer.parseInt(startTime.substring(3, 5)));
		
		dTime.set(Calendar.HOUR_OF_DAY,Integer.parseInt(startTime.substring(0, 2)));
		dTime.set(Calendar.MINUTE, Integer.parseInt(startTime.substring(3, 5)));
		
		return(new Activity(name, sTime, dTime, type));
	}
}
