package Threads_Prueba;
class Tarea extends Thread{

    //Tarea a realizar
    public void run(){
        System.out.println("Esto se ha ejecutado en thread"+ this.getId());
    }
}
