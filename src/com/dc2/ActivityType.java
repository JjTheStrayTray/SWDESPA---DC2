package com.dc2;

import java.awt.Color;

public enum ActivityType {
	EVENT(Color.BLUE), TASK(Color.GREEN);
	
	private final Color color;
	
	ActivityType(Color color){
		this.color=color;
	}
	
	Color getColor(){
		return this.color;
	}
	
}
