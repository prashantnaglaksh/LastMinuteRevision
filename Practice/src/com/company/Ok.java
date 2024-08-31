package com.company;

public class Ok{
    public static void main(String[] args) {
        int i, j;
        for(i = 0; i< 5; i++){
            for(j = 0; j< 5; j++){
                if(j >= 6 - i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }

}