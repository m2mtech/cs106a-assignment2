/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */
import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL_VALUE = 0;
	
	public void run() {
		println("This program finds the largest and smallest numbers.");

		int value = readInt("? ");

		if (value == SENTINEL_VALUE) {
			println("No values have been entered.");
		} else {
			int smallest = value;
			int largest = value;
			while (true) {
				value = readInt("? ");
				if (value == SENTINEL_VALUE) break;
				if (smallest > value) smallest = value;
				else if (largest < value) largest = value;
			}
			println("smallest: " + smallest);
			println("largest: " + largest);
		}	
	}
	
}

