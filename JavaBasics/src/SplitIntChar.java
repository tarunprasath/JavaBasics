import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitIntChar {

        public static void main(String[] args){
            String str = "1a, 12a, 1ab, 12ab, 123a, 123abc";
            Pattern p = Pattern.compile("(?<digit>\\d{1,3})(?<letter>[a-z]{1,3})");
            Matcher m = p.matcher(str);

            while (m.find()){
                System.out.println(m.group("digit")+"/"+m.group("letter"));
            }
        }


}
