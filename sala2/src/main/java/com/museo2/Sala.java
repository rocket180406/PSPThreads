package com.museo2;

public class Sala {
    public int aforo;

    public Sala() {
        this.aforo = 100;
    }

    public synchronized void incrementar(){
        aforo += 1;
    }

    public synchronized void decrementar(){
        aforo -= 1;
    }
}