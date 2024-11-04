package Java.loop_and_condition;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c=0;
        for(int i=1; i<=a; i++){
            if (a%i == 0){
                c++;
            }
        }
        if (c==2)
        System.out.println("Given input is Prime Number");

        else
        System.out.println("Given input is Composite number");
        sc.close();
    }
}
