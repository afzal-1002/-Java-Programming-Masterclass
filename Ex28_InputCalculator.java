import java.util.Scanner;

public class Ex28_InputCalculator {

    public static void  inputThenPrintSumAndAverage(){


        int count = 0;
        int sum = 0;
        int average = 0;
        int sum2 = 0;
        Scanner scanner = new Scanner(System.in);

        boolean exist = true;

        while (exist){
//            System.out.println("Enter a number , or a character to exit: ");
            String input = scanner.next();
            count++;
            try {
                int enterNumber = Integer.parseInt(input);
                if (enterNumber >= 1) sum += enterNumber;
                sum2 += enterNumber;
                average =  sum / count;
            }catch (Exception ex){
                System.out.println("SUM = " + sum2 + " AVG = " + average);
                exist = false;
            }

        }

    }

    public static void inputThenPrintSumAndAverage2(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
            count++;
            // scanner.nextLine(); // not really needed because we don't need to print an alert for invalid number
            // however, inputting multiple numbers separated by space will add all numbers
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

}
