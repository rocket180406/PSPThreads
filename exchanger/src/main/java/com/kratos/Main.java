package com.kratos;

import java.util.concurrent.Exchanger;

public class Main {

    public static void main(String[] args) {

        Exchanger<String> exchanger = new Exchanger<>();

        Thread hilo1 = new Thread(new Mensaje(exchanger, "Hola"));
        Thread hilo2 = new Thread(new Mensaje(exchanger, "Adios"));

        hilo1.start();
        hilo2.start();
    }
}