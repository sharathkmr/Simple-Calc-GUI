package com.calc.gui.file.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import com.calc.gui.utils.DateTime;

/* NOTES
 *  1.  The main class cannot throw the exception implicitly
 *  	we need to declare another class explicitly to throw the exception
 * 
 * 
 * 
 * 
 */

// to create a file everytime you open
public class FileCreater {
	
	private PrintWriter pw;
	private File f;
	public static String logFileName;
	
	public FileCreater() throws IOException {
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
	

}
