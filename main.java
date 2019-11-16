/**
 * 
 */
package io.github.princessnorn;

//@author PrincessNorn
public class main {
	// Put variables here if they are used by a lot of methods
	static int globalExample;
	public static void main(String[] args) {
		// variable types
		// Non-floating point numbers:
		// (_ is ignored but can make a number more readable)
		byte byteNum=Byte.MAX_VALUE;
		short shortNum=Short.MAX_VALUE;
		int intNum=Integer.MAX_VALUE;
		long longNum=Long.MAX_VALUE;
		// Floating point numbers:
		double dblNum=12.34;
		float floatNum=12.34F; //needs the F at the end
		//Other variables:
		boolean bool=true; //can only be true/false
		char character='a';
		char ascii=97; //character variables can also use ascii values for a single character
		String sentence="Hewwo there :3"; 
		/* \n=new ling 
		 * \t=tab
		 * \" = " (won't affect code)*/
		
		System.out.println("Max Byte Value: " + byteNum);
		System.out.println("Max Short Value: " + shortNum);
		System.out.println("Max Integer Value: " + intNum);
		System.out.println("Max Long/Double Value: " + longNum);
		System.out.println("Max Float Value: " + Float.MAX_VALUE);
		System.out.println("\n\"" + character + "\" is the same as \"" + ascii + "\"");
	}

}
