package com.khang.dmo;
import javax.swing.*;
public class hammain {

	public static void main(String[] args) {
		
		Contan f=new Contan();
		f.setTitle("Xin chào thế giới");
		
		JLabel  la1 =new JLabel("Hello  World");
		JButton  but1 = new JButton("Ấn vào đây");
	
		f.getContentPane().add(la1);
		f.getContentPane().add(but1);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setSize(300,100);
		f.setVisible(true);
		
	}

}
