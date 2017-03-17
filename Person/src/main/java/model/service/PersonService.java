package model.service;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import dao.PersonRepository;
import model.Person;

@Service
@Transactional
public class PersonService {

	private final PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<Person> findAll(){
		List<Person> persons = new ArrayList<>();
		for(Person person : personRepository.findAll()){
			persons.add(task);
		}
		return tasks;
	}

	public Person findPerson(int id){
		return personRepository.findOne(id);
	}

	public void save(Person person){
		personRepository.save(person);
	}

	public void delete(int id){
		personRepository.delete(id);
	}
}
