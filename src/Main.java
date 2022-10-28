public class Main {
    public static void main(String[] args) throws InterruptedException {
        //1. Realiza un programa en el que crees una clase llamada Animal y tres objetos de dicha
        //clase: Tortuga, liebre, guepardo. Asigna un hilo a cada uno de ellos de forma que se
        //ejecuten concurrentemente y utiliza la asignación de prioridades para establecer quién
        //llegará el primero(Liebre prioridad 5, Guepardo 1, Tortuga 10).
        //La carrera será mediante un contador de iteraciones y ganará el primero que llegue a 10000
        //iteraciones. Avisar desde el propio hilo de la posición en la que llega cada uno al terminar.
        Animal tortuga,liebre,guepardo;
        liebre = new Animal("Una Liebre",5);
        guepardo = new Animal("Un Guepardo ",1);
        tortuga = new Animal("Una tortuga",10);

        liebre.start();
        guepardo.start();
        tortuga.start();

        liebre.join();
        guepardo.join();
        tortuga.join();

        System.out.println("Carrera Terminada ");
    }
}