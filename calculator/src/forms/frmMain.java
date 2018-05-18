package forms;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextField;

import classes.Calculator;
import enums.EnumOperations;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMain {
protected Calculator _calculator;
	public JFrame frmCalculator;
	private JTextField txtDisplay;
	/**
	 * Create the application.
	 */
	public frmMain() {
		initialize();
		this._calculator=new Calculator();
	}


protected void SetFirstNumber() {
	if(!this._calculator.is_operationExecuted())
	{
		try
		{
			this._calculator.set_firstNumber(Double.parseDouble(txtDisplay.getText()));
			this._calculator.set_result(Double.parseDouble(txtDisplay.getText()));
		}
		catch(Exception ex){}
	}
	txtDisplay.setText("");
}
	
	
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 295, 468);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmCalculator.setJMenuBar(menuBar);
		
		JMenu mnCalculator = new JMenu("Calculator");
		menuBar.add(mnCalculator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnCalculator.add(mntmExit);
		frmCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 265, 40);
		frmCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton buttonBackspace = new JButton("BCK");
		buttonBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					int textLenght = txtDisplay.getText().length();
					txtDisplay.setText(txtDisplay.getText().substring(0, textLenght-1));	
				}
				catch(Exception ex){}
				
				
			}
		});
		buttonBackspace.setBounds(10, 62, 129, 56);
		frmCalculator.getContentPane().add(buttonBackspace);
		
		JButton buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
				_calculator=new Calculator();
			}
		});
		buttonClear.setBounds(149, 62, 58, 56);
		frmCalculator.getContentPane().add(buttonClear);
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SetFirstNumber();
				_calculator.set_operation(EnumOperations.Divide);
				
				
			}
		});
		buttonDivide.setBounds(217, 62, 58, 56);
		frmCalculator.getContentPane().add(buttonDivide);
		
		JButton buttonSeven = new JButton("7");
		buttonSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText= txtDisplay.getText();
				currentText+="7";
				txtDisplay.setText(currentText);
			}
		});
		buttonSeven.setBounds(10, 129, 58, 56);
		frmCalculator.getContentPane().add(buttonSeven);
		
		JButton buttonEight = new JButton("8");
		buttonEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText= txtDisplay.getText();
				currentText+="8";
				txtDisplay.setText(currentText);
			}
		});
		buttonEight.setBounds(82, 129, 58, 56);
		frmCalculator.getContentPane().add(buttonEight);
		
		JButton buttonNine = new JButton("9");
		buttonNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText= txtDisplay.getText();
				currentText+="9";
				txtDisplay.setText(currentText);
			}
		});
		buttonNine.setBounds(149, 129, 58, 56);
		frmCalculator.getContentPane().add(buttonNine);
		
		JButton buttonFour = new JButton("4");
		buttonFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText= txtDisplay.getText();
				currentText+="4";
				txtDisplay.setText(currentText);
			}
		});
		buttonFour.setBounds(10, 200, 58, 56);
		frmCalculator.getContentPane().add(buttonFour);
		
		JButton buttonFive = new JButton("5");
		buttonFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText= txtDisplay.getText();
				currentText+="5";
				txtDisplay.setText(currentText);
			}
		});
		buttonFive.setBounds(82, 200, 58, 56);
		frmCalculator.getContentPane().add(buttonFive);
		
		JButton buttonSix = new JButton("6");
		buttonSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText= txtDisplay.getText();
				currentText+="6";
				txtDisplay.setText(currentText);
			}
		});
		buttonSix.setBounds(149, 200, 58, 56);
		frmCalculator.getContentPane().add(buttonSix);
		
		JButton buttonOne = new JButton("1");
		buttonOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText= txtDisplay.getText();
				currentText+="1";
				txtDisplay.setText(currentText);
			}
		});
		buttonOne.setBounds(10, 271, 58, 56);
		frmCalculator.getContentPane().add(buttonOne);
		
		JButton buttonTwo = new JButton("2");
		buttonTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText= txtDisplay.getText();
				currentText+="2";
				txtDisplay.setText(currentText);
			}
		});
		buttonTwo.setBounds(82, 271, 58, 56);
		frmCalculator.getContentPane().add(buttonTwo);
		
		JButton buttonThree = new JButton("3");
		buttonThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText= txtDisplay.getText();
				currentText+="3";
				txtDisplay.setText(currentText);
			}
		});
		buttonThree.setBounds(149, 271, 58, 56);
		frmCalculator.getContentPane().add(buttonThree);
		
		JButton buttonChangeSign = new JButton("+/-");
		buttonChangeSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=txtDisplay.getText();
				if(currentText.indexOf("-")==-1)
				{
					currentText="-"+currentText;
				}else currentText=currentText.replace("-", "");
				txtDisplay.setText(currentText);
				_calculator.set_result(_calculator.get_result()*-1);
				_calculator.set_firstNumber(_calculator.get_result());
			}
		});
		buttonChangeSign.setBounds(10, 338, 58, 56);
		frmCalculator.getContentPane().add(buttonChangeSign);
		
		JButton buttonCalculate = new JButton("=");
		buttonCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					_calculator.set_secondNumber(Double.parseDouble(txtDisplay.getText()));
					_calculator.Execute();
					txtDisplay.setText(String.valueOf(_calculator.get_result()));	
				}
				catch(Exception ex){}
				
			}
		});
		buttonCalculate.setBounds(217, 338, 58, 56);
		frmCalculator.getContentPane().add(buttonCalculate);
		
		JButton buttonZero = new JButton("0");
		buttonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String currentText= txtDisplay.getText();
				currentText+="0";
				txtDisplay.setText(currentText);
			}
		});
		buttonZero.setBounds(82, 338, 58, 56);
		frmCalculator.getContentPane().add(buttonZero);
		
		JButton buttonDecimal = new JButton(".");
		buttonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=txtDisplay.getText();
				if(currentText.indexOf(".")==-1)
				{
					currentText+=".";
				}
				txtDisplay.setText(currentText);
			}
		});
		buttonDecimal.setBounds(149, 338, 58, 56);
		frmCalculator.getContentPane().add(buttonDecimal);
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetFirstNumber();
				_calculator.set_operation(EnumOperations.Add);
			}
		});
		buttonAdd.setBounds(217, 271, 58, 56);
		frmCalculator.getContentPane().add(buttonAdd);
		
		JButton buttonSubstract = new JButton("-");
		buttonSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetFirstNumber();
				_calculator.set_operation(EnumOperations.Substract);
			}
		});
		buttonSubstract.setBounds(217, 200, 58, 56);
		frmCalculator.getContentPane().add(buttonSubstract);
		
		JButton buttonMultiplay = new JButton("*");
		buttonMultiplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetFirstNumber();
				_calculator.set_operation(EnumOperations.Multiplay);
			}
		});
		buttonMultiplay.setBounds(217, 129, 58, 56);
		frmCalculator.getContentPane().add(buttonMultiplay);
	}
}
