public class Main {
    public static void main(String[] args) {
//        Ex1_PositiveNegativeZero.checkNumber(-10);
//       long milesPerHour = Ex2_SpeedConverter.toMilesPerHour(75.114);
//        System.out.println(milesPerHour);
//
//        Ex2_SpeedConverter.printConversion(75.114);
//
//        Ex3_MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//
//        System.out.println("Muhammad Afzal");
//
//        for (int i = 0; i <= 10; i++){
//            System.out.println(i + " Muhammad Afzal" );
        ///// Switch

        int num = 4;
        switch(num){
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            default:
                System.out.println("Default value is 15");
        }

        int month = 15;
        switch (month){
            case 1 -> System.out.println("Month is January ");
            case 2 -> System.out.println("Month is February ");
            case 3 -> System.out.println("Month is March ");
            case 4 -> System.out.println("Month is April");
            case 5 -> System.out.println("Month is May");
            case 6 -> System.out.println("Month is June");
            case 7 -> System.out.println("Month is July");
            case 8 -> System.out.println("Month is August");
            case 9 -> System.out.println("Month is September");
            case 10 -> System.out.println("Month is October ");
            case 11 -> System.out.println("Month is November ");
            case 12 -> System.out.println("Month is December ");
            default -> System.out.println("This is not a Month ");
        }



    }
    }

