import java.util.ListResourceBundle;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class Message_zh_CN extends ListResourceBundle {
    private final Object data[][] = {{"info","中文，好的，{0}！"}};

    @Override
    protected Object[][] getContents() {  //覆写的方法
        return data;
    }
}
