/**
 * Created by 时光与你 on 2017/5/11.
 */
public class StringBufferTest3 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello");
        buf.append("World");
        buf.replace(6,11,"AAA"); //replace替换指定范围内的内容
        System.out.println("内容替换后的结果："+buf);
        System.out.println("截取后的内容："+buf.substring(3,8));   //substring截取指定范围内的内容
    }
}
