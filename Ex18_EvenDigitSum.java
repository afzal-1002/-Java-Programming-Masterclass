public class Ex18_EvenDigitSum {


    public static int getEvenDigitSum(int num){
        int totalSum = 0;
        int remainderNum = 0;
        if (num < 0){
            return -1;
        } else if (num ==0) {
            return 0;
        }else {
            while (num != 0){
                remainderNum = num % 10;
                switch (remainderNum){
                    case 2:
                        totalSum = totalSum + 2;
                        break;
                    case 4:
                        totalSum = totalSum + 4;
                        break;
                    case 6:
                        totalSum = totalSum + 6;
                        break;
                    case 8:
                        totalSum = totalSum + 8;
                        break;
                    default:
                        totalSum = totalSum + 0;
                        break;
                }
        num = num /10;
            }
        }
        return totalSum;
    }



    public static void main(String[] args) {

        System.out.println( getEvenDigitSum(15));

    }




}
