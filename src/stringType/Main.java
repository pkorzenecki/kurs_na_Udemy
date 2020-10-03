package stringType;

public class Main {
    public static void main(String[] args) {
        /*for (int i = 1; i < 100; i*=2) {
            if (i>10)
                System.out.print('A');
            System.out.print('B');

        }
        int wynik = 2 + 2 *2;
        while (wynik > 0) {
            if(wynik / 3 == 0) {
                System.out.print('x');
                break;

            }
            System.out.print((wynik--));
        }*/


        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and tis is more.";
        System.out.println("myString is equal to: " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to: " + myString);
        String numberString = "250.55";
        numberString = numberString + "56.78";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastSTring is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);


    }
}
