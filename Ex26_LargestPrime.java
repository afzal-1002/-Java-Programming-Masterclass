public class Ex26_LargestPrime {

    public  static  int getLargestPrime1(int num){

        if(num < 2){
            return -1 ;
        }else {
            int tempMNumber = 0;
            for (int i = 2; i < num ; i++) {
                int numModulus = num % i;
                if(numModulus == 0){
                    num  /= i;
                     i--;
                    }
                }
            }
            return num;
        }

    public  static  int getLargestPrime(int num){
        int result = 0;
        if(num < 2){
            return -1 ;
        }else {
            int tempMNumber = 0;
            for (int i = 2; i < num ; i++) {
                int numModulus = num % i;
                if(numModulus == 0){
                    if( i > tempMNumber ) tempMNumber = i; result = i;
//                    System.out.println(tempMNumber);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }


}
