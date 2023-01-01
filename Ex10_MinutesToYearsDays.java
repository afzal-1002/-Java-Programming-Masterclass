public class Ex10_MinutesToYearsDays {

    public static void printYearsAndDays(long minute){

        int hour =  (int) minute/60;
        int day = hour / 24;
        int year = day/365;
        int dayRemainder = day % 365;

        if (minute < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(minute + " min = " + year + " y and " + dayRemainder + " d" );
        }
    }


    public static void main(String[] args) {
        printYearsAndDays(561600  );
        System.out.println(390 % (365) );
    }

}
