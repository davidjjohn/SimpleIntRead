// Exciting program to read three integer values, a, b, and c,
// from System.in and then return the result of the
// computation (a+b)/c.  This program worries about proper inputs
// and possible computation errors.
//
// David John
// August 2020

// for testing:
//  2147483647   56   7
//  13  8  0


import java.util.Scanner;


public class Main {

	// class variable
    static Scanner keyboard;

    public static void main(String[] args) {

    	// Advertisement
		System.out.println("\nSuper Computation App (version 1, 2020)\n\n");

    	// local primitive variable declarations and initializations
    	int a=0, b=0, c=0;
        int result=0;

        // Instantiate keyboard as Scanner object associated with input
	    keyboard = new Scanner(System.in);

	    // Prompt and read for variables
		System.out.print("Enter integer values for <a>, <b>, <c>: ");
	    a = grabInt("a");
	    b = grabInt("b");
	    c = grabInt("c");

	    // compute result
	    result = (a+b)/c;

//		// Be super careful to make sure everything is ok and to report
//		// a proper error message
//
//		// first check a+b
//		try {
//			result = Math.addExact(a,b);
//		} catch (ArithmeticException e){
//			System.out.print("  Overflow on the addition of <"+a+"> ");
//			System.out.println("and <"+b+">");
//			System.exit(2);
//		}
//
//		// now worry about (a+b)/c
//		try {
//			result = result/c;
//		}catch (ArithmeticException e){
//			System.out.println("  Division by zero detected");
//			System.exit(3);
//		}

	    System.out.println("The value of (<a>+<b>)/<c> is: "+result);

	    return;

    }

    // method to encapsulate a safe reading on an integer from the keyboard object.
	// The name of the variable value to be read is passed as a parameter, which is used
	// only in case of an exception.
    static int grabInt(String vname){
    	int temp = 0;

    	// attempt to read int
		try {
			temp = keyboard.nextInt();
		}
		catch(Exception e){
			System.out.println("Error on input for integer variable <"+ vname + ">");
			System.out.println("You will need to rerun this program");
			System.exit(7);
		}

		return temp;
	}
}
