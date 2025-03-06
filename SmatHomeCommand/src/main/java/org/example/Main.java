package org.example;

public class Main {
    public static void main(String[] args) {
        SimpleControlRemote control = new SimpleControlRemote();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        control.setCommand(lightOnCommand);
        control.buttonWasPressed();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        control.setCommand(lightOffCommand);
        control.buttonWasPressed();
    }
}