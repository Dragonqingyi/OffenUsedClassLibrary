import org.omg.SendingContext.RunTime;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class RunTimeTest1 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("JVM最大内存量："+run.maxMemory());
        System.out.println("JVM空闲内存量："+run.freeMemory());
        String str = "Hello"+" World"+"To "+"Beijing"+"~";
        System.out.println(str);
        for (int i = 0; i < 1000; i++) {
            str += i;   //循环修改内容，会产生很多垃圾
        }
        System.out.println("操作String之后的JVM空闲内存量:"+run.freeMemory());
        run.gc();  //垃圾回收，释放空间
        System.out.println("垃圾回收之后的JVM空闲内存量:"+run.freeMemory());
    }
}
