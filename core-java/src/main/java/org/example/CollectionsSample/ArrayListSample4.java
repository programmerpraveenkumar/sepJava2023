package org.example.CollectionsSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*

 */
public class ArrayListSample4 {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();

        Student student1 = new Student();
        student1.setId(10);
        student1.setName("st1");

        Student student2 = new Student();
        student2.setId(12);
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
        listStudent.forEach((student -> {
            System.out.println(student.getId()+" "+student.getName());
        }));
        System.out.println("--------------------");
        Collections.sort(listStudent,new IdComparator());
        listStudent.forEach((student -> {
            System.out.println(student.getId()+" "+student.getName());
        }));
    }
}
class IdComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getId(),s2.getId());
//            if(s1.getId() > s2.getId()){
//                return 1;
//            }else if(s2.getId() > s1.getId()){
//                return -1;
//            }else{
//                return 0;
//            }
    }
}