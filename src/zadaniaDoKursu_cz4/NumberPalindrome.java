package zadaniaDoKursu_cz4;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("Is providet number a palindrome: " + isPalindrome(1001));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int tempDigit = number;
        while(tempDigit != 0){
            int lastDigit = tempDigit % 10;
            reverse *= 10;
            reverse += lastDigit;
            tempDigit /= 10;
        }

        if(reverse == number){
            return true;
        }


        return false;
    }

}
