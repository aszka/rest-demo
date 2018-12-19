package aszka.dao;

import aszka.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface StudentDao extends CrudRepository<Student, Long> {

}
