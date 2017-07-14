package com.calc.gui.panel.actions;
import java.io.IOException;

import com.calc.gui.file.operations.FileCreater;
import com.calc.gui.math.ComplexCalcAct;
import com.calc.gui.panel.buttons.DetailsBPanel;
import com.calc.gui.utils.DateTime;
import com.calc.gui.window.NewJFrame;

// Actions of the detail panel
public class SimpleCalcAct {
	
		float result;
		
		DetailsBPanel detailsBPanel;
		ComplexCalcAct complexCalcAct;
		FileCreater fc;
		
		public SimpleCalcAct() {
			detailsBPanel=new DetailsBPanel();
			complexCalcAct=new ComplexCalcAct();
			
			try {
				fc=new FileCreater();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		public void b0ActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();
		//	jta1.setText(Integer.toString(b0));
			
			boolean b0 =detailsBPanel.b0.isSelected();
			
			if(b0=true)
			System.out.println("The Button 0 is Pressed - " +b0);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append(Integer.toString(0));
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void b1ActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();
			
			boolean b1 =detailsBPanel.b1.isSelected();
	
			if(b1=true)
				System.out.println("The Button 1 is Pressed - " +b1);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append(Integer.toString(1));
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void b2ActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();

			boolean b2 =detailsBPanel.b2.isSelected();
			if(b2=true)
				System.out.println("The Button 2 is Pressed - " +b2);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append(Integer.toString(2));
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void b3ActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();		
		
			boolean b3 =detailsBPanel.b3.isEnabled();
			if(b3=true)
				System.out.println("The Button 3 is Pressed - " +b3);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append(Integer.toString(3));
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void b4ActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();		
			
			boolean b4 =detailsBPanel.b4.isEnabled();
			if(b4=true)
				System.out.println("The Button 4 is Pressed - " +b4);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append(Integer.toString(4));
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void b5ActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();		
			
			boolean b5 =detailsBPanel.b5.isEnabled();
			if(b5=true)
				System.out.println("The Button 5 is Pressed - " +b5);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append(Integer.toString(5));
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void b6ActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();		
			
			boolean b6 =detailsBPanel.b6.isEnabled();
			if(b6=true)
				System.out.println("The Button 6 is Pressed - " +b6);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append(Integer.toString(6));
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void b7ActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();		
			
			boolean b7 =detailsBPanel.b7.isEnabled();
			if(b7=true)
				System.out.println("The Button 7 is Pressed - " +b7);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append(Integer.toString(7));
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void b8ActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();		
			
			boolean b8 =detailsBPanel.b3.isEnabled();
			if(b8=true)
				System.out.println("The Button 8 is Pressed - " +b8);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append(Integer.toString(8));
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void b9ActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();		
			
			boolean b9 =detailsBPanel.b9.isEnabled();
			if(b9=true)
				System.out.println("The Button 9 is Pressed - " +b9);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append(Integer.toString(9));
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void clearActionLis()
		{
			if(NewJFrame.jta1.getText()!=null)
			{
				NewJFrame.jta1.setText("");
			}
			System.out.println(NewJFrame.jta1.getText());
			System.out.println("******The Display Area is cleared******");
		}
		
		public void addActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();
		
			boolean bAdd =detailsBPanel.add.isEnabled();
			if(bAdd=true)
				System.out.println("The Button + is Pressed - " +bAdd);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append("+");
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void subActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();
			
			boolean bSub =detailsBPanel.sub.isEnabled();
			if(bSub=true)
				System.out.println("The Button - is Pressed - " +bSub);
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append("-");
			}

			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void mulActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();
			
			boolean bMul =detailsBPanel.mul.isEnabled();
			if(bMul=true)
			{
				System.out.println("The Button * is Pressed : "+bMul);
			}
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append("*");
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void divActionLis()
		{
			String strjta1=NewJFrame.jta1.getText();
			
			boolean bDiv =detailsBPanel.div.isEnabled();
			if(bDiv=true)
			{
				System.out.println("The Button / is Pressed : "+bDiv);
			}
			
			if(strjta1!=null)
			{
				NewJFrame.jta1.append("/");
			}
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
		}
		
		public void equalActionLis()
		{
			String expression_Calc=NewJFrame.jta1.getText();
			result=complexCalcAct.ComplexCalc(expression_Calc);
			NewJFrame.jta1.setText(NewJFrame.jta1.getText()+" = "+Float.toString(result));
			fc.addData(DateTime.getTimeStamp(), NewJFrame.jta1.getText());
			
		}
		
		public void pButActionLis()
		{
			boolean pBut =detailsBPanel.pBut.isSelected();
			if(pBut=true)
				System.out.println("The Parent Button is Pressed - " +pBut);
			
			String strjta2=NewJFrame.jta1.getText();
			System.out.println(strjta2);
			
			System.out.println("The Period is Appended");
		}
		
		
		public void cEActionLis()
		{
			boolean pBut =detailsBPanel.cE.isSelected();
			if(pBut=true)
				System.out.println("The Clear Digit Button is Pressed - " +pBut);
			
			String strjta2=NewJFrame.jta1.getText();
			String[] str=strjta2.split("");
			String s=str[strjta2.length()];
			
			int i=strjta2.lastIndexOf(s);
			String strjta3=strjta2.substring(0,i);
			
			NewJFrame.jta1.setText(strjta3);
			System.out.println("The last digit "+s+" is deleted");
		}
		
}
