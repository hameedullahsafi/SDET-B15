package Class6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("Please enter three numbers");
        double A = input.nextInt();
        double B = input.nextInt();
        double C = input.nextInt();

        if (A> B && A> B) {
            System.out.println(" is The largest number  " + A);
        } else if (B> A && B > C) {
            System.out.println(" is The largest number  " + B);
        } else if (C > A && C> B) {
            System.out.println(" is The largest number  " + C);
        }
    }
}
