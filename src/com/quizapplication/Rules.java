package com.quizapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener
{
	String name;
	JButton back, next;
	
	Rules(String name)
	{
		this.name = name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("Welcome "+name +" to Simple Minds");
		heading.setBounds(50, 20, 700, 30);
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
		heading.setForeground(new Color(30, 144, 254));
		add(heading);
		
		JLabel rules = new JLabel("Welcome "+name +" to Simple Minds");
		rules.setBounds(40, 90, 700, 350);
		rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rules.setText(
				"<html>"+
					"1." +" Give answers in your own way." +"<br>"+"<br>"+
					"2." +" Each and Every questions having 1 marks." +"<br>"+"<br>"+
					"3." +" Time limitation having every questions." +"<br>"+"<br>"+
					"4." +"<br>"+"<br>"+
					"5." +"<br>"+"<br>"+
					"6." +"<br>"+"<br>"+
					"7." +"<br>"+"<br>"+
				"<html>"
				
				);
		add(rules);
		
		
		back = new JButton("Back");
		back.setBounds(250, 500, 100, 30);
		back.setBackground(new Color(30, 144, 254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		next = new JButton("Next");
		next.setBounds(400, 500, 100, 30);
		next.setBackground(new Color(30, 144, 254));
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		add(next);
		
		setSize(800, 650);
		setLocation(300, 150);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == next)
		{
			setVisible(false);
			new Quiz1(name);
		}
		else
		{
			setVisible(false);
			new Login();
		}
	}
	
	public static void main(String[] args)
	{
		new Rules("user");
	}
}
