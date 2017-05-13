import java.util.Observable;
import java.util.Observer;

/**
 * Created by 时光与你 on 2017/5/13.
 */
/*
观察者模式
 */
class House extends Observable{         //被观察对象——房价
    private float price;
    public House(float price){
        this.price = price;
    }
    public float getPrice(){
        return this.price;
    }
    public void setPrice(float price){
        super.setChanged();
        super.notifyObservers();
        this.price = price;
    }

    @Override
    public String toString() {
        return "房子的价格为："+this.price;
    }
}
class HousePriceObser implements Observer{           //观察者
    private String name;

    public HousePriceObser(String name) {       //设置每一个购房者名称
        this.name = name;
    }

    @Override
    //update方法第一个参数为观察者实例，第二个表示修改的内容
    public void update(Observable o, Object arg) {
        if (arg instanceof Float){
            System.out.print(this.name+"观察到价格更改为：");
            System.out.println(((Float)arg).floatValue());
        }
    }
}
public class ObserTest {
    public static void main(String[] args) {
        House h = new House(1000000);
        HousePriceObser hop1 = new HousePriceObser("购房者A");
        HousePriceObser hop2 = new HousePriceObser("购房者B");
        HousePriceObser hop3 = new HousePriceObser("购房者C");
        h.addObserver(hop1);
        h.addObserver(hop2);
        h.addObserver(hop3);
        System.out.println(h);      //输出房子价格
        h.setPrice(6666666);        //修改房子价格
        System.out.println(h);      //输出房子价格
    }
}
