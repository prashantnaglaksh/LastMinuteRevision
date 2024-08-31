package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n  = scanner.nextInt();
            //for (int j = 0; j < q;j++){
                getsum(a,b,n);
            //}
        }
        scanner.close();
    }
    private static void getsum(int a, int b, int n){
        int sum = a;
        for (int k = 0; k <n;k++){
            sum += ((int)b*Math.pow(2,k));
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}