package com.threads;

public class Lanzador {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Hola());
        Thread t2 = new Thread(new Hello());
        Thread t3 = new Thread(new Ciao());

        t1.start();
        t2.start();
        t3.start();
    }

}
