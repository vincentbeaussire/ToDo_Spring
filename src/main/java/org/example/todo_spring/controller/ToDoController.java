package org.example.todo_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ToDoController {

    @RequestMapping("/home/todolist")
    @ResponseBody
    public List<String> getToDoList() {
        return List.of("homework", "wash the car", "buy a present");
    }

    @RequestMapping("/home/todo")
    public String toDo(Model model) {
        model.addAttribute("name", "Homework");
        model.addAttribute("description", "exercice 1 and 2 in English");
        model.addAttribute("isDone", true);
        model.addAttribute("name", "Washing up");
        model.addAttribute("description", "wash the car");
        model.addAttribute("isDone", true);
        model.addAttribute("name", "Shopping");
        model.addAttribute("description", "buy a present");
        model.addAttribute("isDone", false);
        List<String> todos = List.of("homework", "wash the car", "buy a present");
        model.addAttribute("todos", todos);
        return "todo/details";
    }

    @RequestMapping("/home/todoEmpty")
    public String toDoEmpty(Model model) {
        model.addAttribute("name", "Homework");
        model.addAttribute("description", "exercices 1 and 2 in English");
        model.addAttribute("isDone", true);
        model.addAttribute("name", "Washing up");
        model.addAttribute("description", "wash the car");
        model.addAttribute("isDone", true);
        model.addAttribute("name", "Shopping");
        model.addAttribute("description", "buy a present");
        model.addAttribute("isDone", false);
        List<String> todos = List.of();
        model.addAttribute("todos", todos);
        return "todo/details";
    }


}
