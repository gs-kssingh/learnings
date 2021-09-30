package Builder;

public class Phone {
    private String os;
    private String processor;
    private float screenSize;
    private int ram;

    public Phone(String os, String processor, float screenSize, int ram) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                '}';
    }
}
