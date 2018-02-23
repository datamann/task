package no.sbsivertsen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import no.sbsivertsen.domain.Task;
import no.sbsivertsen.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
	private TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping(value = {"","/"})
	public Iterable<Task> list(){
		return this.taskService.list();
	}
	
	@PostMapping("/save")
	public Task saveTask(@RequestBody Task task) {
		return this.taskService.save(task);
	}
}
