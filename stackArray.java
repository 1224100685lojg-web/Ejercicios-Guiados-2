/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author Owen_04
 */
public class stackArray<T> implements isStack<T> {
    private T[] elements;
    private int top;

    public stackArray(T[] elements, int top) {
        this.elements = elements;
        this.top = top;
    }
    
    public stackArray(){
        elements = (T[])new Object [30];
    }

    public stackArray(int size) {
        elements = (T[])new Object [size];
    }
    
    
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

    @Override
    public T peek() {
    if (isEmpty()) {
        System.out.println("Pila Vacía");
    }
    System.out.println("Conociendo el último de la pila");
    return (T) elements[top];
}


    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
