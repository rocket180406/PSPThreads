package com.threads;

public class Hello extends Saludo implements Runnable {

    public Hello() {
        this.saludo = "Hello";
    }

    @Override
    public void run() {
        System.out.println(saludo);
    }

}
