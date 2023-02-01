package class16;

public class Task3 {
    /*
    Create a method that will print whether given String is palindrome or not
    return type => void
    name => ispalindrome
    parameters => String inputStr
    {
   }
     */
    void isPalindrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if (str.equals(reversedStr)){
            System.out.println(str+" is plaindrome");
        }
        System.out.println(str+" not is plaindrome");

    }
    public static void main(String[] args) {
        Task3 task3=new Task3();
       //String resut task3.isPalindrome("kaya"); can't assign void methods to variables
       // System.out.println(task3.isPalindrome("kaya")); can't use void methods in println'
        task3.isPalindrome("kaya");

    }
}
