package org.example;

public abstract class Logistics {
    public void planDelivery () {
       ITransport transporte = this.createTransport();
       transporte.deliver();
    }
    public abstract ITransport createTransport();
}
