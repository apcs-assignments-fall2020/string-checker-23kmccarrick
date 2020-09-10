import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(final String str) {
        int count = 0;
        for(int i = 0; i <str.length(); i++){
            
            if(str.substring(i,i+1).equals("a")||str.substring(i,i+1).equals("b")||str.substring(i,i+1).equals("c")){
                count++;
            }
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(final String str) {
        String oof = str.toLowerCase();
        for(int i = 0; i < str.length()-2; i++){
            if(oof.substring(i,i+3).equals("the")){
                return true;
            }
        }
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(final String str) {
        String yum = str.toLowerCase();
    
        if(str.length()<2)
            return true;
    
        for(int i = 0; i < (str.length()/2) ; i++){
        
        if( yum.charAt(i) != yum.charAt(str.length() - 1 - i) )
            return false;
    }
    
    return true;
    }
    
    
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = scan.nextLine();
        int zeCount = countABC(input);
        boolean bool1 = containsThe(input);
        boolean bool2 = isPalindrome(input);
        System.out.print("Your string contains" + zeCount + "a's, b's, or c's");
        if (bool1)
            System.out.print("Your string DOES contain the");
        else
            System.out.println("Your string DOES NOT contain the");
        
        if(bool2)
            System.out.println("Your string IS a palindrome");
        else 
            System.out.println("Your string IS NOT a palindrome");

        // YOUR CODE HERE
    }
}
