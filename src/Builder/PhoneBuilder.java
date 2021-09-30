package Builder;

public class PhoneBuilder {
    private String os;
    private String processor;
    private float screenSize;
    private int ram;

    public PhoneBuilder() {
        this.os = "Android 11";
        this.processor = "Snapdragon";
        this.screenSize = 6.0f;
        this.ram = 4;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(float screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os, processor, screenSize, ram);
    }
}
