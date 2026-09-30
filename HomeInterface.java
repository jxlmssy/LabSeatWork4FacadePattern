class HomeInterface {

    private final Light light;
    private final TV tv;
    private final AirConditioning airConditioning;

    public HomeInterface() {
        light = new Light();
        tv = new TV();
        airConditioning = new AirConditioning();
    }

    public void turnOnAll() {
        System.out.println("Turning ON all home services...");
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        System.out.println("Turning OFF all home services...");
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}