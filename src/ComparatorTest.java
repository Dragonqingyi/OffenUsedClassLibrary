import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by 时光与你 on 2017/5/13.
 */
class Student1{
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {                 //覆写equals方法
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Student1)){
            return false;
        }

        Student1 stu = (Student1)obj;
        if (stu.name.equals(this.name) && stu.age == this.age){
            return true;
        }else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name+"\t\t"+this.age;
    }
}
/*
另一个不错的排序方法
 */
class StudentComparator implements Comparator<Student1> {     //实现比较器
   public int compare(Student1 s1,Student1 s2){
       if (s1.equals(s2)){
           return 0;
       }else if (s1.getAge() < s2.getAge()){
           return 1;
       }else {
           return -1;
       }
   }
}
public class ComparatorTest {
    public static void main(String[] args) {
        Student1 stu[] = {new Student1("张三",20)
        ,new Student1("李四",22)
        ,new Student1("王五",20)
        ,new Student1("赵六",20)
        ,new Student1("孙七",22)
        };
        Arrays.sort(stu,new StudentComparator());
        for (Student1 i:stu) {
            System.out.println(i);

        }
    }
}
