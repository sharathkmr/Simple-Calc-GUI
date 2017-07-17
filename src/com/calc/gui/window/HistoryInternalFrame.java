package com.calc.gui.window;

import java.io.IOException;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

import com.calc.gui.file.operations.Filereader;

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
	        logArea = new JTextArea();
	        logArea.setEditable(false);
	        add(logArea);
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
