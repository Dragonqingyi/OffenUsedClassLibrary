import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by 时光与你 on 2017/5/13.
 */
public class MyTaskTest extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf = null;
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("当前系统时间为："+sdf.format(new Date()));
    }
}
