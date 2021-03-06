package sekcja1_5.zadaniaDoKursu_cz2;

public class AreaCalculator {
    public static void main(String[] args) {
        double areoOfCircle = area(5.0);
        if(areoOfCircle < 0){
            System.out.println("Invalid input");
        }else {
            System.out.println(areoOfCircle);
        }

        double areaOfRectangle = area(5.0, 4.0);
        if(areaOfRectangle < 0){
            System.out.println("Invalid input");
        }else {
            System.out.println(areaOfRectangle);
        }
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1;
        }
        return x * y;
    }

}
