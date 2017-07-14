package com.calc.gui.window;
import java.io.FileNotFoundException;

import javax.swing.JFrame;

// Main Frame
public class MainFrame {

	public static void main(String[] args) throws FileNotFoundException {
		
	
		NewJFrame frame1 =new NewJFrame("New Calc Demo");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println("The main Method Window : "+frame1.isActive());
		
	}
}