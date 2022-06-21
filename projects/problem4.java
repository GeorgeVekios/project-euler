public class problem4 {
    public static int palindrome(){
         int palindromeCheck;
         int lastPalindrome = 0;
         String palindromeString = "";
         char ch;
         String reverseString = "";
        for(int i = 999; i>= 100; i--){
            //System.out.println("check first loop");
            for(int j = 999; j >= i; j--){
                //`System.out.println("Check second loop");
                palindromeCheck = i*j;
                //System.out.println(palindromeCheck);
                palindromeString = String.valueOf(palindromeCheck);
                for(int k = 0; k < palindromeString.length(); k++){
                    //System.out.println("This is the palindrome as a string " + palindromeString);
                    ch = palindromeString.charAt(k);
                    reverseString = ch + reverseString;
                }
                //System.out.println("Checking palindrome string " + palindromeString);
                //System.out.println("Checking reverse string " + reverseString);
                if(reverseString.equals(palindromeString)) {
                    if(palindromeCheck > lastPalindrome)
                        lastPalindrome = palindromeCheck;
                    //System.out.println("if statement ran");
                }
                reverseString = "";
            }
        }
        return lastPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(palindrome());
    }
}
