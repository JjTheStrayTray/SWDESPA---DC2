package com.dc2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;


public class AgendaContentView extends JPanel implements ContentView{
	public AgendaContentView(){
		super();
		this.setLayout(new GridLayout(0,1));
		setBackground(Color.LIGHT_GRAY);
	}
	
	public Component add(Component comp){
		
		comp.setPreferredSize(new Dimension(200,50)); //TODO: change this to fit with agendaview(move to updateView)
		
		return super.add(comp);
	}
	
	public void updateView(Activity act){
			//TODO: fill this up
	}
}
