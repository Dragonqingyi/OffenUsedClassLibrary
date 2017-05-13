/**
 * Created by 时光与你 on 2017/5/11.
 */
public interface StringBufferTest1 {
    public static void main(String[] args) {
        //声明StringBuffer对象
        StringBuffer buf = new StringBuffer();
        //向StringBuffer中添加内容
        //只能使用append添加字符串，可以添加任何类型的数据类型
        buf.append("Hello");
        buf.append("world").append("!!!");
        buf.append("\n");
        buf.append("数字=").append(1).append("\n");
        buf.append("字符=").append("C").append("\n");
        buf.append("布尔=").append(true).append("\n");
        System.out.println(buf);
    }
}
