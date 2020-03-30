package br.com.devdojo.repository;

import br.com.devdojo.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
// https://docs.spring.io/autorepo/docs/spring-data-commons/1.5.3.RELEASE/api/org/springframework/data/repository/CrudRepository.html
public interface StudentRepository extends CrudRepository<Student, Long> {
    // não é necessário implementar esta interface: StudentRepository, pois tudo será
    List<Student> findByNameIgnoreCaseContaining(String name);      // implementado em tempo de execução
}
