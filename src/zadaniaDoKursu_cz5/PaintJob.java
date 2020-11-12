package zadaniaDoKursu_cz5;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 1.5, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("=====================");

        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println("=====================");
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.77));
    }

    public static int getBucketCount(double width, double height, double areaBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }
        double wallArea = width * height;
        double needNumOfBuckets = (wallArea / areaBucket) - extraBuckets;

        return Math.incrementExact((int)needNumOfBuckets);
    }

    public static int getBucketCount(double width, double height, double areaBucket) {
        if ((width <= 0) || (height <= 0) || (areaBucket <= 0)) {
            return -1;
        }
        double wallArea = width * height;
        double needNumOfBuckets = wallArea / areaBucket;

        return Math.incrementExact((int)needNumOfBuckets);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double needNumOfBuckets = area / areaPerBucket;

        return Math.incrementExact((int)needNumOfBuckets);
    }

}



