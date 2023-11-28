/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol.binario;

/**
 *
 * @author ldsin
 */
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.raiz = new Nodo(1);
        arbol.raiz.izq = new Nodo(2);
        arbol.raiz.der = new Nodo(3);
        arbol.raiz.izq.izq = new Nodo(4);
        arbol.raiz.izq.der = new Nodo(5);

        System.out.println("Recorrido Preorden del árbol binario es: ");
        arbol.imprimirPreorden();

        System.out.println("\nRecorrido Inorden del árbol binario es: ");
        arbol.imprimirInorden();

        System.out.println("\nRecorrido Postorden del árbol binario es: ");
        arbol.imprimirPostorden();
    }
}

