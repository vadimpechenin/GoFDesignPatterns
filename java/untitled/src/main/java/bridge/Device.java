package bridge;


/**
 * Все устройства  имеют  общий  интерфейс. Поэтому  с  ними
 * может работать  любой  пульт.
 */
public interface Device {
    public boolean isEnabled();
    public void enable();
    public void disable();
    public int getVolume();
    public void setVolume(int persent);
    public int getChannel();
    public void setChannel(int channel);
}
