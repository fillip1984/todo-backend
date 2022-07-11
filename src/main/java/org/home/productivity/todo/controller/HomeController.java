package org.home.productivity.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class HomeController {

    // TODO: replace with frontend like react, vue, not angular, maybe svelte
    @GetMapping
    public String hello() {
        log.info("Welcome home");
        return "index.html";
    }

}
