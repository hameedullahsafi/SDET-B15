package Class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        // Below Line helps us get the input from the keyboard
        Scanner input= new Scanner (System.in);
        System.out.println("please enter first your name");
        System.out.println("please Enter last name");
        String name=input.nextLine();// nextLine is used when we have to take sentences from the keyboard
        System.out.println("my first name is "+ "last name");


    }
}
