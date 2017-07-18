package com.calc.gui.math;
import java.util.LinkedList;
import java.util.List;

public class ComplexCalcAct {
	
	private static ComplexCalcAct complexCalc;
	
	public static float ComplexCalc(String input) {
		
		long startTime = System.currentTimeMillis();
		
		complexCalc = new ComplexCalcAct();
		
		float result=0;
		
		List<String> args=new LinkedList<String>(); // [+,-,*,/]
		args=complexCalc.operands(input);
		int[] operandsIndex=complexCalc.OperatorIndex(input);
		int noOfOperants=operandsIndex.length;
	//	int noOfOperands=args.size();
		List<String> operants=new LinkedList<String>(); // [125,1256,12,156,5689]
		operants=complexCalc.operators(input);
		System.out.println("operants: "+operants+" operands: "+args);
		
		while(noOfOperants>0)
		{
			
			if(operants.contains("/"))
			{
				result=complexCalc.complexCalcLogic(operants, args, result, "/", "division");
			}
			else if(operants.contains("*"))
			{
				result=complexCalc.complexCalcLogic(operants, args, result, "*", "multiplication");
			}
			else if(operants.contains("+"))
			{
				result=complexCalc.complexCalcLogic(operants, args, result, "+", "addition");
			}
			else if(operants.contains("-"))
			{
				result=complexCalc.complexCalcLogic(operants, args, result, "-", "subtraction");
			}
			noOfOperants--;
		}
		
		System.out.println("args: "+args+" operants: "+operants);
		long endTime = System.currentTimeMillis();
		System.out.println("Time Elapsed to calculate : "+startTime+" to "+endTime+" : "+(endTime-startTime)+" (ms)");
		return result;
		
	}
	
	public LinkedList<String> operands(String input) {
		int noOfOperator=OperatorNumbers(input);
		LinkedList<String> operands=new LinkedList<String>();
		int i=0;
		int currentIndex=0;
		int[] operantsIndex=OperatorIndex(input);
		int length=input.length();
		
		do
		{
			String temp = null;
			try {
				temp=input.substring(currentIndex, operantsIndex[i]);  // 4 9 14
				currentIndex=operantsIndex[i]+1;
			} catch (ArrayIndexOutOfBoundsException e) {
				temp=input.substring(operantsIndex[i-1]+1,length);
			}
			operands.add(temp);
			noOfOperator--;
			i++;
//			System.out.println("temp: "+temp+" noOfOperators: "+noOfOperator+" i: "+i+" currentIndex: "+currentIndex+" operands: "+operands);
		}while(noOfOperator>=0);
		
		return operands;
	}
	
	public int OperatorNumbers(String input_ON) {
		int no = 0;
		
		while(input_ON.contains("+")||input_ON.contains("-")||input_ON.contains("*")||input_ON.contains("/")) {
			int x=0;
			
			if(input_ON.contains("+"))
			{
				x=input_ON.indexOf('+');
			}
			else if(input_ON.contains("-"))
			{
				x=input_ON.indexOf('-');
			}
			else if(input_ON.contains("*"))
			{
				x=input_ON.indexOf('*');
			}
			else if(input_ON.contains("/"))
			{
				x=input_ON.indexOf('/');
			}
			
			int length=input_ON.length();
			String subInput=input_ON.substring(x+1, length);
			String preInput=input_ON.substring(0,x);
			subInput=" ".concat(subInput);
			input_ON=preInput.concat(subInput);
			
//			System.out.println("x: "+x+" length: "+length+" input: "+input_ON);
			no++;
		}
		return no;
	}
	
	public LinkedList<String> operators(String input) {
		String input_dup=input;
		LinkedList<String> operantsSorting=new LinkedList<String>();
		int[] operatorIndex=OperatorIndex(input);
		int operIter=0;
		
		while(operIter<operatorIndex.length) {
			int x=0;
			
			/*System.out.println(operIter);
			System.out.println("operIndex: "+operatorIndex[operIter]);
			System.out.println(input_dup.charAt(operatorIndex[operIter]));
			*/
			if(input.contains(Character.toString(input_dup.charAt(operatorIndex[operIter]))))
			{
				x=input.indexOf(input_dup.charAt(operatorIndex[operIter]));
			}
			
			int length=input.length();
			input=input.substring(x, length);
			length=input.length();
			operantsSorting.add(input.substring(0, 1));
			input=input.substring(1,length);
			
//			System.out.println("length: "+length+" input: "+input+" Operators: "+operantsSorting+" operIter: "+operIter);
			++operIter;
			
		}
		return operantsSorting;
	}
	
