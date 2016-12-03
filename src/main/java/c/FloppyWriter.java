package c;

/**
 * Created by Administrator on 2016/12/3.
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void saveToDevice() {
//        ...
        System.out.println("saved to floppy...");
    }
}
