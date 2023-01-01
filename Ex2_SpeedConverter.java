public class Ex2_SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        long result = Math.round((kilometersPerHour / 1.609));
        if (result < 0){
            return -1;
        }else{
            return result;
        }
    }

    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);
        if (result == -1){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
    public static void main(String[] args) {

    }

}


