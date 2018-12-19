package aszka;

import aszka.dao.TeamDao;
import aszka.domain.Student;
import aszka.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApp extends SpringBootServletInitializer {

	/* Used when run as a JAR */
	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class, args);
	}


	@PostConstruct
	public void init() {

		Set<Student> students = new HashSet<>();
		students.add(new Student("Jan", "Kowalski"));
		students.add(new Student("Adam", "Nowak"));

		Team team = new Team("maths", students);
		teamDao.save(team);

		Set<Student> students2 = new HashSet<>();
		students2.add(new Student("Anna", "Szkop"));

		Team team2 = new Team("phys", students2);
		teamDao.save(team2);
	}

	@Autowired
	TeamDao teamDao;

}
