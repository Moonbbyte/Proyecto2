
package proyecto_2;

import java.io.Serializable;


public class NodoUsuario implements Serializable{
     private static final long serialVersionUID=1L;
    private Object valor;
    private ListDoble categorias;
   
    private NodoUsuario siguiente;

    public NodoUsuario(Object valor){
    this.categorias= new ListDoble();
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

    /**
     * @return the categorias
     */
    public ListDoble getCategorias() {
        return categorias;
    }

    /**
     * @param categorias the categorias to set
     */
    public void setCategorias(ListDoble categorias) {
        this.categorias = categorias;
    }

    
    
    
    
    
}
