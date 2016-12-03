package b;

/**
 * 不依赖于具体的底层模块类
 * 松散耦合
 * Created by Administrator on 2016/12/3.
 */

// 强耦合 - 松散耦合 解耦和 解耦
public class Business {
    private DeviceWriter deviceWriter;

    public Business(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void saveData() {
        deviceWriter.saveToDevice();
    }
}
