package com.familia;

public class Madre extends Persona {
    public Madre(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(random.nextInt(TIEMPO_MAXIMO - TIEMPO_MINIMO) + TIEMPO_MINIMO);
                System.out.println(MSG_DESPERTAR + getNombre());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
