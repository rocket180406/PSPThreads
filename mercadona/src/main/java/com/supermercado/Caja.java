package com.supermercado;

public class Caja {
    int tmax=0;
    int tmin=0;
    int nclientes=0;
    boolean ocupada=false;

    public synchronized void entrar(){
        if (ocupada==true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            notify();
            ocupada=true;
        }
    }
    public synchronized void salir(){
        if (ocupada==false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            ocupada=false;
            notify();
        }
    }
}
