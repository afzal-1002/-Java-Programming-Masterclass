public class Ex8_TeenNumberChecker {

    public static boolean hasTeen1(int num1, int num2,int num3) {
        int [] rangeTeen = {13,1,15,16,17,18,19};
        for (int i = 0; i < rangeTeen.length; i++) {
			if (num1 == rangeTeen[i] || num2 == rangeTeen[i] || num3 == rangeTeen[i]) return true;
		}
        return false;
    }

    public static boolean hasTeen(int num1, int num2,int num3) {
     if ((num1 >= 13 && num1  <= 19) || (num2 >= 13 && num2  <= 19) ||
             (num3 >= 13 && num3  <= 19) ){
         return true;
        }else {
         return false;
     }
    }

    public static boolean isTeen(int num){
        if (num >= 13 && num <= 19){
            return true;
        }else{
            return false;
        }
    }

    public static boolean hasTeen(int num1, int num2){
        if ((num1 >= 10 && num1 <= 19) || (num2 >= 13 && num2 <= 19)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(12,10,15));
        System.out.println(hasTeen(12,1));
        System.out.println(isTeen(9));

    }
}
