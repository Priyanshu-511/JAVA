package Java.loop_and_condition;

import java.util.Scanner;

public class primeRange {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the start input: ");
        int start = sc.nextInt();
        System.out.println("enter the end term: ");
        int end = sc.nextInt();
        for(int i= start; i<=end; i++){
            if (i<2) {
                continue;
            }
            int c=0;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0)
                c=1;
                break;
            }
            if(c==0)
            System.out.println(i);
        }
        sc.close();
    }
}
