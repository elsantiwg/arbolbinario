/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol.binario;

/**
 *
 * @author ldsin
 */
public class Nodo {
    int dato;
    Nodo izq, der;

    public Nodo(int item) {
        dato = item;
        izq = der = null;
    }
}

