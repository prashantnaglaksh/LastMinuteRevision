package com.miscelenous;

public class Overloading {
    public static void main(String[] args) {
        System.out.println("i am main");
        System.out.println(method(5,6));
        System.out.println(method(1,2,3));
        Overriding rid = new Overriding();
        System.out.println(rid.method(1,2,3,4));
    }
   public static int method(int a, int b){
        return a+b;
    }
    static String method(int a, int b, int c){
        return "ok";
    }

}
class Overriding extends Overloading{
   protected static int method(int a, int b,int c,int d){
        return a+b;
    }
}
