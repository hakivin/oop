package datatype;

//Hakikid Amana
//M0517019
//Informatika UNS 2017

import java.util.*;
import java.math.BigInteger;
public class DataType {
	
	
	public static void main(String[] args) {
	
	//for scanning input
	 Scanner in = new Scanner(System.in);

	 System.out.println("Insert number : ");
	        // Ask for the number
	       String input = in.next();
	        try {
	            BigInteger number = new BigInteger(input);
	            System.out.println(input + " best be fitted in:");
	            //if the number is between Byte.MIN_VALUE and Byte.MAX_VALUE, then it best fitted in Byte
	            if(number.longValue() < Byte.MAX_VALUE && number.longValue() > Byte.MIN_VALUE)
	            {
	                System.out.println("byte");
	            }
	            //if the number is between Short.MIN_VALUE and Short.MAX_VALUE, then it best fitted in Short
	            else if(number.longValue() < Short.MAX_VALUE && number.longValue() > Short.MIN_VALUE)
	            {
	                System.out.println("short");
	            }
	            //if the number is between Integer.MIN_VALUE and Integer.MAX_VALUE, then it best fitted in Integer
	            else if(number.longValue() < Integer.MAX_VALUE && number.longValue() > Integer.MIN_VALUE)
	            {
	                System.out.println("int");
	            }
	            // If the longValueExact() returns a greater number than the long max value, then it throws an ArithmeticException
	            else if(number.longValueExact() < Long.MAX_VALUE && number.longValue() > Long.MIN_VALUE) 
	            {
	                System.out.println("long");
	            }
	        } 
	        catch(NumberFormatException e) //exception for input that is not a number
	        {	        	
	            System.out.println("input must be a number");
	        }
	        catch(ArithmeticException e) 
	        {
	        	System.out.println("BigInteger");
	        }
	    }	
}
