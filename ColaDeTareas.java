/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Owen_04
 */

public class ColaDeTareas {
    private Queue<String> cola;

    public ColaDeTareas() {
        cola = new LinkedList<>();
    }

    public void cargarTareas() {
        cola.clear();
        cola.add("Preparar café");
        cola.add("Revisar emails");
        cola.add("Iniciar proyecto");
    }

    public String verFrente() {
        return cola.peek();
    }

    public String ejecutarTarea() {
        return cola.poll();
    }

    public int obtenerTamaño() {
        return cola.size();
    }

    public Queue<String> verTodas() {
        return cola;
    }
}




