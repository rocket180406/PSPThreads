package com.threads;

public class Ciao extends Saludo implements Runnable {

    public Ciao() {
        this.saludo = "Ciao";
    }

    @Override
    public void run() {
        System.out.println(saludo);
    }

}
