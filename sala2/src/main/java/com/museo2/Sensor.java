package com.museo2;

public class Sensor {
    public static final String MSG_ENTRADA="Ha entrado el visitante ";
    public static final String MSG_SALIDA="Ha salido el visitante ";
    public static final String MSG_AFORO="Aforo actual: ";
    public static final String MSG_ERROR="Error: ";
    public static final int ENTRADAS=10;
    public static final int SALIDAS=15;
    public static void main(String[] args) {
        Sala sala = new Sala();

        Thread[] entradas = new Thread[ENTRADAS];
        Thread[] salidas = new Thread[SALIDAS];

        for (int i = 0; i < ENTRADAS; i++) {
            entradas[i] = new Thread(new Entrada(sala));
            entradas[i].start();
            System.out.println(MSG_ENTRADA + (i + 1));
        }

        for (int i = 0; i < SALIDAS; i++) {
            salidas[i] = new Thread(new Salida(sala));
            salidas[i].start();
            System.out.println(MSG_SALIDA + (i + 1));
        }
        try {
            for (int i = 0; i < ENTRADAS; i++) {
                entradas[i].join();
            }
            for (int i = 0; i < SALIDAS; i++) {
                salidas[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println(MSG_ERROR + e.getMessage());
        }

        System.out.println(MSG_AFORO + sala.aforo);
    }
}