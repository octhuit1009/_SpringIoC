package a;

/**
 * 高层应用类
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