	public float complexCalcLogic(List<String> operants,List<String> operands,float result,String operant,String operation)
	{
		/* This method performs the bodmas operation 
		 * when the operation is done it replaces the operands in operands list
		 * and deletes the performed performed operator from operants
		 * and stores the result in operants
		 * 
		 */
		int index=operants.indexOf(operant);
		System.out.println("------Entered "+operation+"------");
		System.out.println("*****Before operation*****");
		System.out.println("Index: "+index+" result: "+result);
		System.out.println("args: "+operands+" operants: "+operants);
		float oper1=Float.parseFloat((operands.get(index)));
		float oper2=Float.parseFloat(operands.get(index+1));
		if(operation=="division") {
			result=oper1/oper2;
		}
		else if(operation=="multiplication")
		{
			result=oper1*oper2;
		}
		else if(operation=="addition")
		{
			result=oper1+oper2;
		}
		else if(operation=="subtraction")
		{
			result=oper1-oper2;
		}

		operants.remove(operant);
		operands.remove(operands.get(index));
		operands.remove(operands.get(index));
		operands.add(index, Float.toString(result));
		System.out.println("******After Operation*******");
		System.out.println("Index: "+index+" result: "+result);
		System.out.println("args: "+operands+" operants: "+operants);
		System.out.println("Result: "+operands.get(0));
		result=Float.parseFloat(operands.get(0));
		return result;
	}
	
	public int[] OperatorIndex(String input) {
		
		/* it calculates the operators index in a given string and stores in a integer array
		 * the operation occurs until the number of operators becomes 0
		 */
		
		int noOfOperators=OperatorNumbers(input);
		int[] operatorIndex=new int[noOfOperators];
		System.out.println("signs: "+noOfOperators);
		int i=0;
		
		
		while(noOfOperators>0)
		{
			int currentIndex=0;
			if(input.contains("/"))
			{
				/* it finds the current index of '/' in the string
				 * and then replaces the operator with space and the process goeson
				 * untill the input string is free from operators.
				 * 
				 * 
				 */
				currentIndex=input.indexOf('/',currentIndex);
				String subInput=input.substring(0,currentIndex);
				input=input.substring(currentIndex+1);
				subInput=subInput.concat(" ");
				subInput=subInput.concat(input);
				input=subInput;
			}
			else if(input.contains("*"))
			{
				currentIndex=input.indexOf('*',currentIndex);
				String subInput=input.substring(0,currentIndex);
				input=input.substring(currentIndex+1);
				subInput=subInput.concat(" ");
				subInput=subInput.concat(input);
				input=subInput;
			}
			else if(input.contains("+"))
			{
				currentIndex=input.indexOf('+',currentIndex);
				String subInput=input.substring(0,currentIndex);
				input=input.substring(currentIndex+1);
				subInput=subInput.concat(" ");
				subInput=subInput.concat(input);
				input=subInput;
			}
			else if(input.contains("-"))
			{
				currentIndex=input.indexOf('-',currentIndex);
				String subInput=input.substring(0,currentIndex);
				input=input.substring(currentIndex+1);
				subInput=subInput.concat(" ");
				subInput=subInput.concat(input);
				input=subInput;
			}
			
			if(currentIndex>0)
			{
				operatorIndex[i]=currentIndex;
			}
			currentIndex=currentIndex+1;		
			System.out.println("currentIndex: "+currentIndex+" operatorIndex: "+operatorIndex[i]+" input: "+input+" i: "+i);
			noOfOperators--;
			i++;
		}
		
		/* Ascending order sorting
		 * Where we every element in an array compares with the remaining elements
		 * and then if is greater, then the element gets interchanged
		 */
		
		int temp=0;
		for (int j=0;j<operatorIndex.length;j++) {
			for(int k=j+1;k<operatorIndex.length;k++) {
				if(operatorIndex[j]>operatorIndex[k]) {
					temp=operatorIndex[j];
					operatorIndex[j]=operatorIndex[k];
					operatorIndex[k]=temp;
				}
			}
			
				
		}
		
		return operatorIndex;
	}
}