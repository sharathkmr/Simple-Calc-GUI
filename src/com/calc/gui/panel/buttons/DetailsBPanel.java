package com.calc.gui.panel.buttons;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.calc.gui.panel.actions.SimpleCalcAct;
import com.calc.gui.window.MainWindow;

// JPanel to add the buttons
// Singleton class
public class ButtonsPanel extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static ButtonsPanel buttonPanel;
	private static SimpleCalcAct actionHandler = new SimpleCalcAct();
	
	public JButton b0=new JButton();
	public JButton b1=new JButton();
	public JButton b2=new JButton();
	public JButton b3=new JButton();
	public JButton b4=new JButton();
	public JButton b5=new JButton();
	public JButton b6=new JButton();
	public JButton b7=new JButton();
	public JButton b8=new JButton();
	public JButton b9=new JButton();
	
	public JButton add=new JButton();
	public JButton sub=new JButton();
	public JButton div=new JButton();
	public JButton mul=new JButton();
	public JButton equal=new JButton();
	public JButton clear=new JButton();
	public JButton pBut=new JButton();
	public JButton cE=new JButton();
	
	private static int count;
	
	private ButtonsPanel() {
		Dimension laySize=getPreferredSize();
		laySize=getPreferredSize();
		laySize.width=250;
		setLayout(new GridBagLayout());
		
		pBut.setSelected(false);
		
		GridBagConstraints gc=new GridBagConstraints();
		
		/*
		 * 					JPanel Area
		 * 		-------------------------------------
		 * 		|	x=0,x=1,x=2,x=3,x=4,....		|
		 * 		|y=0								|
		 * 		|y=1								|
		 * 		|y=2	GridBagLayout Coordinate	|
		 * 		|y=3		System					|
		 * 		|y=4								|
		 * 		|y=5								|
		 * 		|.									|
		 * 		|.									|
		 *		|. 									|
		 *		-------------------------------------
		 * 
		 */
		
		// Anchor is used to align the components
		gc.anchor = GridBagConstraints.LINE_START;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.fill=GridBagConstraints.BOTH;
		
		// wightx and weighty is used to specify the gap between the components
		gc.weightx=0.1;
		gc.weighty=0.1; 
		
		/* gridx and gridy are used to specify the
		 * 		postion of the component where it should be placed
		 * 
		 * add is used to add the components to panel
		 */
		
		gc.gridx=0;
		gc.gridy=0;
		b1.setText("1");
		add(b1,gc);
		b1.setPreferredSize(new Dimension());
		b1.setHideActionText(true);
		
		gc.gridx=0;
		gc.gridy=1;
		b4.setText("4");
		add(b4,gc);
		
		gc.gridx=0;
		gc.gridy=2;
		b7.setText("7");
		add(b7,gc);

		gc.gridx=1;
		gc.gridy=0;
		b2.setText("2");
		add(b2,gc);
		
		gc.gridx=1;
		gc.gridy=1;
		b5.setText("5");
		add(b5,gc);
		
		gc.gridx=1;
		gc.gridy=2;
		b8.setText("8");
		add(b8,gc);

		gc.gridx=1;
		gc.gridy=3;
		b0.setText("0");
		add(b0,gc);
		
		gc.gridx=2;
		gc.gridy=0;
		b3.setText("3");
		add(b3,gc);
		
		gc.gridx=2;
		gc.gridy=1;
		b6.setText("6");
		add(b6,gc);
		
		gc.gridx=2;
		gc.gridy=2;
		b9.setText("9");
		add(b9,gc);
		
		gc.gridx=2;
		gc.gridy=3;
		pBut.setText(".");
		add(pBut,gc);
		
		gc.gridx=3;
		gc.gridy=0;
		gc.gridheight=3;
		add.setText("+");
		add(add,gc);

		gc.gridx=4;
		gc.gridy=0;
		gc.gridheight=1;
		sub.setText("-");
		add(sub,gc);
		
		gc.gridx=4;
		gc.gridy=1;
		div.setText("/");
		add(div,gc);
		
		gc.gridx=4;
		gc.gridy=2;
		mul.setText("*");
		add(mul,gc);
		
		gc.gridx=3;
		gc.gridy=3;
		gc.gridwidth=2;
		equal.setText("=");
		add(equal,gc);
		
		gc.gridx=5;
		gc.gridy=0;
		clear.setText("Clear");
		add(clear,gc);
		
		gc.gridx=5;
		gc.gridy=1;
		cE.setText("CE");
		add(cE,gc);
		
		Font f=new Font("arial",Font.BOLD,25);
		b0.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		b6.setFont(f);
		b7.setFont(f);
		b8.setFont(f);
		b9.setFont(f);
		add.setFont(f);
		sub.setFont(f);
		mul.setFont(f);
		div.setFont(f);
		equal.setFont(f);
		clear.setFont(f);
		pBut.setFont(f);
		cE.setFont(f);
		
		// adding actionlisteners
		b0.setActionCommand("button0");
		b0.addActionListener(this);
		
		b1.setActionCommand("button1");
		b1.addActionListener(this);
		b2.setActionCommand("button2");
		b2.addActionListener(this);
		b3.setActionCommand("button3");
		b3.addActionListener(this);
		b4.setActionCommand("button4");
		b4.addActionListener(this);
		b5.setActionCommand("button5");
		b5.addActionListener(this);
		b6.setActionCommand("button6");
		b6.addActionListener(this);
		b7.setActionCommand("button7");
		b7.addActionListener(this);
		b8.setActionCommand("button8");
		b8.addActionListener(this);
		b9.setActionCommand("button9");
		b9.addActionListener(this);
		
		add.setActionCommand("buttonAdd");
		add.addActionListener(this);
		sub.setActionCommand("buttonSub");
		sub.addActionListener(this);
		mul.setActionCommand("buttonMul");
		mul.addActionListener(this);
		div.setActionCommand("buttonDiv");
		div.addActionListener(this);
		equal.setActionCommand("buttonEqual");
		equal.addActionListener(this);
		clear.setActionCommand("buttonClear");
		clear.addActionListener(this);
		pBut.setActionCommand("buttonPbut");
		pBut.addActionListener(this);
		cE.setActionCommand("buttonCE");
		cE.addActionListener(this);
		
		
		
		
	}
	
	public static ButtonsPanel getInstance() {
		if(buttonPanel == null) {
			buttonPanel = new ButtonsPanel();
			System.out.println("Buttons Panel (JPanel) Initialized");
		}
		return buttonPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("button0")) {
			System.out.println("Count : "+count);
			if(count>0){
	//			jta1.append("\n");
				MainWindow.jta1.setText("");
				count=0;
				MainWindow.jta1.append("0");
			}
			else{
				actionHandler.b0ActionLis();
			}
		} else if (e.getActionCommand().equals("button1")) {
			actionHandler.b1ActionLis();
		} else if (e.getActionCommand().equals("button2")) {
			actionHandler.b2ActionLis();
		} else if (e.getActionCommand().equals("button3")) {
			actionHandler.b3ActionLis();
		} else if (e.getActionCommand().equals("button4")) {
			actionHandler.b4ActionLis();
		} else if (e.getActionCommand().equals("button5")) {
			actionHandler.b5ActionLis();
		} else if (e.getActionCommand().equals("button6")) {
			actionHandler.b6ActionLis();
		} else if (e.getActionCommand().equals("button7")) {
			actionHandler.b7ActionLis();
		} else if (e.getActionCommand().equals("button8")) {
			actionHandler.b8ActionLis();
		} else if (e.getActionCommand().equals("button9")) {
			actionHandler.b9ActionLis();
		} else if (e.getActionCommand().equals("buttonAdd")) {
			actionHandler.addActionLis();
		} else if (e.getActionCommand().equals("buttonSub")) {
			actionHandler.subActionLis();
		} else if (e.getActionCommand().equals("buttonMul")) {
			actionHandler.mulActionLis();
		} else if (e.getActionCommand().equals("buttonDiv")) {
			actionHandler.divActionLis();
		} else if (e.getActionCommand().equals("buttonEqual")) {
			String strjta1=MainWindow.jta1.getText();
			System.out.println("Count value : "+count);
			
			try {
				if(count<0) { MainWindow.jta1.setText(""); }
				actionHandler.equalActionLis();
				count++;
			} catch(Exception ex)
			{
				System.out.println("*************ERROR**************");
				System.out.println(ex.getMessage());
			}
			
			if(strjta1.equals(""))
			{
				System.out.println("*********Error*******");
				JOptionPane.showMessageDialog(null, "Please Enter a valid expression","Error",JOptionPane.WARNING_MESSAGE);
			}
		} else if (e.getActionCommand().equals("buttonClear")) {
			actionHandler.clearActionLis();
		} else if (e.getActionCommand().equals("buttonPbut")) {
			actionHandler.pButActionLis();
		} else if (e.getActionCommand().equals("buttonCE")) {
			actionHandler.cEActionLis();
		}
		
	}

}
