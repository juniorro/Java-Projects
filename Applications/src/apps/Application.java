package apps;

public class Application {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setFirstName("Jean");
		person.setLastName("Pierre");
		person.setEmail("jean@pierre.com");
		person.setId(12);
		
		System.out.println(person.toString()+"\n");
		
		person.setFirstName("Jean-Claude");
		
		System.out.println("Person object after name change\n");
		
		System.out.println(person.toString());
	}

}
