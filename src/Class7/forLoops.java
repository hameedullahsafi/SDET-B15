package Class7;

public class forLoops {
    public static void main(String[] args) {
        /*
        prints number form 0 to10
         */
        int number = 0;// creating a variaable of type int
        while (number < 10) ;// checks the condition if condition id trure execute the code in the body of while loop
        System.out.println(number);// prints the value of number on the console
        number++; // it adds one to the number variable
       /// initializ ; condition ; increment0rdecrement

        for (int i = 1; i < 20; i += 2) {
            System.out.println(i);
        }

    }
}