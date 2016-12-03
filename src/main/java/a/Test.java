package a;

/**
 * 测试类
 * Created by Administrator on 2016/12/3.
 */
public class Test {
    public static void main(String[] args) {
//        Business business = new Business(new FloppyWriter());
        Business business = new Business(new USBWriter());
        business.saveData();
    }
}
