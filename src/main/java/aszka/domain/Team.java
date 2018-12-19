package aszka.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement
@Entity
public class Team {

	@Id
	@GeneratedValue
	Long id;
	String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="teamId")
	Set<Student> students;

	public Team() {
		super();
	}

	public Team(String name, Set<Student> students) {
		this();
		this.name = name;
		this.students = students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}
}
