package Threads_Prueba;

public class PruebaThreads {
    public static void main(String[] args) {

        Tarea t1 = new Tarea();
        Tarea t2 = new Tarea();
    
        //Ejecuta cada thread t1, t2
        t1.start();
        t2.start();   
    }
}
