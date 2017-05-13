/**
 * Created by 时光与你 on 2017/5/11.
 */
public class StringBufferTest4 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello ").append("World");
        buf.replace(6,11,"AAA");
        String str = buf.delete(6,15).toString();     //delete删除指定范围的内容
        System.out.println("删除后的结果："+str);
    }
}
