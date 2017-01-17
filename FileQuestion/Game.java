import java.nio.file.*;
import java.util.*;

public class Game {
	
	private static ArrayList<Questions> questions = new ArrayList<Questions>();
		
		private static void init() {			
			try{
				List<String> lines = Files.readAllLines(Paths.get("questions.txt"));
				for (int i = 0; i < lines.size(); i += 5){
					
					Questions q = new Questions(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3), lines.get(i + 4));
					questions.add(q);
					}
				}
			
			catch (Exception e){
				System.out.println("Could not read questions file. System will now exit");
				System.exit(-1);					
				}
		}
		
		private static void loop() {
			Scanner sc = new Scanner(System.in);
			
			while (questions.size() > 0) {
				Questions q = questions.remove(0);
				
				System.out.println(q.text);
				
				for (int i =0; i < q.answers.length; i++) {
					
					System.out.println(i + " " + q.answers[i]);
				}
				
				int input = sc.nextInt();
				
				if (input < 0 || input > q.answers.length - 1) {
					System.out.println("Input is invalid");
					System.exit(-2);
				}
				
				if (q.answers.equals(q.answers[input])) {
					
					System.out.println("You are correct");
				}
				
				else {
					System.out.println("Opps!! Wrong answer.");
				}
			}
		}
		
		

	public static void main(String[] args) {
		init();
		loop();

	}

}
