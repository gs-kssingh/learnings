package FactoryMethod.OperatingSystem;

import java.sql.SQLOutput;

public class MacOS implements OS{
    @Override
    public void printTagline() {
        System.out.println("I am MacOS! I am the cool one!");
    }
}
