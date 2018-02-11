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
package UI;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Calculations.Calculations;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MiniCalculatorUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField screenField;
	private ArrayList<Integer> entryList= new ArrayList<>();
	private ArrayList<Integer> numbersInTheCalculationsArrayList= new ArrayList<>();
	
	private Calculations calculations= new Calculations(numbersInTheCalculationsArrayList);

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculatorUI frame = new MiniCalculatorUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MiniCalculatorUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 32, 273, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		screenField = new JTextField();
		screenField.setBounds(0, 0, 273, 50);
		panel.add(screenField);
		screenField.setColumns(10);
		
		//_________________________________________ Number Buttons___________________________________________
		
		//Zero button
		
		JButton zeroButton = new JButton("0");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryList.add( 0);
				printToTheScreen();
			}
		});
		zeroButton.setBounds(88, 359, 56, 50);
		contentPane.add(zeroButton);
		
		
		//Number one
		
		JButton numberOneButton = new JButton("1");
		numberOneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryList.add(1);
				printToTheScreen();
			}
		});
		numberOneButton.setBounds(20, 112, 56, 50);
		contentPane.add(numberOneButton);
		
		//Number two
		
		JButton numberTowButton = new JButton("2");
		numberTowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryList.add( 2);
				printToTheScreen();
			}
		});
		numberTowButton.setBounds(88, 112, 56, 50);
		contentPane.add(numberTowButton);
		
		
		//Number three
		
		JButton numberThreeButton = new JButton("3");
		numberThreeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryList.add( 3);
				printToTheScreen();
			}
		});
		numberThreeButton.setBounds(156, 112, 56, 50);
		contentPane.add(numberThreeButton);
		
		
		//Number four
		
		JButton numberFoureButton = new JButton("4");
		numberFoureButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryList.add( 4);
				printToTheScreen();
				
			}
		});
		numberFoureButton.setBounds(20, 201, 56, 50);
		contentPane.add(numberFoureButton);
		
		
		//Number five
		
		JButton numberFiveButton = new JButton("5");
		numberFiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryList.add( 5);
				printToTheScreen();
			}
		});
		numberFiveButton.setBounds(88, 201, 56, 50);
		contentPane.add(numberFiveButton);
		
		
		//Number six
		
		JButton numberSixButton = new JButton("6");
		numberSixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryList.add( 6);
				printToTheScreen();
			}
		});
		numberSixButton.setBounds(156, 201, 56, 50);
		contentPane.add(numberSixButton);
		
		
		//Number seven
		
		JButton numberSevenButton = new JButton("7");
		numberSevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryList.add( 7);
				printToTheScreen();
			}
		});
		numberSevenButton.setBounds(20, 281, 56, 50);
		contentPane.add(numberSevenButton);

		
		//Number eight
		
		JButton numberEightButton = new JButton("8");
		numberEightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryList.add( 8);
				printToTheScreen();
			}
		});
		numberEightButton.setBounds(88, 281, 56, 50);
		contentPane.add(numberEightButton);
		

		//Number nine
		
		JButton numberNineButton = new JButton("9");
		numberNineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryList.add( 9);
				printToTheScreen();
			}
		});
		numberNineButton.setBounds(156, 281, 56, 50);
		contentPane.add(numberNineButton);
		
		//__________________________________ End number buttons ____________________________
		
		
		
		//_________________________________ Function buttons______________________________________
		
		//Add button
		JButton sumButton = new JButton("+");
		sumButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numberToCalculate=Integer.parseInt(screenField.getText());
				numbersInTheCalculationsArrayList.add(numberToCalculate);
				calculations.setOperationType("+");
				screenField.setText("+");
				entryList.clear();
			}
		});
		sumButton.setBounds(237, 112, 56, 50);
		contentPane.add(sumButton);
		
		//Subtract button
		
		JButton subtractButton = new JButton("-");
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numberToCalculate=Integer.parseInt(screenField.getText());
				numbersInTheCalculationsArrayList.add(numberToCalculate);
				calculations.setOperationType("-");
				screenField.setText("-");
				entryList.clear();
			}
		});
		subtractButton.setBounds(237, 201, 56, 50);
		contentPane.add(subtractButton);
		
		
		//Multiply button
		
		JButton MultiplyButton = new JButton(".");
		MultiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numberToCalculate=Integer.parseInt(screenField.getText());
				numbersInTheCalculationsArrayList.add(numberToCalculate);
				calculations.setOperationType("*");
				screenField.setText(".");
				entryList.clear();
			}
		});
		MultiplyButton.setBounds(237, 281, 56, 50);
		contentPane.add(MultiplyButton);
		
		
		//Divide button
		
		JButton divideButton = new JButton("/");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numberToCalculate=Integer.parseInt(screenField.getText());
				numbersInTheCalculationsArrayList.add(numberToCalculate);
				calculations.setOperationType("/");
				screenField.setText("/");
				entryList.clear();
			}
		});
		divideButton.setBounds(156, 359, 56, 50);
		contentPane.add(divideButton);
		
		
		//Clear all button
		
		JButton clearAllButton = new JButton("CA");
		clearAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screenField.setText("");
				entryList.clear();
				
				
			}
		});
		clearAllButton.setBounds(20, 359, 56, 50);
		contentPane.add(clearAllButton);
		

		
		

		
		JButton equslsButtonEqualsButton = new JButton("=");
		equslsButtonEqualsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbersInTheCalculationsArrayList.add(Integer.parseInt(screenField.getText()));
				int result=calculations.doOperation();
				screenField.setText(Integer.toString(result));
				entryList.clear();
				numbersInTheCalculationsArrayList.clear();
			}
		});
		equslsButtonEqualsButton.setBounds(237, 359, 56, 50);
		contentPane.add(equslsButtonEqualsButton);

	}
	//_______________________________________ End functions buttons _____________________________________
	
	
	// Method prints the numbers while users are typing them 
	private void printToTheScreen() {
		String xString ="";
		for (int number : entryList) {
			
			xString+=Integer.toString(number);
			
		}
		screenField.setText(xString);
		
	}
	


}
