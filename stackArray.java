/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
* Clase genérica que implementa una pila (Stack) usando un arreglo.
 * Permite operaciones básicas: push, pop, peek y verificar si está vacía
 
 * @author Luis Owen Jaramillo Guerrero
 */
public class stackArray<T> implements isStack<T> {
    private T[] elements; // Arreglo que almacena los elementos de la pila
    private int top; // Índice del elemento superior de la pila

    public stackArray(T[] elements, int top) {
        this.elements = elements;
        this.top = top;
    }
    //Constructor por defecto: pila con tamaño 30
    public stackArray(){
        elements = (T[])new Object [30];
    }
    //Constructor con tamaño definido
    public stackArray(int size) {
        elements = (T[])new Object [size];
    }
    
    //Inserta un elemento en la cima de la pila
    @Override
    public void push(T elemento) {
        if (top < elements.length - 1) { 
        top++; 
        elements[top] = elemento;
        } else { 
     // Indicar que está Llena 
        System.out.println("La pila está llena. No se puede insertar.");
        } 
} 
    //Elimina y retorna el elemento en la cima de la pila
    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        T elemento = elements[top];
        top--;
        return elemento;
    }
    //Retorna el elemento superior sin eliminarlo
    @Override
    public T peek() {
    if (isEmpty()) {
        System.out.println("Pila Vacía");
    }
    System.out.println("Conociendo el último de la pila");
    return (T) elements[top];
}

    //Retorna el elemento superior sin eliminarlo
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Pila Vacía");
            return null;
        }
        System.out.println("Conociendo el último de la pila");
        return elements[top];
    }
    
    
}

