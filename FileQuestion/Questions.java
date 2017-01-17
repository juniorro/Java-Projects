
public class Questions {
	
	public String text;
	public String[] answers;
	public String rightAnswers;

	public Questions(String text, String... answers) {

			this.text = text;
			this.answers = answers;
			this.rightAnswers = answers[0];
			
			for (int i = 0; i < answers.length; i++) {
				
				int randomIndex = (int) (Math.random() * answers.length);
				String temp = answers[i];
				answers[i] = answers[randomIndex];
				answers[randomIndex] = temp;
			}
	}

}
