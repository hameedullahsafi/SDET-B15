package Class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str=" I love java";
        boolean startsWith=str.startsWith("I");
        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));

        // Method chainig is when multiple methods are called on the same line
        // only those methods can be chained which retruns a string
        System.out.println(str.toLowerCase().startsWith("i"));

    }
}
