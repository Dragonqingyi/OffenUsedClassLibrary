import java.util.ResourceBundle;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class LanguageInterTest1 {
    public static void main(String[] args) {
        //找到资源文件，不用编写后缀
        ResourceBundle rb = ResourceBundle.getBundle("Message");
        //从资源文件中获取内容
        System.out.println("内容："+rb.getString("info"));
    }
}
