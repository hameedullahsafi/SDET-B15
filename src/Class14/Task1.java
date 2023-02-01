package Class14;

public class Task1 {

    public static void main(String[] args) {

        // 1) Create a String that will hold a sentence. Write a program to get a new String
        //without any spaces.

        // it remove the spaces in the senteances
        String str=" batch 15 is Great";
        String newStr=str.replaceAll(" ","");
        System.out.println(newStr);
    }
}
