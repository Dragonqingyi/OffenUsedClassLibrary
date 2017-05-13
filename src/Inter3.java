import com.sun.org.apache.regexp.internal.RE;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class Inter3 {
    public static void main(String[] args) {
        Locale zhLoc = new Locale("zh","CN");  //表示中国区
        //找到中文的属性文件，需要指定中文的Local对象
        ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhLoc);
        String st1 = zhrb.getString("info");
        System.out.println("中文："+ MessageFormat.format(st1,"管西京"));
    }
}
