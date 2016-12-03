package c;

/**
 * IoC   Inversion of Control  控制反转
 * Created by Administrator on 2016/12/3.
 */
public class Business {
    private DeviceWriter deviceWriter;

//    public Business(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;
//    }


    public void setDeviceWriter(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void saveData() {
        deviceWriter.saveToDevice();
    }
}
