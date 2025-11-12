package com.museo;

public class Sala {
    public int aforo;

    public Sala() {
        this.aforo = 100;
    }

    public void incrementar(){
        aforo += 1;
    }

    public void decrementar(){
        aforo -= 1;
    }
}
