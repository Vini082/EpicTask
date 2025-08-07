package br.com.etecia.epictask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/tasks")
public class TaskController {

@GetMapping
    
public String listTasks(){
    System.out.println("Listar tarefas");
return "tasks";

}

}
