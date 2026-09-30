class AirConditioning implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Air conditioning is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air conditioning is turned OFF.");
    }
}