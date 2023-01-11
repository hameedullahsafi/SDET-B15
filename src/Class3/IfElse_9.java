package Class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c = 'M';
        if (c == 'M') {
            System.out.println("male");
        }
        String name = "Som";
        // with non primitive data typs such as String we can not use ==symbol
        if (name.equals("Sam")) {
            System.out.println("Amazing  Stduent");
        }
// ! Symbol can change true to false and false to true
        if (!name.equals("Sam'")) {
            //  System.out.println("Super Amazing Student");{
        }
    }
}