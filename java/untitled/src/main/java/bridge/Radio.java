package bridge;

public class Radio implements Device{
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
            if (Math.abs(persent)>0) {
                volume = volume + persent;
            }else {
                volume=0;
            }
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
            this.channel = this.channel + channel;
        }
    }
}
