/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */
import acm.program.*;

public class Hailstone extends ConsoleProgram {
	
	public void run() {
		int steps = 0;
		int number = readInt("Enter a number: ");
		while (number != 1) {
			if (number % 2 == 1) {
				int temp = 3 * number + 1;
				println(number + " is odd, so I make 3n+1: " + temp);
				number = temp;
			} else {
				int temp = number / 2;
				println(number + " is even, so I take half: " + temp);
				number = temp;			
			}
			steps++;
		}
		println("The process took " + steps + " steps to reach 1.");
	}
	
}

