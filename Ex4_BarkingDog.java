public class Ex4_BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay > 23 || hourOfDay < 0) {
            return false;
        } else if ((hourOfDay > 22 || hourOfDay < 8) && barking == true ) {
            return true;
        } else  {
            return false;
        }
    }




    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false,6));
    }
}
