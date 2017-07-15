package com.calc.gui.window;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import com.calc.gui.panel.buttons.ButtonsPanel;


public class MainWindow extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -911260366911494812L;
	
	private static JDesktopPane desktop;
	public static JTextArea jta1 =new JTextArea(1,3); //to set size of the JTextArea size we can pass the ROWS and COLUMNS number or size as parameter
	private static ButtonsPanel buttonPanel = ButtonsPanel.getInstance();
	
	public MainWindow() {
		
		int inset = 180;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(inset, inset,
                screenSize.width  - (int)Math.round(inset*3.4),
                screenSize.height - (int)Math.round(inset*2.4));
		setTitle("Simple Calc");
		setResizable(false);
        System.out.println("Height: "+getBounds().getHeight()+" Width: "+getBounds().getWidth());
        // setup GUI
        desktop = new JDesktopPane();
        desktop.setSize(screenSize.width  - (int)Math.round(inset*3),
                screenSize.height - inset*2);
        setContentPane(desktop);
        // setting font of textArea
        Font f=new Font("arial",Font.BOLD,35);
		jta1.setFont(f);
		jta1.setEditable(true);
		// setting layout and adding components
        desktop.setLayout(new BorderLayout());
        desktop.add(jta1, BorderLayout.CENTER);
		desktop.add(buttonPanel, BorderLayout.SOUTH);
		
        setJMenuBar(createMenuBar());
        System.out.println("Menu Bar Initialized");
        
        System.out.println("Desktop Pane Initialized");
		      
	}
	
	// Menu bar for JFrame
	protected JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        //Set up the lone menu.
        JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_D);
        menuBar.add(menu);

        //Set up the first menu item.
        JMenuItem menuItem = new JMenuItem("History");
        menuItem.setMnemonic(KeyEvent.VK_N);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_N, ActionEvent.ALT_MASK));
        menuItem.setActionCommand("history");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Set up the second menu item.
        menuItem = new JMenuItem("Quit");
        menuItem.setMnemonic(KeyEvent.VK_Q);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_Q, ActionEvent.ALT_MASK));
        menuItem.setActionCommand("quit");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        return menuBar;
    }

    //React to menu selections.
    public void actionPerformed(ActionEvent e) {
        if ("history".equals(e.getActionCommand())) { // history
        	createFrame();
        } else { //quit
            quit();
        }
    }
    
  //Create a history frame.
    protected void createFrame() {
        HistoryInternalFrame hisFrame = new HistoryInternalFrame();
        hisFrame.setVisible(true); //necessary as of 1.3
        try {
			HistoryInternalFrame.readData();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        desktop.add(hisFrame);
        try {
            hisFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }
    
  //Quit the application.
    protected void quit() {
        System.exit(0);
    }
    
    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
    	//JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        MainWindow frame = new MainWindow();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        System.out.println("Main Window (JFrame) Created");

        //Display the window.
        frame.setVisible(true);
    }
	
    
    public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}

}