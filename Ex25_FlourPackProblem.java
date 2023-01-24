public class Ex25_FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) { // #1 validation
            return false;
        }

        while (bigCount > 0 && goal >= 5) { // #2 subtract 5 from goal for each bigCount
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal; // #3 make sure enough smallCount to fill remaining goal
    }


    public static boolean canPack2(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) { // #1 validation
            return false;
        }

        int bigCountToUse = bigCount < goal/5 ? bigCount : goal/5 ; // #2 determine how many bigCount to use
        return (goal - bigCountToUse*5) <= smallCount; // #3 evaluate if enough smallCount to fill the rest of the order
    }


    public static boolean canPack3(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) {  // #1 validation
            return false;
        }
        if(bigCount*5 + smallCount < goal) { // #2 supply must be greater than demand
            return false;
        }
        return (goal%5 <= smallCount); // #3 regardless of bigCount, remainder of goal has to be less than smallCount
    }




    public static void main(String[] args) {

        System.out.println( 8 > 9);


//        System.out.println(canPack(5,3,24));
    }

}
