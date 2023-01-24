public class Ex27_DiagonalStar {

    public static void printSquareStar(int num){
        if(num < 5){
            System.out.println("Invalid Value");
        }else {

            for (int i = 0; i < num; i++) { // Row
                for (int j = 0; j < num  ; j++) { // Column
                    if (i == 0 || j == 0 || i == j
                            || i == num - 1 || j == num -1 // Last Row
                            || j == num - ( i  + 1)){ // when column is equal to = rowcount - current row + 1
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        printSquareStar(5);
    }


}
