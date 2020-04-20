
package proyecto_2;


public class NodoUsuario {
    private Object valor;
    private NodoUsuario siguiente;

    public NodoUsuario(Object valor){
    this.valor=valor;
    siguiente=null;
    
    }
    public NodoUsuario(){}
 
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
