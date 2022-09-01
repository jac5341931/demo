package com.example.demoAplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoAplicationApplication {

	public static void main(String[] args) {
        SpringApplication.run(DemoAplicationApplication.class, args);

        Task t1 = new Task("Descripcion 1", false, LocalDate.of(2022, 1, 1));
        Task t2 = new Task("Descripcion 2", false, LocalDate.of(2022, 2, 10));
        Task t3 = new Task("Descripcion 3", false, LocalDate.of(2021, 10, 10));
        Task t4 = new Task("Descripcion 4", false, LocalDate.of(2022, 11, 30));
        Task t5 = new Task("Descripcion 5", false, LocalDate.of(2022, 12, 24));

        TaskList meta = new TaskList("Lista de Tareas"); //crea una instancia de la clase TaskList

        System.out.println("descripcion de la tarea: ");
        System.out.println(t1.getDescription());
        System.out.println("fecha de la tarea");
        System.out.println(t1.getDueDate());
        System.out.println("estado de la tarea realizada");
        System.out.println(t1.getDone());

        //ahora se pretende MODIFICAR LA propiedad de descripcion de t1

        t1.setDescription("recordando POO");

        meta.addTaskList(t1);
        meta.addTaskList(t2);
        meta.addTaskList(t3);
        meta.addTaskList(t4);
        meta.addTaskList(t5);

        meta.removeTask2("Descripcion 2");

        System.out.println("***************************");
        System.out.println(meta.getName());
        System.out.println("***************************");
        meta.printTask2(); //  Print task2 de tasklist permite hace una busqueda indexada
    }
}
