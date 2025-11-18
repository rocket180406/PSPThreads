package com.tareas;

public class Tarea implements Runnable {
    public static final String MSG_INICIO="Iniciando tarea: ";
    public static final String MSG_FINALIZACION="Finalizando tarea: ";
    public static final String MSG_INTERRUPCION="Tarea interrumpida: ";
    private final  String nombre;
    private final  int duracion;

    public Tarea(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    @Override
    public void run() {
        try {
            System.out.println(MSG_INICIO + nombre);
            Thread.sleep(duracion);
            System.out.println(MSG_FINALIZACION + nombre);
        } catch (InterruptedException e) {
            System.out.println(MSG_INTERRUPCION + nombre);
        }
    }
}