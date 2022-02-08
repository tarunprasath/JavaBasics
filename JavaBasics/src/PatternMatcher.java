
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

        public static void main(String[] args){
            String input1 = "abc";
            String input2 = "1234";

            // regular expression for an integer number
            String regex = "[+-]?[0-9]+";

            // compiling regex
            Pattern p = Pattern.compile(regex);

            // Creates a matcher that will match input1 against regex
            Matcher m = p.matcher(input1);

            // If match found and equal to input1
            if (m.find() && m.group().equals(input1))
                System.out.println(input1 + " is a valid integer number");
            else
                System.out.println(input1 + " is not a valid integer number");

            // Creates a matcher that will match input2 against regex
            m = p.matcher(input2);

            // If match found and equal to input2
            if (m.find() && m.group().equals(input2))
                System.out.println(input2 + " is a valid integer number");
            else
                System.out.println(input2 + " is not a valid integer number");
        }
    }
