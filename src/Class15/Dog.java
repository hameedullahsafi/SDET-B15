package Class15;

public class Dog {
 // the instance variables alway stay in the memory
    //
    String name;// instance variables
    String breed; //instance variables
    String color;//instance variables


    static int no0fLegs=4; // static variable
    void printfood(){
        System.out.println(name);
        String food="Meat"; // local variables
        System.out.println(food);
    }
    void printColor(){
        //System.out.println(food);
        System.out.println(name);
    }
}
