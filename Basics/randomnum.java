package Java.Basics;

import java.util.Scanner;

public class randomnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a*2);
        System.out.println((int)(Math.random()*100021000));
        sc.close();
    }
}
