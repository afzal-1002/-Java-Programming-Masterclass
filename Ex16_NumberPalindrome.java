public class Ex16_NumberPalindrome {

    public static boolean isPalindrome(int num){
        int numReverse = 0;
        int actualNumber = num;
        boolean palindrome = false;
        if(num < 0){
            num = Math.abs(num);
            int numAbs = Math.abs(num);
            while(num > 0){
                int lastDigit = num % 10;
                numReverse = (numReverse * 10) + lastDigit;
                num =num /10;
            }

            if (numAbs == numReverse){
                palindrome = true;
            }else{
                palindrome = false;
            }
        }else if(num <= 10) {
            palindrome = false;
        }else{
            while(num > 0){
                int lastDigit = num % 10;
                numReverse = (numReverse * 10) + lastDigit;
                num =num /10;
                System.out.println( "Num Reverse" + numReverse );
            }

            if (actualNumber == numReverse){
                palindrome = true;
            }else{
                palindrome = false;
            }

        }
        return palindrome;
    }




    public static void main(String [] args){

        System.out.println(isPalindrome( -222));

        System.out.println(256 % 10);
        System.out.println(256 / 10);

    }



}
