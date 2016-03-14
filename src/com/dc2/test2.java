package com.dc2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JList;

public class test2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test2 frame = new test2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(55, 63, 335, 208);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel.add(panel_1, "name_14885580754075");
		panel_1.setLayout(new GridLayout(0,1));
		
		JLabel lblKek_2 = new JLabel("kek");
		lblKek_2.setPreferredSize(new Dimension(200,200));
		panel_1.add(lblKek_2);
		
		JLabel lblKek_1 = new JLabel("kek");
		lblKek_1.setPreferredSize(new Dimension(200,200));
		panel_1.add(lblKek_1);
		
		JLabel lblKek = new JLabel("kek");
		lblKek.setPreferredSize(new Dimension(200,200));
		panel_1.add(lblKek);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel.add(panel_2, "name_14887901100099");
		panel_2.setLayout(new GridLayout(0,1));
	}
}
