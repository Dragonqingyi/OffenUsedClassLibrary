import java.text.*;

/**
 * Created by 时光与你 on 2017/5/13.
 */
public class NumberFormatTest {
    public static void main(String[] args) {
        //声明一NumberFormat对象
        //NumberFormat是表示数字格式化的类
        NumberFormat nf = null;
        //得到默认的数字格式化显示
        nf = NumberFormat.getInstance();
        System.out.println("格式化之后的数字："+nf.format(10000000));
        System.out.println("格式化之后的数字："+nf.format(1000.345));

    }
}
