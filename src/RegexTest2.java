import javafx.scene.paint.Material;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 时光与你 on 2017/5/13.
 */
public class RegexTest2 {
    /*
    正则表达式取限定字符串中内容
     */
    public static void main(String[] args) {
        String str = "A1B22C333D444E55555F";
        String pat = "\\d+";
        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(str);
        String newStr = m.replaceAll("_");
        System.out.println(newStr);
    }
}
