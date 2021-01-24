public class PalindromeNumber {

    public static void main ( String []args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(282));
        System.out.println(isPalindrome(383));


    }

    public static boolean isPalindrome ( int number ){
        int reverse = 0;
        int lastDigit;
        int compareNumber = number;
        while (number != 0) {

            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }

        if (compareNumber == reverse) {
            return true;

        } else {
            return false;

        }
    }
}//Agbesi.Amenyo

