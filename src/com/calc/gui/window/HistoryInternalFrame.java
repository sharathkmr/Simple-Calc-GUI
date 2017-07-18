package com.calc.gui.window;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.calc.gui.file.operations.Filereader;

// Singleton class
public class HistoryInternalFrame extends JInternalFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 39689028305335614L;
	
	private static JTextArea logArea;
	private static Filereader fileReader;
	private static HistoryInternalFrame hisFrame;

	private HistoryInternalFrame() {
		super("History", 
	              true, //resizable
	              true, //closable
	              true, //maximizable
	              true);//iconifiable

	        //...Create the GUI and put it in the window...

	        //...Then set the window size or call pack...
	        setSize(300,300);
	        
	        // Text Area
	        logArea = new JTextArea();
	        logArea.setEditable(false);
	        
	        // scroll bar
	        // create a JPanel. add text area to the jpanel
	        // set content of the interalframe by passing the JPanel as reference
	        // to the JScrollPane
	        JPanel panel = new JPanel(new BorderLayout());
	        panel.add(logArea, BorderLayout.CENTER);
	        setContentPane(new JScrollPane(panel));
			System.out.println("History Frame created");
			
			fileReader = Filereader.getInstance();
	        
	}
	
	public static void readData() throws IOException {
		List<String> data = fileReader.read();
		for (String object : data) {
			 logArea.append(object+"\n");
		}
	}
	
	public static HistoryInternalFrame getInstance() {
		if(hisFrame == null)
			hisFrame = new HistoryInternalFrame();
		return hisFrame;
	}

}
