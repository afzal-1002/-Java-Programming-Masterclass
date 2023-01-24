import java.math.BigDecimal;

public class Ex29_PaintJob {

    public static int getBucketCount(double width, double height , double areaPerBucket, int extraBuckets){
        int sumOfBecket = 0;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            sumOfBecket = -1;
        }else{
            double totalArea = width  * height;
            double totalBuckets = totalArea / areaPerBucket;

//            System.out.println(" totalBuckets " + totalBuckets);

            sumOfBecket = (int) (totalBuckets - extraBuckets);

//            System.out.println("sumOfBecket  " + sumOfBecket);

            if(totalBuckets > sumOfBecket){
                sumOfBecket += 1;
            }
//            System.out.println(" sumOfBecket After add 1 " + sumOfBecket);
        }
        return sumOfBecket;
    }

    public static int getBucketCount(double width, double height , double areaPerBucket){
        int sumOfBecket = 0;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            sumOfBecket = -1;
        }else{
            double totalArea = width  * height;
            double totalBuckets = totalArea / areaPerBucket;
//            System.out.println(totalBuckets);
            sumOfBecket = (int) Math.round(totalBuckets);
            if(totalBuckets > sumOfBecket){
                sumOfBecket += 1;
            }
//            System.out.println(sumOfBecket);
        }
        return sumOfBecket;
    }

    public static int getBucketCount(double width, double height ){
        int sumOfBecket = 0;
        if(width <= 0 || height <= 0 ){
            sumOfBecket = -1;
        }else{
            double totalBuckets = width  / height;
            System.out.println(totalBuckets);
            sumOfBecket = (int) Math.round(totalBuckets);
            System.out.println(sumOfBecket);
            if(totalBuckets > sumOfBecket){
                sumOfBecket += 1;
            }
        }
        return sumOfBecket;
    }

    public static void main(String[] args) {
//        System.out.println(getBucketCount(3.4,2.1,1.5, 2));
//        System.out.println(getBucketCount(2.75,3.25,2.5));
        System.out.println(getBucketCount(3.4,1.5));




//        double answer = Math.pow(1.10, 2);
//        System.out.println(answer);
////        int ans = (int)answer;
//       int ans = (int)(Math.round(answer *100.0)/100.0);
////
//        System.out.println( "Answer New " + ans);
//
//        System.out.println(1.12 > 1 && 1.12 < 2);

    }

}
