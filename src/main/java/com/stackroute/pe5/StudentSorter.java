package com.stackroute.pe5;//program to sort the students with respect to their id,names and age

import java.util.Comparator;

 class StudentSorter implements Comparator<Student> {
     public int compare(Student a, Student b) {
         if (a.getAge() == b.getAge()) {
             if (a.getName().equals(b.getName())) {
                 return a.getId().compareTo(b.getId());
             } else
                 return a.getName().compareTo(b.getName());

         }
         else
             return a.getAge() - b.getAge();
     }

 }



