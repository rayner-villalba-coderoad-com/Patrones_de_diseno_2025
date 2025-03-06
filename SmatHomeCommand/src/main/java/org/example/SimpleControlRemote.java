package org.example;

public class SimpleControlRemote {
    Command slot;
    public SimpleControlRemote() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
