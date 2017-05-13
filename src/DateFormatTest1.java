import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class DateFormatTest1 {
    public static void main(String[] args) {
        DateFormat df1 = null;
        DateFormat df2 = null;
        //得到日期的DateFormat对象
        df1 = DateFormat.getDateInstance();
        //得到时间的DateFormat对象
        df2 = DateFormat.getDateTimeInstance();
        //按照日期格式化
        System.out.println("DATE:"+df1.format(new Date()));
        //按照时间格式化
        System.out.println("DATETIME:"+df2.format(new Date()));
    }
}
