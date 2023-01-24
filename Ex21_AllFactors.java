public class Ex21_AllFactors {

    public static void printFactors(int num){
        if(num < 1){
            System.out.println("Invalid Value");
        }else {
            for(int i = 1; i <= num; i++){
                int numberModulus =  num % i;

                if (numberModulus == 0){
                    System.out.println(i);
                }
            }
        }
    }


    public static void main(String arg []){
        printFactors(-2);
    }
}
