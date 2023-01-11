package Class4;

public class IfDemo1 {
    public static void main(String[] args) {

        int money = 15000;
        if (money > 1000) {
            System.out.println("lets buy and iphone");
        }


        if (money > 2000) {
            System.out.println("lets also buy a Macbook");
        }


        boolean mothersday = true;
        if (mothersday) {
            System.out.println("happy Mother's day");
        }


        //equals method is only used for non -primitives
        String name = "Hameed";
        if (name.equals("Hameed")) {
            System.out.println("I love football");
        }
    }
}

