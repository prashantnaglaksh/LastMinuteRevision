package com.excption;

public class ExcpBasics {
    public static void main(String[] args) {
       try{
           int[] arr = new int[4];

           // Now this statement will cause an exception
           int i = arr[4]; //ArrayIndexOutOfBoundsException
           int w = 5/0; //ArithmeticException

           // This statement will never execute
           // as above we caught with an exception
           System.out.println("Hi, I want to execute");
       }catch (ArithmeticException e){
           System.out.println("i am caught " + e);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("i am also caught \n" + e);
       }finally {
           System.out.println("i am here finally ");
       }
    }
}
