package FactoryMethod.OperatingSystem;

public class Linux implements OS{
    @Override
    public void printTagline() {
        System.out.println("I am Linux and come in many flavors! Developers love me!");
    }
}
