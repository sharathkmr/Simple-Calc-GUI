package com.calc.gui.file.operations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

// class to handle file reading operation
// singleton class
public class Filereader {
	
	private static Filereader fileReader;
	
	private BufferedReader br;
	private LinkedList<String> history;
		
	private Filereader() throws FileNotFoundException {
		br=new BufferedReader(new FileReader(FileCreater.logFileName));
	}
	
	public LinkedList<String> read() throws IOException {
		
		String temp=br.readLine();
		
		if(history == null)
			history=new LinkedList<String>();
		else {
			history = null;
			history=new LinkedList<String>();
		}
		while(temp!=null)
		{
			history.add(temp);
			temp=br.readLine();
		}
		System.out.println(history);
		return history;
	}
	
	public static Filereader getInstance() {
		if(fileReader==null) {
			try {
				fileReader = new Filereader();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return fileReader;
	}
}
