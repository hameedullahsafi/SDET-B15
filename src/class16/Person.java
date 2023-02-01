package class16;

public class Person {
    private double bankBalance=1250000;  // private means no one can use it in the defferent class
    String address= "Street 123";  // default access
    public String  name= "Jon Snow";

    private void  printPhonePassword(){
        System.out.println("pass123");
    }
    void printSSN(){
        System.out.println("1212454555");
    }
   public void printTikTokAccount(){
       System.out.println("user123");

    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();

    }
}
