package org.example.CollectionsSample;

import java.util.*;
import java.util.stream.Collectors;

public class ListStudent {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("st1");


        Student student2 = new Student();
        student2.setId(2);
        student2.setName("st2");


        Student student3 = new Student();
        student3.setId(3);
        student3.setName("st3");


        Student student4 = new Student();
        student4.setId(4);
        student4.setName("st4");

        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);

        listStudent.forEach(student -> {
            System.out.println(student.getId()+" -- "+student.getName());
        });

        List<Student> filterStudent = listStudent.stream().filter(student -> student.getId()>2).collect(Collectors.toList());
        System.out.println("-----------------");
        filterStudent.forEach(student -> {
            System.out.println(student.getId()+" -- "+student.getName());
        });
        List<Student> filterStudent1 = listStudent.stream().filter(student -> student.getName().contains("3")).collect(Collectors.toList());
        System.out.println("-----------------");
        filterStudent1.forEach(student -> {
            System.out.println(student.getId()+" -- "+student.getName());
        });
        List<String> nameList = listStudent.stream().map(student -> student.getName()).collect(Collectors.toList());
        System.out.println("-----------------");
        System.out.println(nameList);

        List<String> filterStudent2 = listStudent.stream()
                                            .filter(student -> student.getId()>2)
                                            .map(student -> student.getName())
                                            .collect(Collectors.toList());
        System.out.println("-----------------");
        System.out.println(filterStudent2);
    }
}
