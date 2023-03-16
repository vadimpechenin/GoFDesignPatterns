package bridge;


/**
 * Вы можете расширять класс пультов не трогая
 * код устройств
 */
public class AdvancedRemote extends Remote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
    }
}
