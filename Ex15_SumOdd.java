public class Ex15_SumOdd {

    public static boolean isOdd(int num){
        boolean oddNumber = false;
        if (!(num > 0)){
            oddNumber = false;
        }else {
            if( !(num % 2 == 0)){
                oddNumber = true;
            }else{
                oddNumber = false;
            }
        }
        return oddNumber;
    }

    public static int sumOdd(int startNumber, int endNumber){
        int sum = 0;
        if( (startNumber > 0) && (endNumber > 0) && (endNumber >= startNumber) ){
            for (int i = startNumber; i <= endNumber; i++ ){
                if(isOdd(i)){
                    sum += i;
                }
            }
        }else {
            sum = -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(9));
        System.out.println(sumOdd(10,5));
    }
}
