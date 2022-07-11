package org.home.productivity.todo.controller;

import java.util.ArrayList;

import org.home.productivity.todo.model.Todo;
import org.home.productivity.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("/load-sample-data")
    public ResponseEntity<Boolean> loadSampleData() {
        log.info("Loading sample data");
        var sampleTodos = new ArrayList<Todo>();
        // @formatter:off
        var todo1 = Todo.builder()
                        .description("Setup UI before trying to introduce react query")
                        .complete(true)
                        .build();
        var todo2 = Todo.builder()
                        .description("Build out integration with backend")
                        .complete(false)
                        .build();
        var todo3 = Todo.builder()
                        .description("Allow for adding todos")
                        .complete(false)
                        .build();
        var todo4 = Todo.builder()
                        .description("Allow for retrieving todos")
                        .complete(false)
                        .build();
        var todo5 = Todo.builder()
                        .description("Allow for updating todos")
                        .complete(false)
                        .build();
        var todo6 = Todo.builder()
                        .description("Allow for deleting todos")
                        .complete(false)
                        .build();
        var todo7 = Todo.builder()
                        .description("Bring in react query and do all of the above")
                        .complete(false)
                        .build();
        var todo8 = Todo.builder()
                        .description("Evolve with nice loading, error (with retry), pagination")
                        .complete(false)
                        .build();
        var todo9 = Todo.builder()
                        .description("See how well it lends itself being reusable, does it require too much boilerplate or should we try the devil's flavor RTK?")
                        .complete(false)
                        .build();
        var todo10 = Todo.builder()
                        .description("After pushing to github, sit back and enjoy what you've complete and share with all you know")
                        .complete(false)
                        .build();
        // @formatter:on
        sampleTodos.add(todo1);
        sampleTodos.add(todo2);
        sampleTodos.add(todo3);
        sampleTodos.add(todo4);
        sampleTodos.add(todo5);
        sampleTodos.add(todo6);
        sampleTodos.add(todo7);
        sampleTodos.add(todo8);
        sampleTodos.add(todo9);
        sampleTodos.add(todo10);

        todoService.saveAll(sampleTodos);
        log.info("Loaded sample data");
        return ResponseEntity.ok(true);
    }
}