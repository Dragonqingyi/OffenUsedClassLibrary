import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 时光与你 on 2017/5/13.
 */
public class SimpleDateFormastTest {
    public static void main(String[] args) {
        //创建第一个模板，从字符串中提取出日期数字
        String strDate = "2017-5-12 17:11:30:345";
        //创建第二个模板，将提取后的日期数字变为指定的格式
        String pat1 = "yyyy-MM-dd HH:mm:ss:SSS";
        String pat2 = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒";
        //实例化模板对象
        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
        //实例化模板对象
        SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
        Date d = null;
        try {
            d = sdf1.parse(strDate);   //将给定字符串中的日期提取出来
        }catch (Exception e){          //如果提供的字符串格式有错误，进行异常处理
            e.printStackTrace();       //打印异常信息
        }
        System.out.println(sdf1.format(d));
        System.out.println(sdf2.format(d));  //打印新的日期格式
    }
}
