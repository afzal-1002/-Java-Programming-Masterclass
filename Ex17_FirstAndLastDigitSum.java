public class Ex17_FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int num){
        int lastDigit = 0;
        int  firstDigit = 0;
        int divisor;
        int totalDigits = 0;
        int totalSum = 0;

        if(num < 10 && num > 0){
            totalSum = num + num;
            System.out.println(" Inside  Less Than 10 ");
        } else if (num < 0) {
            totalSum = -1 ;
            System.out.println(" Inside  Less Than Zero ");
        } else if (num == 0) {
            totalSum = 0;
        }else {
            int realNumber  = num;
            lastDigit = num % 10;

            while(num != 0){
                totalDigits++;
                num = num/10;
            }

            divisor = (int)Math.pow(10, totalDigits-1);
            firstDigit = realNumber / divisor;

            totalSum =  firstDigit +  lastDigit;
        }
        return totalSum;

    }
    public static int findDigit(int num){
        int count = 0;
        while(num > 1){
            count++;
            num = num/10;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(0));
    }

}
