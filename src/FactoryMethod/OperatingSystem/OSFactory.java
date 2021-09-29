package FactoryMethod.OperatingSystem;

public class OSFactory {
    public OS getInstance(String str) {
        if (str.equals("Gamer"))
            return new Windows();
        else {
            if (str.equals("Developer"))
                return new Linux();
            return new MacOS();
        }
    }
}
