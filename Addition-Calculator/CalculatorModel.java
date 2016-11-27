/*
 This class is the model 
 */

public class CalculatorModel {
		
		// Create integer variable to hold the result of the addition
		private int result;
		
		//Method needed to perform addition
		public void addition (int NumberOne, int NumberTwo){
			
			result = NumberOne + NumberTwo;
		} 
		
		//Created another method to return the calculated value
		public int result(){
			
			return result;
		}
}
