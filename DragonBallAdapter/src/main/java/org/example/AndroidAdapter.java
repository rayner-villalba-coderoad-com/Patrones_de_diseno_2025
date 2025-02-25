package org.example;


//Paso 3 Implementar la interfaz definida
public class AndroidAdapter implements Warrior {
    public int ATTACK_BASE = 30;
    //Paso 1 identifica el objeto a adaptar
    Android android;

    //PaSO 2 El objeto a adapter debe estar definido en el constructor
    public AndroidAdapter(Android android) {
        this.android = android;
    }

    @Override
    public int attack() {
        return android.kick() + android.punch() + this.ATTACK_BASE;
    }

    @Override
    public String getName() {
        return android.getName();
    }
}
