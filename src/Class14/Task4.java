package Class14;

public class Task4 {
    public static void main(String[] args) {
      //  How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");

        for(String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }
    }
        }




