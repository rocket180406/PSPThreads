/*Crea un programa, utilizando locks, que cuente de 1 en 1 utilizando 3 threads y locks.
La variable con el valor mostrado por pantalla será compartida por todos los threads. */
package com.locks;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        Thread t1 = new Thread(new ContadorThread(contador));
        Thread t2 = new Thread(new ContadorThread(contador));
        Thread t3 = new Thread(new ContadorThread(contador));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}