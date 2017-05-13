/**
 * Created by 时光与你 on 2017/5/11.
 */
public class SystemTest1 {
    /*
    System类的基本使用
    之计算程序的执行时间
     */
    public static void main(String[] args) {
        //取得开始计算之前的时间
        long startTime = System.currentTimeMillis();
        int sum = 0; // 声明变量
        //执行累加操作
        for (int i = 0; i < 30000000; i++) {
            sum += i;
        }
        //取得计算后的时间
        long endTime = System.currentTimeMillis();
        System.out.println("计算所花费的时间："+(endTime - startTime)+"毫秒");
    }
}
