package com.calc.gui.file.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import com.calc.gui.utils.DateTime;

// to create a log file everytime you open application
// singleton class
public class FileCreater {
	
	private static FileCreater fc;
	
	private PrintWriter pw;
	private File f;
	// to store filename
	public static String logFileName;
	
	private FileCreater() throws IOException {
		logFileName = "history "+DateTime.getDateTime()+".txt";
		f=new File(logFileName);
		
		if(!f.exists())
		{
			f.createNewFile();
			System.out.println("File Created - "+f.getName());
		}
		
		pw=new PrintWriter(new FileWriter(f));	
	}
	
	public void addData(String date, String data) {
		pw.println(date+" "+data);
		pw.flush();
		
	}
	
	public void clearData() {
		f.delete();
		try {
			f.createNewFile();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "File Error", "FileCreater Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static FileCreater getInstance() throws IOException {
		if(fc == null) {
			fc = new FileCreater();
		}
		return fc;
	}

}
