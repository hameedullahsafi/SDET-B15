package Class13;

public class Stringrecap {
    public static void main(String[] args) {

        // how can i print all the letters from this string one by one
        String str = "Java is Great";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            // what is the input to the charAt ()mehod its int out is a char

            for (int j = 0;j < str.length(); j++) {
                if (str.charAt(j)=='a'){
                 // count++;

                }
            }
        }
    }
}
