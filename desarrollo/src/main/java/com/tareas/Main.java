package com.tareas;

public class Main {
    public static final String NOMBRE_ANALISIS="Análisis";
    public static final String NOMBRE_DISENO="Diseño";
    public static final String NOMBRE_CODIFICACION="Codificación";
    public static final String NOMBRE_PRUEBAS="Pruebas";
    public static final int DURACION_ANALISIS=3000;
    public static final int DURACION_DISENO=2000;
    public static final int DURACION_CODIFICACION=1000;
    public static final int DURACION_PRUEBAS=2000;
    public static void main(String[] args) {
        Thread analisis = new Thread(new Tarea(NOMBRE_ANALISIS, DURACION_ANALISIS));
        Thread diseno = new Thread(new Tarea(NOMBRE_DISENO, DURACION_DISENO));
        Thread codificacion = new Thread(new Tarea(NOMBRE_CODIFICACION, DURACION_CODIFICACION));
        Thread pruebas = new Thread(new Tarea(NOMBRE_PRUEBAS, DURACION_PRUEBAS));

        analisis.start();
        diseno.start();

        try {
            analisis.join();
            diseno.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        codificacion.start();

        try {
            codificacion.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        pruebas.start();

        try {
            pruebas.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
    
