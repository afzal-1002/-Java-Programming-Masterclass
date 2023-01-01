public class Ex19_SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2){
        boolean sharedNumber = false;
        if(num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99 ){
            sharedNumber = false;
        }else{

            int digit1 = 0;
            int digit2 = 0;
            int num3 = num2;

            while (num1 != 0) {
                digit1 = num1 % 10;
                System.out.println(digit1);
                num1 = num1 / 10;
                num2 = num3;
                while (num2 != 0) {
                    digit2 = num2 % 10;
                    num2 = num2 / 10;
                    if (digit1 == digit2) {
                        sharedNumber = true;
                    }
                }
            }

            System.out.println(digit1);
        }
        return sharedNumber;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
    }

}
