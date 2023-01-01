public class Ex9_AreaCalculator {

    public static double area( double radius){
        if (radius < 0 ){
            return -1.0;
        }else{
            return (Math.pow(radius,2) * Math.PI);
        }
    }
    public static double area( double x, double y){
        if ((x < 0) || (y<0) ){
            return -1.0;
        }else{
            return x * y;
        }
    }

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(1.75,5.5));
    }

}
