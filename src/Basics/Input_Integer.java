package Basics;

import java.util.Scanner;

public class Input_Integer {
/*  Major Differences between Scanner and BufferedReader Class in Java
 * 
    BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with multiple threads.
    BufferedReader has a significantly larger buffer memory than Scanner.
    The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), 
    but it's more than enough.
    BufferedReader is a bit faster as compared to scanner because the scanner does the parsing of input 
    data and BufferedReader simply reads a sequence of characters.
 
 */
	
	
	
	
	public static void main(String[] args) {
		System.out.println("hi");
		
		Scanner sc=new Scanner (System.in);
		String name=sc.nextLine();
		char ch=sc.next().charAt(0);
		
		int age =sc.nextInt();
		
		long mobile=sc.nextLong();
		double cgpa=sc.nextDouble();
		
	 System.out.println("name "+name);
	 System.out.println("character "+ch);
	 System.out.println("age "+age);
	 System.out.println("mobile "+mobile);
	 System.out.println("cgpa "+cgpa);
	 
		
		
		
		

	}

}
