package com.locks;

public class Contador {
    private int cuenta = 0;

    public synchronized int incrementar() {
        cuenta++;
        System.out.println("Contador: " + cuenta);
        return cuenta;
    }
}
