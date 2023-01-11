package Class5;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        /*
        Scanner => is name of the class
        scan is just a variable like we create primitive variables
        = => assignment operator
        System.in=> tells the computer we want to read the data from keyboard .

         */
        /*System.out.println("please Enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old ");

        System.out.println(" Please Enter your weight");
        double weight=scan.nextDouble();
            System.out.println("your weight is "+weight+ "kgs");
        System.out.println("Are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("hungry"+hungry);/*

         */


       /* System.out.println(" please enter your gender");
        char gender=scan.next().charAt(0);// char type of input
        System.out.println("your gender is "+gender);

        */

        System.out.println("please Enter your name ");
        String name=scan.next();// when we have to taken only one word as input
        System.out.println("your name "+name);


        scan.nextLine();// trick to make nextline method work after we have used any other method from scanner class
        System.out.println("Please Enter your full name");
        String fullname=scan.nextLine();
        System.out.println("your full neme is "+fullname);
        scan.close();// good practice

    }
}
