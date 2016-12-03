package a;

/**
 * 高层应用类强烈依赖于底层模块类
 * 底层控制高层
 * 强耦合
 * Created by Administrator on 2016/12/3.
 */
public class Business {
//    private FloppyWriter floppyWriter;

    private USBWriter usbWriter;

//    public Business(FloppyWriter floppyWriter) {
//        this.floppyWriter = floppyWriter;
//    }

    public Business(USBWriter usbWriter) {
        this.usbWriter = usbWriter;
    }

    public void saveData() {
//        floppyWriter.saveToFloppy();
        usbWriter.saveToUSB();
    }
}
