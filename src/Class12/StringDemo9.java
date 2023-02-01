package Class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="jdnfdfd 2545454545646464 ^&%$^&";

        int counter=0;
        for (int i = 0; i <str.length() ; i++) {

            if (Character.isDigit(str.charAt(i))){  // this character shows how many letters , number or symble are
                counter++;
            }

        }
        System.out.println("total is Alphabetic is str"+counter);



        }

    }

