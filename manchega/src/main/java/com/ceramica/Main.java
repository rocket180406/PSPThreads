package com.ceramica;

public class Main {
    public static void main(String[] args) {
        
        Galeria galeria = new Galeria();

        Thread alfarero = new Thread(new Alfarero(galeria));
        Thread vendedor = new Thread(new Vendedor(galeria));

        alfarero.start();
        vendedor.start();
    }
}