package FactoryMethod;
/*
    Replace direct object construction calls with calls to a special factory method
 */
import FactoryMethod.OperatingSystem.OS;
import FactoryMethod.OperatingSystem.OSFactory;

public class Demo {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("Gamer");
        os.printTagline();
    }
}
