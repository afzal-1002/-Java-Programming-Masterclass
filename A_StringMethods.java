public class A_StringMethods {


    public static void main(String[] args) {

//        printInformationString("Hello World");

        String birthDate = "25/11/2022";

        int startingIndex = birthDate.indexOf("2022");
        System.out.println("Starting Index = " + startingIndex);
        System.out.println("Birth Year = " + birthDate.substring(startingIndex));

        System.out.println("Birth Date = " + birthDate.substring(0,2));
        System.out.println("Birth Month = " + birthDate.substring((birthDate.indexOf('/') +1),5));
        String newDate = String.join("/","25","11","2022");
        System.out.println("New Date = " + newDate);

       String newDate1 = "25";
        newDate1 =  newDate1.concat("/");
        newDate1 =  newDate1.concat("11");
        newDate1 =  newDate1.concat("/");
        newDate1 =  newDate1.concat("2022");
        System.out.println("New Date1 = " + newDate1);
        newDate = "25" + "/" + "11" + "/" + "2022";
        System.out.println("New Date = " + newDate);
        newDate1 = "25".concat("/").concat("11").concat("/").concat("2022");
        System.out.println("New Date = " + newDate1);

        System.out.println("Replace Method = " + newDate.replaceAll("/","-"));


        System.out.println("Repeat Method = " + "ABC\n".repeat(3));
        System.out.println("Repeat Method = " + "--".repeat(5));

        System.out.println(  "ABC\n".repeat(3).indent(8));
        System.out.println( "*".repeat(20));

        System.out.println(  "    ABC\n".repeat(3).indent(-2));
        System.out.println( "*".repeat(20));

    }


    public static void printInformationString(String string){

        int length = string.length();
        System.out.printf("Length of given String is = %d %n", length);


        boolean empty = string.isEmpty();
        if(empty){
            System.out.printf("String is Empty! %n");
        }else {
            System.out.println(string);
            char chr = string.charAt(0);
            System.out.printf("Character at index 0 = %c %n" ,chr);
            System.out.printf("Last Character  = %c %n" ,string.charAt(length -1));

            System.out.println("Index of r = " + string.indexOf('r'));
            System.out.println("Index of World = " + string.indexOf("World"));
            System.out.println("Last index of l = " + string.lastIndexOf('l',0));
            System.out.println("First  index of l = " + string.indexOf('l',0));
            System.out.println("Second l index  = " + string.indexOf('l',(string.indexOf('l',0)+1)));

            System.out.println("String equal to = Hello World " + string.equals("Hello World"));
            System.out.println("String Start with, Hello " +  string.startsWith("Hello"));
            System.out.println("String End with, World " +  string.endsWith("World"));
//            System.out.println("String Contains, World " +  string.concat("World"));

        }

        if(string.isBlank()){
            System.out.println("String is Blank!");
        }


    }


}
