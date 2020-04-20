
package proyecto_2;

import java.io.Serializable;


public class NodoUsuario implements Serializable{
     private static final long serialVersionUID=1L;
    private Object valor;
    private NodoUsuario siguiente;

    public NodoUsuario(Object valor){
    this.valor=valor;
    siguiente=null;
    
    }
    public NodoUsuario(){
    
    
    }
 
    public Object getValor() {
        return valor;
    }

    
    public void setValor(Object valor) {
        this.valor = valor;
    }

    
    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    
    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
