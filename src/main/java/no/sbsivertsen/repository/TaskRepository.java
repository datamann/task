package no.sbsivertsen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import no.sbsivertsen.domain.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{	
}
