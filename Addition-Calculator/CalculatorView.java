import java.awt.event.ActionListener;
import javax.swing.*;


public class CalculatorView extends JFrame {

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
			return Integer.parseInt(NumberOne.getText());
		}
		
		public int getNumberTwo(){
			return Integer.parseInt(NumberTwo.getText());
		}
		
		public int getAnswer(){
			return Integer.parseInt(Answer.getText());
		}
		
		public void setAnswer(int Addresult){
			Answer.setText(Integer.toString(Addresult));
		}
		
		void ShowResultListener(ActionListener listenForButton){
			ShowResult.addActionListener(listenForButton);
			
		}
		
		void invalidEntry (String errorMessage){
			
			JOptionPane.showMessageDialog(this, errorMessage);
		}
}
