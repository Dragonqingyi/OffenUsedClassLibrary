import java.util.ListResourceBundle;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class Message_fr_FR extends ListResourceBundle{
    private final Object data[][] = {{"info","法语，Bonjour，{0}！"}};

    @Override
    protected Object[][] getContents() {
        return data;
    }
}
