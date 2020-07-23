package com.applications.world.hello;

import software.party.third.Adaptee;

public class Adapter implements ITarget {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
