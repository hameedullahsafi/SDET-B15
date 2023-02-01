package Class13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str=" I like java. I write a lot of code daily. I am from batch 15.";
        String [] strArry=str.split("[.?!]");
        System.out.println(strArry.length);
        System.out.println(strArry[2].trim());
        // whenever we are working with arrays we use the lengh and whenever we are working with Strings
        // we use the length()
    }
}
