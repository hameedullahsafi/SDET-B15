package Class4;

public class IfElseConditions2 {
    public static void main(String[] args) {
        boolean rain=false;
        if (rain) {
            System.out.println("lets take the umbrella");// plan A
        }else {   // we use else if first plan dont work use else
            System.out.println("lets just take the hat");// Plan B

        }
        // create a boolean variable call it break ifit contains true print lets take the break otherwise
        // it should print lets continue the class
        boolean breakTime=true;
        // break till 11:50

        if (breakTime) {
            System.out.println("let's go on  break");
        }else {
            System.out.println("let's continue the class");

        }
    }
}
