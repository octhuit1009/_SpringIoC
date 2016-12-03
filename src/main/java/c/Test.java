package c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Created by Administrator on 2016/12/3.
 */
public class Test {
    public static void main(String[] args) {

//        Business business = new Business();
//        business.setDeviceWriter(new USBWriter());
//        business.saveData();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Business business = (Business) applicationContext.getBean("business");
        business.saveData();
    }
}
