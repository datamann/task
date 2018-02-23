package no.sbsivertsen.service;

import no.sbsivertsen.domain.Task;

public interface TaskService {
	
	Iterable<Task> list();
	Task save(Task task);
}
