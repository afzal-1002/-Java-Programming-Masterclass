public class Ex6_DecimalComparator {

        public static boolean areEqualByThreeDecimalPlaces(double num1_d, double num2_d) {

        double num1 = (num1_d * 1000);
        double num2 = (num2_d * 1000);
        int result1 = (int) num1;
        int result2 = (int) num2;


        if (result1 == result2){
           return true;

        }else{
            return false;
        }

        }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
    }
}
