package org.home.productivity.todo.service;

import java.util.List;

import org.home.productivity.todo.model.Todo;
import org.home.productivity.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TodoService {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // create
    public Todo save(Todo todo) {
        log.info("Saving todo: {}", todo);
        return todoRepository.save(todo);
    }

    public List<Todo> saveAll(List<Todo> todos) {
        log.info("Saving all todos. Count: {}", todos.size());
        return todoRepository.saveAll(todos);
    }

    // read
    public List<Todo> findAll() {
        log.info("Retrieving all todos");
        return todoRepository.findAll();
    }

    public Todo findById(Long id) {
        log.info("Retrieving todo by id: {}", id);
        return todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Unable to find todo by id: " + id));
    }

    // update
    public Todo update(Todo todo) {
        log.info("Updating todo: {}", todo);
        return todoRepository.save(todo);
    }

    // delete
    public boolean deleteById(Long id) {
        log.info("Deleting todo by id: {}", id);
        todoRepository.deleteById(id);
        return true;
    }

}
