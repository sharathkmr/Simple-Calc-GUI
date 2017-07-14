package com.calc.gui.window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

// Menu bar
public class JMenuBar_Calc extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5132121645731280094L;
	
	JMenuBar mb;
	JMenu fileMenu;
	JMenuItem historyMenuItem;
	JMenuItem exit;
	History_JPanel hp;
	
	public JMenuBar_Calc() {
		
		
		mb=new JMenuBar();
		//add(mb);
		//this.setJMenuBar(mb);
		fileMenu=new JMenu("File");
		mb.add(fileMenu);
		fileMenu.setAlignmentY(1.0f);
		historyMenuItem=new JMenuItem("History");
		exit=new JMenuItem("Exit");
		fileMenu.add(historyMenuItem);
		fileMenu.add(exit);
		
		
		historyMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					hp=History_JPanel.getInstance();
					hp.readData();
					hp.revalidate();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				hp.setVisible(true);
			}
		});
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
