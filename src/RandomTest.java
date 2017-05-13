import java.util.Random;

/**
 * Created by 时光与你 on 2017/5/13.
 */
public class RandomTest {
    public static void main(String[] args) {
        Random a = new Random();             //随机产生数类
        for (int i = 0; i < a.nextInt(100); i++) {
            System.out.println(a.nextDouble(  )+"\t");
        }
    }
}
