import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex24_ReverseNumber_NumCount {

    public static void numberToWords1(int num){
        if (num < 0){
            System.out.println("Invalid Value");
        }else {
            while (num != 0){
                int numModulus10 = num % 10;
                num = num /10;
                switch (numModulus10){
                    case 0 -> {System.out.println("Zero");}
                    case 1 -> {System.out.println("One");}
                    case 2 -> {System.out.println("Two");}
                    case 3 -> {System.out.println("Three");}
                    case 4 -> {System.out.println("Four");}
                    case 5 -> {System.out.println("Five");}
                    case 6 -> {System.out.println("Six");}
                    case 7 -> {System.out.println("Seven");}
                    case 8 -> {System.out.println("Eight");}
                    case 9 -> {System.out.println("Nine");}
                }
            }
        }
    }

    public static void numberToWords(int num){
        int TemNum = num;
        if (num == 0){
            System.out.println("Zero");
        }
        if (num < 0){
            System.out.println("Invalid Value");
        }else {
            String numberWords = "";
            while (num != 0){
                int numModulus10 = num % 10;
                num = num /10;
                switch (numModulus10){
                    case 0 :
                        numberWords =  "Zero " + numberWords;
                        break;
                    case 1:
                        numberWords =  "One " + numberWords;
                        break;
                    case 2:
                        numberWords =  "Two " + numberWords;
                        break;
                    case 3:
                        numberWords =  "Three " + numberWords;
                        break;
                    case 4:
                        numberWords =  "Four " + numberWords;
                        break;
                    case 5:
                        numberWords =  "Five " + numberWords;
                        break;
                    case 6:
                        numberWords =  "Six " + numberWords;
                        break;
                    case 7:
                        numberWords =  "Seven " + numberWords;
                        break;
                    case 8:
                        numberWords =  "Eight " + numberWords;
                        break;
                    case 9:
                        numberWords =  "Nine " + numberWords;
                        break;
                }
            }

            System.out.println(numberWords);
        }
    }

    public static int getDigitCount(int num){
        int digitCount = 0;

        if (num == 0){
            digitCount = 1;
        }

        if (num < 0){
            digitCount = -1;
        }else{
            while (num != 0){
                int numModulus = num % 10;
                num = num / 10;
                digitCount +=1;
            }
//            System.out.println(digitCount);
        }
        return digitCount;
    }

    public static int reverse(int num){
            int tempNum = num;
            if(num < 0){
                num *= -1;
            }
            int reverseNum = 0;
            String reverseNumber = "";
            while (num != 0){
                int numModulus10 = num % 10;
                num = num /10;
                switch (numModulus10){
                    case 0 :
                        reverseNumber += "0";
                        break;
                    case 1:
                        reverseNumber += "1";
                        break;
                    case 2:
                        reverseNumber += "2";
                        break;
                    case 3:
                        reverseNumber += "3";
                        break;
                    case 4:
                        reverseNumber += "4";
                        break;
                    case 5:
                        reverseNumber += "5";
                        break;
                    case 6:
                        reverseNumber += "6";
                        break;
                    case 7:
                        reverseNumber += "7";
                        break;
                    case 8:
                        reverseNumber += "8";
                        break;
                    case 9:
                        reverseNumber += "9";
                        break;
                }
            }

            reverseNum = Integer.parseInt(reverseNumber);
            if(tempNum < 0){
                reverseNum *= -1;
            }else{
                reverseNum *= 1;
            }
        System.out.println(reverseNum);
        return reverseNum;

    }

    public static void main(String[] args) {

//        numberToWords(4);
//        reverse(-45567);
//        System.out.println(getDigitCount(-5));
        SimpleDateFormat formatter = new SimpleDateFormat("DD-MM-YYYY");
        Date date = new Date();
        System.out.println(date);
        System.out.println(formatter.format(date));
    }

}
