package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args){
		int x = 0;
		System.out.println("************Try catch block************");
		try {
			System.out.println("Output is :"+x/0);
		}catch(ArithmeticException e) {				//child exception
			e.printStackTrace();					//priority of child is high than parent exception
			System.out.println("Invalid value");
		}catch (RuntimeException e) {						//parent exception
			e.printStackTrace();
			System.out.println("Invalid inputs");
		}catch (Exception e) {						//parent exception
			e.printStackTrace();
			System.out.println("Invalid input");
		}finally {
			System.out.println("This will get executed");
		}
		System.out.println();
		System.out.println("************Throws keyword************");
		
		try {
			getFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File is not found");
		}
	  			
		
		System.out.println();
		System.out.println("************User Defined Exception************");
		
		try {
			getUserDefinedExc();
		}catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		
		System.out.println();
		System.out.println("************Throw keyword************");
		
		getResult(13);
		
	}
	/**throws keyword*/
	public static void getFile() throws FileNotFoundException{
		FileReader file = new FileReader("output.txt");
		try {
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**throw keyword*/
	public static void getResult(int age)
	{
		if(age<18)
			throw new ArithmeticException("Age can not be less than 18");
		else
			System.out.println("End of program");
	}

	/**User Defined Exceptions
	 * @throws Exception 
	 * @throws UserDefinedException */
	public static void getUserDefinedExc() throws Exception, UserDefinedException
	{
		int x= 0;
		switch(x) {
		case 1: throw new RuntimeException();
		case 2: throw new ArithmeticException();
		case 3: throw new Exception();
		default: throw new UserDefinedException(x);
	}
	}
}
