
package proyecto_2;

import java.io.Serializable;


public class NodoCircular implements Serializable {
    
    private static final long serialVersionUID=1L;
    private Object valor;
    private NodoCircular siguiente,anterior;
    
    public NodoCircular(){}
    public NodoCircular(Object valor, NodoCircular s, NodoCircular a){
    this.valor=valor;
    siguiente=s;
    anterior=a;     
    }
    
    
    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public NodoCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCircular getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCircular anterior) {
        this.anterior = anterior;
    }

    
    
}
