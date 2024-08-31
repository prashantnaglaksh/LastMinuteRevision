package com.array;

public class lko {
    public static void main(String[] args) {
        fuc();
    }
    static int fuc(){
        int[] a = new int[]{1,2};

        int[] b = new int[]{1,2};
        if(a == b){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        return 0;
    }
}
