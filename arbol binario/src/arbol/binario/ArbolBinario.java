/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol.binario;

/**
 *
 * @author ldsin
 * 
 */
public class ArbolBinario {
    Nodo raiz;

    public void imprimirPreorden(Nodo nodo) {
        if (nodo == null)
            return;

        System.out.print(nodo.dato + " ");
        imprimirPreorden(nodo.izq);
        imprimirPreorden(nodo.der);
    }

    public void imprimirInorden(Nodo nodo) {
        if (nodo == null)
            return;

        imprimirInorden(nodo.izq);
        System.out.print(nodo.dato + " ");
        imprimirInorden(nodo.der);
    }

    public void imprimirPostorden(Nodo nodo) {
        if (nodo == null)
            return;

        imprimirPostorden(nodo.izq);
        imprimirPostorden(nodo.der);
        System.out.print(nodo.dato + " ");
    }

    public void imprimirPreorden() { imprimirPreorden(raiz); }
    public void imprimirInorden() { imprimirInorden(raiz); }
    public void imprimirPostorden() { imprimirPostorden(raiz); }
}

