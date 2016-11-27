import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	private CalculatorView View;
	private CalculatorModel Model;
	
	public CalculatorController(CalculatorView View, CalculatorModel Model){
		
		this.View = View;
		this.Model = Model;
		
		this.View.ShowResultListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int NumberOne, NumberTwo = 0;
			
			try {
				NumberOne = View.getNumberOne();
				NumberTwo = View.getNumberTwo();
				
				Model.addition(NumberOne, NumberTwo);
				View.setAnswer(Model.result());
				
				
			}
			
			catch (NumberFormatException ex) {
				
				System.out.println(ex);
				//View.displayErrorMessage("You must enter two numbers");
				
			}
			
		}
		
		
	}

}
