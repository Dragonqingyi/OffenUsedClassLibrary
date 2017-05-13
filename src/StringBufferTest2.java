/**
 * Created by 时光与你 on 2017/5/11.
 */
public class StringBufferTest2 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("World");
        buf.insert(0,"Hello ");  //在任意位置处添加内容
        System.out.println(buf);
        buf.insert(buf.length(),"MM~");
        System.out.println(buf);
    }
}
