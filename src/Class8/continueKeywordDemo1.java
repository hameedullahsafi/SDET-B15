package Class8;

public class continueKeywordDemo1 {
    public static void main(String[] args) {
        int temp = 75;
/*
        while (temp<=105){
            if(temp<=100){
                System.out.println("I love summer because Temperature is "+temp);
            }else {
                System.out.println("Its very hot "+temp);
            }
            temp+=5;
            */
        System.out.println("********************************");

        for (int i = 0; i < 10; i++) {

            if (i==3||i==6||i==9) {
                continue;  // skip
            }
                System.out.println(i); // lines is never executed when i =3,6,9

            }

        }

    }




