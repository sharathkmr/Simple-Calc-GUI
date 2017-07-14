package com.calc.gui.file.operations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

// class to handle file reading operation
public class Filereader {
	
	private BufferedReader br;
	LinkedList<String> history;
		
	public Filereader() throws FileNotFoundException {
		
		
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
	

}
