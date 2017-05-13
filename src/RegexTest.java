import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 时光与你 on 2017/5/13.
 */
public class RegexTest {
    public static void main(String[] args) {
        //指定一个日期格式的字符串
        String str = "1998-07-27";
        //指定好正则表达式
        String pat = "\\d{4}-\\d{2}-\\d{2}";
        //实例化Pattern类
        Pattern p = Pattern.compile(pat);
        //实例化Matcher类
        Matcher m = p.matcher(str);
        if (m.matches()){   //进行验证的匹配，使用正则
            System.out.println("日期格式合法");
        }else {
            System.out.println("日期格式不合法");
        }
    }
}
