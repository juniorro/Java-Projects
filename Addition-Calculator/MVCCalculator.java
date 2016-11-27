
public class MVCCalculator {
	
	public static void main (String[] args){
		
		CalculatorView View = new CalculatorView();
		CalculatorModel Model = new CalculatorModel();
		CalculatorController Controller = new CalculatorController(View, Model);
		
		View.setVisible(true);


	}

}
