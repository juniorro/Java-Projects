package model.dao;
import org.springframework.data.repository.CrudRepository;
import model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

}
