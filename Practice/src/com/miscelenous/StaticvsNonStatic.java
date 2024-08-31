package com.miscelenous;

// Static variables are class level variable
//Static methods can't access instance variables and instance methods directly without using the reference of an object.
//Instance methods can access static variables and static methods directly. “this” operator cannot be used by static methods.
public class StaticvsNonStatic {
    int non_static_counter = 0;
    static int static_counter = 0;
    StaticvsNonStatic(){
        non_static_counter++;
        static_counter++;
    }

    public static void main(String[] args) {
        StaticvsNonStatic obj1 = new StaticvsNonStatic();
        StaticvsNonStatic obj2 = new StaticvsNonStatic();
        StaticvsNonStatic obj3 = new StaticvsNonStatic();
        System.out.println(obj3.non_static_counter);
        System.out.println(StaticvsNonStatic.static_counter);
        System.out.println(obj3.static_counter);
        //for static method and varibale we can aslo called them
        // by creaing instance of that object but it is
        // not appriciable as we can directly called them
        // by classname.method or varible name.
    }
}
