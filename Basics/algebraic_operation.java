package Java.Basics;

import java.util.Scanner;

public class algebraic_operation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter the number: ");
        int a= sc.nextInt();  
        System.out.println("Enter the another number: ");
        int b= sc.nextInt();  
        System.out.println("sum: ");
        System.out.println(a+b);
        System.out.println("first - second: ");
        System.out.println(a-b);
        System.out.println("product: ");
        System.out.println(a*b);
        System.out.println("first/second: ");
        System.out.println(a/b);
        System.out.println("second/first: ");
        System.out.println(b/a);
        sc.close();
    }
}
