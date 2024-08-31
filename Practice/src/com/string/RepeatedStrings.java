package com.string;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];
        String s= "";
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            s = scanner.nextLine();
            if(al.contains(s)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            arr[i] = s;
            al.add(s);
        }
    }
}
