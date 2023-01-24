public class Ex23_PerfectNumber {

    public static boolean isPerfectNumber(int num1){
        boolean perfectNumber = false;

        if (num1 < 2){
            perfectNumber = false;
        }else{
            int numModulus = 0;
            int tempNum = num1;
            int totalSum = 0;
            for (int i = 1; i <=  num1 ; i++) {
                numModulus = num1 % i;
                if (numModulus == 0){
                    totalSum += i;
//                    System.out.println(totalSum);
                    if (totalSum ==tempNum ){
//                        System.out.println( "totalSum --> " + totalSum);
                        perfectNumber = true;
                    }
                }

            }
        }
        return perfectNumber;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }
}
