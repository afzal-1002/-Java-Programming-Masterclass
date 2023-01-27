import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

//        int num = 4;
//        switch(num){
//            case 1:
//                System.out.println("Number is 1");
//                break;
//            case 2:
//                System.out.println("Number is 2");
//                break;
//            case 3:
//                System.out.println("Number is 3");
//                break;
//            case 4:
//                System.out.println("Number is 4");
//                break;
//            default:
//                System.out.println("Default value is 15");
//        }
//
//        int month = 15;
//        switch (month){
//            case 1 -> System.out.println("Month is January ");
//            case 2 -> System.out.println("Month is February ");
//            case 3 -> System.out.println("Month is March ");
//            case 4 -> System.out.println("Month is April");
//            case 5 -> System.out.println("Month is May");
//            case 6 -> System.out.println("Month is June");
//            case 7 -> System.out.println("Month is July");
//            case 8 -> System.out.println("Month is August");
//            case 9 -> System.out.println("Month is September");
//            case 10 -> System.out.println("Month is October ");
//            case 11 -> System.out.println("Month is November ");
//            case 12 -> System.out.println("Month is December ");
//            default -> System.out.println("This is not a Month ");
//        }
//        Series series = new Series();
//        System.out.println(series.publicVar);
//
//
//        System.out.println(series.defaultVar);
//        System.out.println(series.protectedVar);

//        String name = "abcdefghijklmnopqrstuvwxyz12348";
//        System.out.println(name.replaceAll(".","A"));
//        System.out.println(name.replaceAll("^abcd","***")); /// Replace all (abcd)  with (*)
//
//        System.out.println(name.matches("^abcd")); /// Replace all (abcd)  with (*)
//
//        System.out.println(name.replaceAll("wxyz$","***")); /// Replace all (wxyz)  with (***)
//
//        System.out.println(name.replaceAll("[ekz]","***")); /// Replace all ([efg])  with (***)
//
//        System.out.println(name.replaceAll("[ekz][fln]","***")); /// Replace all ([efg])  with (***)
//        String name2 = "abcdefghiiijjjklmnopqrstuvwxyz12348";
//        System.out.println(name.replaceAll("^h+i*j","^"));


//
//        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
//        htmlText.append("<h2>Sub-heading</h2>");
//        htmlText.append("<p>This is a paragraph about something.</p>");
//        htmlText.append("<p>This is another paragraph about something else.</p>");
//        htmlText.append("<h2>Summary</h2>");
//        htmlText.append("<p>Here is the summary.</p>");
//
//        String h2Pattern = "<h2>";
//        Pattern pattern = Pattern.compile(h2Pattern);
//        Matcher matcher = pattern.matcher(htmlText);
//        System.out.println(matcher.matches());
//
//        matcher.reset();
//        int count = 0;
//        while(matcher.find()) {
//            count++;
//            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
//
//        }
//
//        String h2GroupPattern = "(<h2>.*?</h2>)";
//        Pattern groupPattern = Pattern.compile(h2GroupPattern);
//        Matcher groupMatcher = groupPattern.matcher(htmlText);
//        System.out.println(groupMatcher.matches());
//        groupMatcher.reset();
//
//        while(groupMatcher.find()) {
//            System.out.println("Occurrence: " + groupMatcher.group(1));
//        }
//
//        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
//        Pattern h2TextPatten = Pattern.compile(h2TextGroups);
//        Matcher h2TextMatcher = h2TextPatten.matcher(htmlText);
//
//        while(h2TextMatcher.find()) {
//            System.out.println("Occurrence: " + h2TextMatcher.group(2));
//        }

//        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4} {x, y}, {6, 34}, {11, 12}";
//        String pattern1 = "";
//        String pattern2 = "[{][\\d][,][\\d][}]";
//        Pattern pattern11a = Pattern.compile("\\{(\\d+[,] \\d+)\\}"); // Only Digit between curly braces "\\{(\\d+, \\d+)\\}"
//        Matcher matcher11a = pattern11a.matcher(challenge11a);
//        while(matcher11a.find()) {
//            System.out.println("Occurrence: " + matcher11a.group(1));
//        }

      IntPredicate greater = i -> i >15;

        List<String> listString = Arrays.asList(
                "Z40", "K36","N40", "N36", "B12", "F12",
                "B69", "G53", "G49", "G60", "G50", "X12",
                "g64", "I26", "I17", "I29", "O71", "A45");

//        listString.sort((String s1, String s2) -> s1.compareToIgnoreCase(s2));
//        listString.forEach((s1) -> System.out.println(s1));
//        listString.sort(( s1,  s2) -> s1.compareToIgnoreCase(s2));
//        listString.forEach((s1) -> System.out.println(s1));

        for(String string: listString){
            string2 = string;
            System.out.println(ThreadColor.ANSI_CYAN + string.toUpperCase());
        }

        listString.stream().map(String::toUpperCase).filter(s -> s.startsWith("G")).forEach(System.out::println);

    }
    public static String string2;
    }

