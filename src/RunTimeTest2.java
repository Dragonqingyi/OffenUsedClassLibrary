/**
 * Created by 时光与你 on 2017/5/11.
 */
public class RunTimeTest2 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("notepad.exe");
             //调用本机记事本程序，此方法需要异常处理
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
