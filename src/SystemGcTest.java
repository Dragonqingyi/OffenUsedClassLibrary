/**
 * Created by 时光与你 on 2017/5/11.
 */
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {    //覆写toString方法
        return "姓名："+this.name+",年龄:"+this.age;
    }

    @Override                     //对象释放空间时默认调用此方法
    protected void finalize() throws Throwable {
        System.out.println("对象被释放-->"+this);
    }

}
public class SystemGcTest {
    public static void main(String[] args) {
        Person p = new Person("张三",19);
        p = null;                //断开引用
        System.gc();             //强制释放空间
    }
}
