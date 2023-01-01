public class Ex14_NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        boolean leapYear = false;
        if((year >= 1 ) && (year <= 9999)){
            if( (year % 4 == 0) && (year % 100 != 0)){
                leapYear = true;
            } else if (year % 400 == 0) {
                leapYear = true;
            }
        }
        return leapYear;
    }

    public static int getDaysInMonth(int month, int year){
        boolean leapYear = isLeapYear(year);
        if ( month < 1  || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            return 31;
            case 2:
            if(leapYear){
                return 29;
            }else{
                return 28;
            }
            case 4: case 6: case 9: case 11:
            return 30;
            default:
                return -1;
        }
    }


    public  static void sumChallenge(){
       int num = 0;
       int sum = 0;
        for(int i = 1;  i <= 1000; i++){
            if( (i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Found a Match = " + i);
                num++;
                sum += i;
            }
            if (num == 5){
                System.out.println("Total Sum is = " + sum);
                break;
            }
        }
    }



    public static void main(String[] args) {
//        System.out.println(isLeapYear(10000));
//        System.out.println( 10000 <= 9999 );
//        System.out.println(getDaysInMonth(1,1000));
//
//        int num1 = 0;
//        if (num1 >= 1){
//            System.out.println("Greater");
//        }else{
//            System.out.println("Shorter");
//        }

        sumChallenge();


    }
}
