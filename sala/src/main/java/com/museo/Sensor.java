package com.museo;

public class Sensor {
    public static void main(String[] args) {
        Sala sala = new Sala();
        for (int i = 0; i < 10; i++) {
            Thread entrada = new Thread(new Entrada(sala));
            entrada.start();
        }

        for (int i = 0; i < 15; i++) {
            Thread salida = new Thread(new Salida(sala));
            salida.start();
        }
        System.out.println("Aforo actual: " + sala.aforo);
    }
}