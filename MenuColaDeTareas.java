/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cola;
import java.util.Scanner;

/**
 *
 * @author Owen_04
 */
public class MenuColaDeTareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaDeTareas tareas = new ColaDeTareas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        tareas.cargarTareas(); // Carga las tareas predefinidas

        do {
            System.out.println("\n--- MENÚ DE TAREAS ---");
            System.out.println("1. Ver tarea al frente");
            System.out.println("2. Ejecutar tarea");
            System.out.println("3. Ver todas las tareas");
            System.out.println("4. Ver tamaño de la cola");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Frente: " + tareas.verFrente());
                    break;
                case 2:
                    System.out.println("Ejecutando: " + tareas.ejecutarTarea());
                    break;
                case 3:
                    System.out.println("Tareas en cola: " + tareas.verTodas());
                    break;
                case 4:
                    System.out.println("Tamaño: " + tareas.obtenerTamaño());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}



