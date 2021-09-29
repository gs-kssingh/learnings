package FactoryMethod.OperatingSystem;

public class Windows implements OS {
    @Override
    public void printTagline() {
        System.out.println("I am Windows OS! Gamers love me!");
    }
}
