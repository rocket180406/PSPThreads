package com.contar;

public class Alumno extends Thread {

    public static final String ALUMNO= "--Alumno ";
    public static final String SEPARADOR= "--------";

    
    public String nombre;

    public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
        Alumno A = new Alumno();
        System.out.println(ALUMNO+i+SEPARADOR);
        A.contar();
    }

    }
     public void contar(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
