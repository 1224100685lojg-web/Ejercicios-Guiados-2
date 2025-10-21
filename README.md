# 🧩 Ejercicios Guiados 2

Repositorio de actividades prácticas para reforzar conceptos de **Programación Orientada a Objetos en Java** y estructuras de datos, a través de ejercicios guiados y dinámicas colaborativas.

---

## 🧙‍♂️ Dinámica: *La Lista Encantada – Versión Enlazada*
**Objetivo:** Comprender cómo funciona una **lista simplemente enlazada (`LinkedList`)** donde cada nodo conoce solo al siguiente.

Durante la actividad, representamos físicamente una lista: cada participante fue un nodo, enlazado al siguiente con tarjetas y flechas, mientras el “invocador” ejecutaba comandos como `.add()`, `.remove()` y `.traverse()`.

📸 *Evidencia:*
| Momento | Imagen |
|----------|--------|
| Representación de la lista | ![Lista Enlazada](pila1.jpg.jpg) |
| Ejecución del método `.remove()` | ![Remove](pila2.jpg.jpg) |

---

## 🧱 Actividad: *Especificación e Implementación de la Pila (TAD Pila)*

**Objetivo:** Diseñar e implementar una **estructura de pila genérica** aplicando los principios de **POO y TAD**.

### 🧩 Etapas principales
- **Interfaz `Pila<E>`:** Define operaciones visibles (`push`, `pop`, `top`, `estaVacia`) usando genéricos.  
- **Clase `PilaArray<E>`:** Implementa la interfaz usando un arreglo privado y la variable `cima`.  
- **Encapsulamiento:** Se protege la estructura interna con `private`.  
- **Excepciones:** Se lanza una excepción al hacer `pop()` sobre una pila vacía.  

📸 *Evidencia:*
| Parte del ejercicio | Imagen |
|----------------------|--------|
| Código de la interfaz `Pila` | ![Interfaz Pila](./images/pila1.jpg) |
| Ejemplo de implementación | ![Implementación](./images/pila2.jpg) |

---

## ☕ Principios de POO aplicados
| Principio | Aplicación |
|------------|-------------|
| **Abstracción** | Separar el *qué* (interfaz) del *cómo* (implementación). |
| **Encapsulamiento** | Ocultar la estructura interna usando `private`. |
| **Polimorfismo** | Varias implementaciones (`PilaArray`, `PilaListaEnlazada`) pueden cumplir la misma interfaz. |

---

📅 *Ejercicios desarrollados como parte del módulo de estructuras de datos en Java – Octubre 2025*  
👨‍💻 *Autor:* [Tu Nombre Aquí]
