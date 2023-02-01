package Class12;

public class StaringDemo8 {
    public static void main(String[] args) {
        // this code methted count or shows the number of code
        String str= "Java is love";
        char elena=str.charAt(2);
        System.out.println(elena);
/*

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));

 */
  /// here it show how may letter A is in thw sentence
            int counter=0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(j)=='a'){
                    counter++;
                }
                System.out.println(counter);

            }


        }

    }

