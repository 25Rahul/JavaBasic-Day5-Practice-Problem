package com.bridgelabz.oops2;
interface Engine {
    void start();
    void stop();
}
class VehicleEngine implements Engine{
    public void start() {
        System.out.println("Vehicle engine starting...");
    }
    public void stop() {
        System.out.println("Vehicle engine stopping...");
    }
}
public class Main {
    public static void main(String[] args) {
        Engine vehicleEngine = new VehicleEngine();
        vehicleEngine.start();
        vehicleEngine.stop();

    }
}
