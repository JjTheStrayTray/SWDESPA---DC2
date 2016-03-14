package com.dc2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;
import javax.swing.border.Border;

public class DayContentView extends JPanel implements ContentView,MouseListener{
	
	private JPanel timeHeaderPanel;
	private JPanel activitySlots;
	private JPanel[] actList;
	
	public DayContentView(){
		super();
		timeHeaderPanel = new JPanel();
		activitySlots = new JPanel();
		
		init();
	}
	
	private void init(){
		timeHeaderPanel.setPreferredSize(new Dimension(100,1008));
		timeHeaderPanel.setLayout(new GridLayout(24, 1));
		initTimeHeader();
		this.add(timeHeaderPanel);
		activitySlots.setPreferredSize(new Dimension(430,1008));
		activitySlots.setLayout(new GridLayout(48, 1));
		initActivitySlots();
		setBackground(Color.LIGHT_GRAY);
		this.add(activitySlots);
	}
	
	private void initTimeHeader(){
		String time;
		for(int i=0;i<2400;i+=100){
			time=String.format("%04d",i);
			JLabel label = new JLabel(time.substring(0, 2)+":"+time.substring(2, 4));
			label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			timeHeaderPanel.add(label);
		}
	}
	
	private void initActivitySlots(){
		actList = new JPanel[48];
		for(int i=0;i<48;i++){
			Border border;
			actList[i] = new JPanel();
			if(i%2==0)
				border = BorderFactory.createMatteBorder(1, 0, 0, 0, Color.GRAY);
			else
				border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY);
			actList[i].setBorder(border);
			actList[i].setLayout(new GridLayout(0,1));
			actList[i].addMouseListener(this);
			
			activitySlots.add(actList[i]);
		}
		actList[5].add(new JLabel("ads"));
		actList[5].setBackground(Color.GREEN);
		actList[6].setBackground(Color.GREEN);
		actList[7].setBackground(Color.GREEN);
		actList[8].setBackground(Color.GREEN);
	}               

	public void updateView(Activity act){
		Calendar cal=act.getStartTime();
		int h=cal.get(Calendar.HOUR_OF_DAY);
		int m=cal.get(Calendar.MINUTE);
		int index1=h/2;
		if(m!=0)
			index1++;
		
		cal=act.getDueTime();
		h=cal.get(Calendar.HOUR_OF_DAY);
		m=cal.get(Calendar.MINUTE);
		int index2=h/2;
		if(m!=0)
			index2++;	
		for(int i=index1;i<=index2;i++){
			actList[i].removeAll();
			actList[i].setName(act.getName());
			actList[i].setBackground(act.getType().getColor());
		}
		actList[index1].add(new JLabel(act.getName()));
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		arg0.getSource().toString();
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
