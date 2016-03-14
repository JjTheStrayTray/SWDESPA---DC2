package com.dc2;

import java.util.Calendar;

public class Activity {
	private String name;
	private	Calendar startTime;
	private Calendar dueTime;
	private ActivityType type;
	private boolean isDone;
	
	public Activity(String name,Calendar startTime,Calendar dueTime,ActivityType type){
		this.name=name;
		this.startTime=startTime;
		this.dueTime=dueTime;
		this.type=type;
		this.isDone=false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getStartTime() {
		return startTime;
	}

	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}

	public Calendar getDueTime() {
		return dueTime;
	}

	public void setDueTime(Calendar dueTime) {
		this.dueTime = dueTime;
	}

	public ActivityType getType() {
		return type;
	}

	public void setType(ActivityType type) {
		this.type = type;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
}
