package com.calc.gui.window;

import java.awt.Container;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.calc.gui.file.operations.Filereader;

// JFrame window which loads history from a file
// singleton class
public class History_JPanel extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2515749971534116874L;
	
	History_Panel hp;
	private static History_JPanel historyFrame;
	private static Filereader fr;
	private LinkedList<String> temp;
	
	private History_JPanel() throws FileNotFoundException {
		System.out.println("History panel Initialized");
		if(hp == null) {
			hp=History_Panel.getInstance();
		}
		
		Dimension d=getPreferredSize();
		d.width=500;
		d.height=700;
		
		hp.setSize(d);
		Container c=getContentPane();
		setSize(d);
		setDefaultCloseOperation(History_JPanel.HIDE_ON_CLOSE);
		
		c.add(hp);
		
		
	}
	
	public static History_JPanel getInstance() throws FileNotFoundException {
		if(historyFrame == null) {
			historyFrame = new History_JPanel();
		}
		return historyFrame;
	}
	
	public void readData() {
		try {
			fr=new Filereader();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			temp=fr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		remove(hp.hisArea);
		add(hp.hisArea);
		hp.revalidate();
		hp.hisArea.revalidate();
	//	add(read);
		ListIterator<String> lt=temp.listIterator();
		
		while(lt.hasNext())
		{
			
			hp.hisArea.append("\n"+lt.next());
		}
	}

}

// singleton class
class History_Panel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4127273485560540660L;
	
	JTextArea hisArea;
	JButton read;
	private static History_Panel hp;
	
	private History_Panel() {
		
		hisArea=new JTextArea();
		hisArea.setSize(500,700);
		hisArea.setEditable(false);
		
		read=new JButton("Read");
		System.out.println("History JPanel Object initialized");
		
	}
	
	public static History_Panel getInstance() {
		if(hp == null)
			hp = new History_Panel();
		return hp;
	}
	
}