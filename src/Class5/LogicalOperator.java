package Class5;

import java.security.cert.TrustAnchor;

public class LogicalOperator {
    public static void main(String[] args) {
/*
        if(10>5|| 4>6) {
            System.out.println("1");
        }else {
            System.out.println("2");
        }
        String name= "Adam";
        int age=31;
        if(name.equals("Adam")&& age==30) {
            System.out.println(" you are the Adam from batch 13");
        }else {
            System.out.println(" I Don't know you");
        }
        boolean isTrue=false;
        if(!isTrue) {
            System.out.println("you got it");
        }else {
            System.out.println("Need more practice");
           */
        boolean isTrue=false;
        boolean condition=!isTrue;
        System.out.println(condition);

        if(condition){
            System.out.println(" You got it");
        }else {
            System.out.println("Need more practice");
        }

    }
}
