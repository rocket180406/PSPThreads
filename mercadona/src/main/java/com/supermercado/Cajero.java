package com.supermercado;

public class Cajero implements Runnable {
    private int id;
    private Caja caja;

    public Cajero(int id, Caja caja) {
        this.id = id;
        this.caja = caja;
    }

    @Override
    public void run() {
        caja.entrar();
        try {
            for (int i = 0; i < 10; i++) {

                System.out.print("C");
                System.out.print("<");
                for (int j = 9; j > i; j--) {
                    System.out.print("-");
                }
                System.out.println();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        caja.salir();
    }

}
