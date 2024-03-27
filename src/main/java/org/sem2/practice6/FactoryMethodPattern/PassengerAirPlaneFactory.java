package org.sem2.practice6.FactoryMethodPattern;

public class PassengerAirPlaneFactory extends AirPlaneFactory{
    public AirPlane createAirPlane(AirPlaneType type) {
        AirPlane airPlane;
        switch (type) {
            case BOEING -> airPlane = new Boeing();
            case KESTREL -> airPlane = new Kestrel();
            default -> airPlane = null;
        }
        return airPlane;
    }
}
