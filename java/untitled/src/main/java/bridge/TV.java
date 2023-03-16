package bridge;

public class TV implements Device{
    private boolean enable_=false;
    private int volume=0;
    private int channel=1;

    @Override
    public boolean isEnabled() {
        return enable_;
    }

    @Override
    public void enable() {
        enable_=true;
    }

    @Override
    public void disable() {
        enable_=false;
    }

    @Override
    public int getVolume() {
        if (isEnabled()) {
            return volume;
        }else return 0;
    }

    @Override
    public void setVolume(int persent) {
        if (isEnabled()) {
            volume = persent;
        }
    }

    @Override
    public int getChannel() {
        if (isEnabled()) {
            return channel;
        }else return 0;
    }

    @Override
    public void setChannel(int channel) {
        if (isEnabled()) {
            this.channel = channel;
        }
    }
}
