import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class DateTest2 {
    public static void main(String[] args) {
        //Calendar类获取当前时间，抽象类
        Calendar calendar = new GregorianCalendar(); //Calender的子类
        System.out.println("Year:"+calendar.get(Calendar.YEAR));
        System.out.println("Month:"+calendar.get(Calendar.MONTH));
        System.out.println("Day of month:"+calendar.get(calendar.DAY_OF_MONTH));
        System.out.println("Hour of day:"+calendar.get(calendar.HOUR_OF_DAY));
        System.out.println("Minute:"+calendar.get(calendar.MINUTE));
        System.out.println("Second:"+calendar.get(calendar.SECOND));
        System.out.println("Millisecond:"+calendar.get(calendar.MILLISECOND));
    }
}
