public class Ex20_LastDigitChecker {


    public static boolean hasSameLastDigit1 (int num1, int num2, int num3){

        boolean sharedNumber = false;
        int num1Modulus = 0;
        int num2Modulus = 0;
        int num3Modulus = 0;

        if(num1 < 10 || num2 < 10 ||  num3 < 10  || num1 > 99 || num2 > 99 ||  num3 > 99 ){
            sharedNumber = false;
        }else{

            while(num1 != 0){
                num1Modulus = num1 % 10;
                num1 = num1 / 10;
                while(num2 != 0){
                    num2Modulus = num2 % 10;
                    num2 = num2 / 10;
                    if (num1Modulus == num2Modulus){
                        sharedNumber = true;
                    }
                }

                while(num3 != 0){
                    num3Modulus = num3 % 10;
                    num3 = num3 / 10;
                    if (num1Modulus == num3Modulus){
                        sharedNumber = true;
                    }
                }

            }

                while(num2 != 0){
                    num2Modulus = num2 % 10;
                    num2 = num2 / 10;
                    while(num3 != 0){
                        num3Modulus = num3 % 10;
                        num3 = num3 / 10;
                        if (num2Modulus == num3Modulus){
                            sharedNumber = true;
                        }
                    }


                }
            }
        return sharedNumber;
        }

    public static boolean hasSameLastDigit (int num1, int num2, int num3){
        boolean sharedNumber = false;
        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        if(num1 < 10 || num2 < 10 ||  num3 < 10  || num1 > 1000 || num2 > 1000 ||  num3 > 1000 ){
            sharedNumber = false;
        }else{

            if(num1LastDigit == num2LastDigit || num1LastDigit == num3LastDigit || num2LastDigit == num3LastDigit){
                sharedNumber = true;
            }else{
                sharedNumber = false;
            }

        }
        return sharedNumber;
    }

    public static boolean isValid(int number1){
        boolean isValidNumber = false;
        if(number1 < 10 || number1 > 1000 ){
            isValidNumber = false;
        }else{
            isValidNumber = true;
        }
        return isValidNumber;
    }



    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(24, 23,34));

    }
}
