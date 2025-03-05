package org.example;

public class SmartHomeFacade {
    //DECLARAR TODAS DEPENDENCIAS
    ClimitaControl climitaControl;
    Lighting lighting;
    MusicSystem musicSystem;

    public SmartHomeFacade() {
        this.climitaControl = new ClimitaControl();
        this.lighting = new Lighting();
        this.musicSystem = new MusicSystem();
    }


    public void setEveningRoutine() {
        lighting.on();
        musicSystem.playMusic();
        climitaControl.setTemperature(20);
    }
}
