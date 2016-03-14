package com.dc2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;

import com.alee.extended.date.DateCustomizer;
import com.alee.extended.date.WebCalendar;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.button.WebToggleButton;

public class test extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel cardPanel;
	private ContentView dayView;
	private ContentView agendaView;
	private JButton dayBtn;
	private JButton agendaBtn;
	private WebCalendar webCal;
	private JScrollPane scroll;
	
	public test(){
		contentPane = new JPanel();
		cardPanel = new JPanel();
		dayView = new DayContentView();
		agendaView = new AgendaContentView();
		
		webCal = new WebCalendar();
		
		dayBtn = new JButton("Day");
		agendaBtn = new JButton("Agenda");
		scroll = new JScrollPane();
		init();	
	}
	
	private void init() {
		this.setBounds(0, 0, 900, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dayBtn.setBounds(650, 50, 100, 30);
		dayBtn.setActionCommand("day");
		dayBtn.addActionListener(this);
		contentPane.add(dayBtn);

		agendaBtn.setBounds(755, 50, 100, 30);
		agendaBtn.setActionCommand("agenda");
		agendaBtn.addActionListener(this);
		contentPane.add(agendaBtn);
		
		webCal.setBounds(30,100,250,250);
		webCal.setDateCustomizer(new DateCustomizer() {
			@Override
			public void customize(WebToggleButton arg0, Date arg1) {
				if(arg1.getTime()/10000==Calendar.getInstance().getTime().getTime()/10000){
					Calendar cal = GregorianCalendar.getInstance();
					cal.setTime(arg1);
					System.out.println(cal.get(Calendar.HOUR_OF_DAY));
					arg0.setSelected(true);
				}
			}
		});
		contentPane.add(webCal);
		
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(300, 100, 570, 450);
		contentPane.add(scroll);
		
		scroll.setViewportView(cardPanel);
		cardPanel.setLayout(new CardLayout(0, 0));
		
		
		cardPanel.add((Component)dayView,"day");
		cardPanel.add((Component)agendaView,"agenda");
		/*
		agendaView.add(new JLabel("kek"));
		agendaView.add(new JLabel("kek2"));
		agendaView.add(new JLabel("kek4"));
		agendaView.add(new JLabel("kek3"));
		agendaView.add(new JLabel("kek"));
		agendaView.add(new JLabel("kek2"));
		agendaView.add(new JLabel("kek4"));
		agendaView.add(new JLabel("kek3"));
		*/
	
	}
	
	public static void main(String[] args) {
		WebLookAndFeel.install();
		new test();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout) cardPanel.getLayout();
		cl.show(cardPanel, e.getActionCommand());
		System.out.println(e.getActionCommand());
		
	}

}
