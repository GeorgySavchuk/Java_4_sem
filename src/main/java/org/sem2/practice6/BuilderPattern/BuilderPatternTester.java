package org.sem2.practice6.BuilderPattern;

public class BuilderPatternTester {
    public static void test() {
        AirPlaneBuilder airPlaneBuilder = new PassengerAirPLaneBuilder();
        AirPlaneEngineer airPlaneEngineer = new AirPlaneEngineer(airPlaneBuilder);
        AirPlane airPlane = airPlaneEngineer.manufactureAirPlane();
        if (airPlane != null) {
            System.out.println(airPlane);
        }
    }
}
