package org.example;

public class SeaLogistics extends Logistics {
    @Override
    public ITransport createTransport() {
        return new Ship();
    }
}
