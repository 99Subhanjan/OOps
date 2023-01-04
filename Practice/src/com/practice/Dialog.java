package com.practice;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Dialog {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "welcome");
		
		String name = JOptionPane.showInputDialog("Whats your Name?");
		
		JOptionPane.showMessageDialog(null,"Hello" + name);
		
		int num = JOptionPane.OK_CANCEL_OPTION;
	}
	
	

}
