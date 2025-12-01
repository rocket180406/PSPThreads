package com.kratos;

import java.util.concurrent.Exchanger;

public class Mensaje implements Runnable {
    private Exchanger<String> exchanger;
    public final String enviado;

    public Mensaje(Exchanger<String> exchanger, String enviado) {
        this.exchanger = exchanger;
        this.enviado = enviado;
    }

    @Override
    public void run() {
        try {
            String recibido = exchanger.exchange(enviado);
            System.out.println("Envia: "+enviado + ", Recibe: " + recibido);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
