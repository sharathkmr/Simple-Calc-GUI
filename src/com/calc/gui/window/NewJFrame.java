package com.calc.gui.window;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import com.calc.gui.panel.actions.SimpleCalcAct;
import com.calc.gui.panel.buttons.DetailsBPanel;

// Frame which handles all details panel, menu bar, actions
public class NewJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static JTextArea jta1 =new JTextArea(1,3); //to set size of the JTextArea size we can pass the ROWS and COLUMNS number or size as parameter
	DetailsBPanel DetailsBPanel=new DetailsBPanel();
	SimpleCalcAct SimpleCalcAct=new SimpleCalcAct();
	JDialog jdialog=new JDialog();
	JMenuBar_Calc mb;
	static int count;
	
	public NewJFrame(String title) throws FileNotFoundException
	{
		final JFrame frame=new JFrame();
		mb=new JMenuBar_Calc();
		frame.setJMenuBar(mb.mb);
		frame.setTitle(title);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(800,400);
		frame.setLayout(new BorderLayout());
		frame.setBounds(225, 250, 800, 400);
		frame.add(jta1, BorderLayout.CENTER);
		frame.add(DetailsBPanel, BorderLayout.SOUTH);
		//frame.add(mb, BorderLayout.NORTH);
		
		
		System.out.println("The Frame Window is "+frame.isActive());
		
	//	jta1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Font f=new Font("arial",Font.BOLD,35);
		jta1.setFont(f);
		jta1.setEditable(true);
		
		frame.setVisible(true);
		DetailsBPanel.b0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Count : "+count);
				if(count>0){
		//			jta1.append("\n");
					jta1.setText("");
					count=0;
					jta1.append("0");
				}
				else{
					SimpleCalcAct.b0ActionLis();
				}
				
				
			}
		});
		
		DetailsBPanel.b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(count>0){
					//			jta1.append("\n");
								jta1.setText("");
								count=0;
								jta1.append("1");
							}
							else{
				SimpleCalcAct.b1ActionLis();
							}
			}
		});
		
		DetailsBPanel.b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.b2ActionLis();
			}
		});
		
		DetailsBPanel.b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.b3ActionLis();
			}
		});
		
		DetailsBPanel.b4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.b4ActionLis();
			}
		});
		
		DetailsBPanel.b5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.b5ActionLis();
			}
		});
		
		DetailsBPanel.b6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.b6ActionLis();
			}
		});
		
		DetailsBPanel.b7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.b7ActionLis();
			}
		});
		
		DetailsBPanel.b8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.b8ActionLis();
			}
		});
		
		DetailsBPanel.b9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.b9ActionLis();
			}
		});
		
		DetailsBPanel.add.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.addActionLis();
			}
		});
		
		DetailsBPanel.sub.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.subActionLis();
			}
		});
		
		DetailsBPanel.div.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.divActionLis();
			}
		});
		
		DetailsBPanel.mul.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.mulActionLis();
			}
		});
		
		DetailsBPanel.equal.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String strjta1=jta1.getText();
				System.out.println("Count value : "+count);
				
				try
				{
				if(count<0){
					jta1.setText("");
					
				}
					SimpleCalcAct.equalActionLis();
					count++;
				}
				catch(Exception e)
				{
					System.out.println("*************ERROR**************");
				}
				if(strjta1.equals(""))
				{
					System.out.println("*********Error*******");
					JOptionPane.showMessageDialog(frame, "Please Enter a valid expression","Error",JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		DetailsBPanel.clear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.clearActionLis();
			}
		});
		
		DetailsBPanel.pBut.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.pButActionLis();
			}
		});
		
		DetailsBPanel.cE.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SimpleCalcAct.cEActionLis();
			}
		});
	}
}
