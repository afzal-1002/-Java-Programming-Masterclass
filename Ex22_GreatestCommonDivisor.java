public class Ex22_GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int num1, int num2){
        int num3 = 0;
        int tempNum2 = num2;

        if(num1 < 10 || num2 < 10){
            return num3 = -1;
        }else{
            for (int i = 1; i <= num1; i++) {
                int num1Mod = num1 % i;
                if (num1Mod == 0){
                    num2 = tempNum2;
                    for (int j = 1; j <= num2; j++) {
                        int num2Mod = num2 % j;
                        if(num2Mod == 0){
                            int tempMod1 = i;
                            if (num1Mod == num2Mod){
                                if (i > 1 && i == j){
                                    num3 = i;
                                }
                            }
                        }
                    }

                }
            }

        }


        return num3;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }
}
