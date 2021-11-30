import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class reg {
    public static void main(String[] args) {
        String target = "bbbaaerererbbtrt";
        Pattern p = Pattern.compile("[b]?");
        //Pattern p1=Pattern.compile("abc",Pattern.CASE_INSENSITIVE);
        int ctr = 0;
        Matcher m = p.matcher(target);
        while (m.find()) {
            ctr++;
            System.out.println(m.start() + " " + m.end() + " " + m.group());//it will print more info about the matching string
        }
        System.out.println();
        String s1 = "9876543210";
        System.out.println(s1.matches("(0|91)?[7-9][0-9]{9}"));
    }
}