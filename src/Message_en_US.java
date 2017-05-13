import java.util.ListResourceBundle;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class Message_en_US extends ListResourceBundle{
    private final Object data[][] = {{"info","英文，Hello，{0}！"}};
    @Override
    protected Object[][] getContents() {
        return data;
    }
}
