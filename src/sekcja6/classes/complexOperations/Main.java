package sekcja6.classes.complexOperations;

public class Main {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1, 1);

        System.out.println("One.real = " + one.getReal());
        System.out.println("One.imaginary = " + one.getImaginary());

        one.subtract(number);

        System.out.println("One.real = " + one.getReal());
        System.out.println("One.imaginary = " + one.getImaginary());

        number.subtract(one);

        System.out.println("Number.real = " + number.getReal());
        System.out.println("Number.imaginary = " + number.getImaginary());
    }
}
