/** 
 * Pooja Patel
 * Class ID: M 3:05pm (11369)
 * Assignment 2
 * Description: this file acts like a calculator, performing addition, multiplication, and division
 */

package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method returns the total
	 * @param none
	 * @return total
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method adds a value to the total
	 * @param value - A value to be added to the total
	 * @return void
	 */
	
	public void add (int value) {
		total += value;
	}
	
	/**
	 * This method subtracts a value from the total
	 * @param value - A value to be subtracted from the total
	 * @return void
	 */
	
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * This method multiplies a value to the total
	 * @param value - A value to be multiplied to the total
	 * @return void
	 */
	
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * This method divides the total by the value
	 * @param value - the total is divided by this value
	 * @return void
	 */
	
	public void divide (int value) {
		if (value == 0) 
			total = 0;
		else 
			total = total / value;
	}
	
	/**
	 * This method returns the history
	 * @param none
	 * @return returns the string that contains the history
	 */
	
	public String getHistory () {
		return "";
	}
}