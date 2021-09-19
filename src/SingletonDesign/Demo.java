package SingletonDesign;
/*
To design a Singleton class,
 1. Make constructor private
 2. Write a static method that has return type of this class
 */

class Singleton {
    private static Singleton obj;
    public String msg;

    private Singleton() {
        msg = "Hey! This is a Singleton class";
    }

    public static Singleton getObj() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
}

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getObj();
        System.out.println(singleton.msg);
    }
}
