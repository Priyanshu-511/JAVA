package Java.loop_and_condition;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int p = num;
        int term,sum=0;
        for(int i=0; i<=Math.floor(Math.log10(num)+4); i++){
            term=num%10;
            sum=sum*10+term;
            num/=10;
        }
        if(sum==p)
        System.out.println("This is palindrome: ");

        else
        System.out.println("no this isn't palindrome: ");

        sc.close();
    }
}
