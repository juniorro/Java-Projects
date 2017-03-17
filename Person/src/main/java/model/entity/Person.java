package model.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="person")
public class Person implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	private boolean developer;

	public Person(){}

	public Person(String name, String description, Date dateCreated, boolean developer) {
		super();
		this.name = name;
		this.description = description;
		this.dateCreated = dateCreated;
		this.developer = developer;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public boolean isDeveloper() {
		return finished;
	}
	public void setDeveloper(boolean finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", description=" + description + ", dateCreated=" + dateCreated
				+ ", developer=" + developer + "]";
	}

}
