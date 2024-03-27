package org.sem2.practice6.FactoryMethodPattern;

public class FactoryMethodPatternTester {
    public static void test() {
        AirPlaneFactory passengerAirPlaneFactory = new PassengerAirPlaneFactory();
        AirPlane passengerAirPlane = passengerAirPlaneFactory.createAirPlane(AirPlaneType.BOEING);
        passengerAirPlane.printName();
        System.out.println("======================");
        AirPlaneFactory warAirPlaneFactory = new WarAirPlaneFactory();
        AirPlane warAirPlane = warAirPlaneFactory.createAirPlane(AirPlaneType.HERCULES);
        warAirPlane.printName();
    }
}
