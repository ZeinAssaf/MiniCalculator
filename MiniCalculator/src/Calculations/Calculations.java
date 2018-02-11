    /*
      MiniCalculator is a simple fully functional calculator that calculates when it's the time to calculate
    Copyright (C) <2018>  <Muhammad Assaf>
    * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
    */
package Calculations;

import java.util.ArrayList;

public class Calculations {

	public ArrayList<Integer> numbers;
	private String operationType;
	
	//A method to set the operation
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	
	//Constructor
	public Calculations(ArrayList<Integer>numbers) {
		this.numbers=numbers;
	}
	
	//Doing the sum operation
	public int add() {
		int result=0;
		for (int numberInTheArrayList : numbers) {
			result+=numberInTheArrayList;
		}
		numbers.clear();
		return result;
		
	}
	
	//Doing the subtraction
	public int subtract() {
		int result=0;
		for (int i=0;i<numbers.size()-1;i++) {
			result=numbers.get(i)-numbers.get(i+1);
		}
		numbers.clear();
		return result;
	}
	//Doing the multiplication
	public int multiply() {
		int result=0;
		for (int i=0;i<numbers.size()-1;i++) {
			result=numbers.get(i)*numbers.get(i+1);
		}
		numbers.clear();
		return result;
	}
	//Doing the division
	public int divide() {
		int result=0;
		for (int i=0;i<numbers.size()-1;i++) {
			result=numbers.get(i)/numbers.get(i+1);
		}
		numbers.clear();
		return result;
	}
	
	// This method will call the proper function of calculation 
	public int doOperation() {
		switch (operationType) {
		case "+":
			return add();
		case "-":
			return subtract();
		case "*":
			return multiply();
		case "/":
			return divide();

		default:
			return 0;
		}
		
	}






}
