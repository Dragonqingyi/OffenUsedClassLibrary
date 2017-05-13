import java.util.Arrays;

/**
 * Created by 时光与你 on 2017/5/13.
 */
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private float score;

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return name+"\t\t"+this.age+"\t\t"+this.score;
    }
    @Override
    public int compareTo(Student stu) {          //一个不错的排序方法
        if (this.score > stu.score){
            return -1;
        }else if (this.score < stu.score){
            return 1;
        }else {
            if (this.age > stu.age){
                return 1;
            }else if (this.age < stu.age){
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}
public class CompareTest {
    public static void main(String[] args) {
        Student stu[] = {new Student("张三",20,90.0f)
        ,new Student("李四",22,90.0f)
        ,new Student("赵六",20,70.0f)
        ,new Student("王五",20,99.0f)
        ,new Student("孙七",22,100.0f)};
        Arrays.sort(stu);
        for (Student i:stu) {            //foreach遍历数组更简单简捷
            System.out.println(i);
        }
    }
}
