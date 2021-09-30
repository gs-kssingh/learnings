package Builder;

public class Demo { // will build a phone in a modular way by using Builder design pattern
    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
//        phoneBuilder.setOs("iOS");
        Phone phone = phoneBuilder.getPhone();
        System.out.println(phone);
    }

}
