package Class15;

import class16.Person;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        //  System.out.println(person.bankBalance);
        //  System.out.println(person.address);
        System.out.println(person.name);
        person.printTikTokAccount();
        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
}
