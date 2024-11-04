package Java.loop_and_condition;

import java.util.Scanner;

public class count_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.println(Math.pow(i,j));
            }
        }
        sc.close();
    }
}
