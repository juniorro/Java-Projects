/**
* The Game program implements an application that
* simply asks a user to guessed a random number generated
* by the computer. It will run until the
* user guesses the correct number.* 
*
* @author  Roland Junior Toussaint
* @version 1.0
* @since   10/03/2016
*/

//import acion listerner
import java.awt.event.ActionListener;

//import Swing library
import javax.swing.*;


public class CalculatorView extends JFrame {

		//GUI controllers
		private JTextField NumberOne = new JTextField(10);
		private JLabel additonSign = new JLabel("+");
		private JTextField NumberTwo = new JTextField(10);
		private JButton ShowResult = new JButton("Equal");
		private JTextField Answer = new JTextField(10);

		
		CalculatorView(){
			
			// Create the GUI panel
			JPanel GUI = new JPanel();
			
			// Close panel when "X" is clicked
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// Set panel size
			this.setSize(600, 300);
			
			// Add created attributes to panel
			GUI.add(NumberOne);
			GUI.add(additonSign);
			GUI.add(NumberTwo);
			GUI.add(ShowResult);
			GUI.add(Answer);
			this.add(GUI);
		}

		public int getNumberOne(){
			 /**
			   * This method is used to get the first number
			   * parsed into the number GUI
			   * @param none
			   * @return int number 
			   */	
			return Integer.parseInt(NumberOne.getText());
		}
		
		public int getNumberTwo(){
			/**
			   * This method is used to get the second number
			   * parsed into the number GUI
			   * @param none
			   * @return int number 
			   */
			return Integer.parseInt(NumberTwo.getText());
		}
		
		public int getAnswer(){
			/**
			   * This method is used to get the answer
			   * parsed into the number GUI
			   * @param none
			   * @return int answer 
			   */
			return Integer.parseInt(Answer.getText());
		}
		
		public void setAnswer(int Addresult){
			Answer.setText(Integer.toString(Addresult));
		}
		
		void ShowResultListener(ActionListener listenForButton){
			ShowResult.addActionListener(listenForButton);
			
		}
		
		void invalidEntry (String errorMessage){
			/**
			   * This method displays an error message
			   * if a string is entered.
			   * @param none
			   * @return int answer 
			   */
			
			//show message
			JOptionPane.showMessageDialog(this, errorMessage);
		}
}
