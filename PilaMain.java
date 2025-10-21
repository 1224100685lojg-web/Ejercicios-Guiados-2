/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * Clase principal para probar la implementación de una pila usando arreglos (stackArray).
 * Aquí se demuestran las operaciones básicas: push (insertar) y pop (eliminar) elementos.
 * @author Luis Owen Jaramillo Guerrero
 */
public class PilaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pila
        stackArray<String> Amigos = new stackArray<String>();

        // Insertar amigos
        Amigos.push("Carlos");
        Amigos.push("Ana");
        Amigos.push("Luis");
        Amigos.push("María");
        Amigos.push("Sofía");
        
        
        //Eliminar amiggos
        System.out.println(Amigos.pop());
        System.out.println(Amigos.pop());
    }

 }

