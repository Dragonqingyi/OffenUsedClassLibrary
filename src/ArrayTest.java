import java.util.Arrays;

/**
 * Created by 时光与你 on 2017/5/13.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int temp[] = {3,4,5,7,9,1,2,6,8};
        Arrays.sort(temp);                  //数组排序
        System.out.println("排序后的数组："+Arrays.toString(temp));    //以字符串输出数组
        int point = Arrays.binarySearch(temp,3);   //二分查找必须是排序后的数组
        System.out.println("元素3的位置在："+point);
        Arrays.fill(temp,3);           //填充数组，全部以一个元素填充
        System.out.println("数组填充："+Arrays.toString(temp));
    }
}
