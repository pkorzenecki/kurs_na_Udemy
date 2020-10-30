package zadaniaDoKursu_cz4;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of first and last digits in number = " + sumFirstAndLastDigit(123));

    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int last = number % 10;
        System.out.println(last);
        int first = 0;
        for(int i = number; i > 0; i /= 10) {
            if(i < 10) {
                first = i;
            }
        }
        return (first + last);
    }
}
