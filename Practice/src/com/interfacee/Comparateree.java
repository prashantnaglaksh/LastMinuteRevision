package com.interfacee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Comparateree {
    public static void main(String[] args) {
        //Creating a list of students
        ArrayList<Students> al=new ArrayList<Students>();
        al.add(new Students(101,"Vijay",23));
        al.add(new Students(106,"Ajay",27));
        al.add(new Students(105,"Jai",21));

        System.out.println("Sorting by Name");
//Using NameComparator to sort the elements
        Collections.sort(al,new NameComparator());
//Traversing the elements of list
        for(Students st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by Age");
//Using AgeComparator to sort the elements
        Collections.sort(al,new AgeComparator());
//Travering the list again
        for(Students st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
class Students{
    int rollno;
    String name;
    int age;
    Students(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    
//  i think no need of below thing
    public int compareTo(Students st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}

class AgeComparator implements Comparator<Students> {
    public int compare(Students s1,Students s2){
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
class NameComparator implements Comparator<Students>{
    public int compare(Students s1,Students s2){
        return s1.name.compareTo(s2.name);
    }
}
