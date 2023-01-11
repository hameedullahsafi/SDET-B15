package Class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please Enter your Gender m f");
        char gender=scanner.nextLine().charAt(0);

        switch (gender){

            case 'f':
                System.out.println("Female");
                break;
            case 'F':
                System.out.println("Male");
                break;
            case 'M':
                System.out.println("Male");
            default:
                System.out.println("not specified");
        }
    }
}
