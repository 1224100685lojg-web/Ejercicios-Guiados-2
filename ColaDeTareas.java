/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
* Clase ColaDeTareas
 * -------------------
 * Implementa una cola de tareas utilizando la interfaz Queue de Java (FIFO).
 * Cada tarea se almacena como una cadena de texto y se gestiona con métodos 
 * para cargar, visualizar, ejecutar y contar las tareas pendientes.
 
 * @author Luis Owen Jaramillo Guerrero
 */

// Estructura principal de la cola
public class ColaDeTareas {
    private Queue<String> cola;

//Constructor: inicializa la cola vacía usando LinkedList.
    public ColaDeTareas() {
        cola = new LinkedList<>();
    }
//     * Carga un conjunto inicial de tareas predeterminadas. Limpia la cola antes de agregar nuevas tareas.
    public void cargarTareas() {
        cola.clear();
        cola.add("Preparar café");
        cola.add("Revisar emails");
        cola.add("Iniciar proyecto");
    }

    //Devuelve la tarea ubicada al frente de la cola sin eliminarla.
    public String verFrente() {
        return cola.peek();
    }
//Elimina y devuelve la tarea ubicada al frente de la cola.
    public String ejecutarTarea() {
        return cola.poll();
    }
// Obtiene el número total de tareas pendientes en la cola.
    public int obtenerTamaño() {
        return cola.size();
    }
//Devuelve todas las tareas actualmente en la cola.
    public Queue<String> verTodas() {
        return cola;
    }
}





