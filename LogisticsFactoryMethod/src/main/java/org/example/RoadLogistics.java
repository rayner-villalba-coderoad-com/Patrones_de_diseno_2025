package org.example;

public class RoadLogistics extends Logistics {
    @Override
    public ITransport createTransport() {
        return new Truck();
    }
}
