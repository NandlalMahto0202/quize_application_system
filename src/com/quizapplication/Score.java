package com.quizapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//JLabel

public class Score extends JFrame implements ActionListener
{
	Score(String name, int score)
	{
		setBounds(400, 150, 750, 550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("SCORE.png"));
		Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 200, 300, 250);
		add(image);
		
		
		JLabel heading = new JLabel("Thank you " + name + " for playing Simple Minds");
		heading.setBounds(45, 30, 700, 40);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 30));
		heading.setForeground(new Color(30, 144, 254));
		add(heading);
		
		JLabel lbsscore = new JLabel("Your score is : " + score);
		lbsscore.setBounds(350, 200, 300, 30);
		lbsscore.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbsscore.setForeground(new Color(30, 144, 254));
		add(lbsscore);
		
		
//		JButton exit = new JButton("Exit");
//		exit.setBounds(1100, 710, 200, 40);
//		exit.setFont(new Font("Tahoma", Font.PLAIN, 22));
//		exit.setBackground(new Color(30, 144, 254));
//		exit.setForeground(Color.WHITE);
//		exit.setEnabled(false);
//		exit.addActionListener(this);
//		add(exit);
		
		setVisible(true);
	}

	
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	public static void main(String[] args)
	{
		new Score("User", 0);
	}

}
