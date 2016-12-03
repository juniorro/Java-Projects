/**
* The MVCCalculator program implements Model-View-Controller model
* application that simply adds two numbers that the user enters
* using Swing GUI ad displays the result
*
* @author  Roland Junior Toussaint
* @version 1.0
* @since   10/03/2016
*/
public class MVCCalculator {
	
	public static void main (String[] args){
		
		CalculatorView View = new CalculatorView();
		CalculatorModel Model = new CalculatorModel();
		CalculatorController Controller = new CalculatorController(View, Model);
		
		View.setVisible(true);


	}

}
