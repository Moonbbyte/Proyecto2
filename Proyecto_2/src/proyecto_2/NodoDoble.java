
package proyecto_2;

import java.io.Serializable;


public class NodoDoble implements Serializable{
     private static final long serialVersionUID=1L;
private NodoDoble siguiente,anterior;
 private Object valor;
 private ListaDCircular imagenes;
 
  public NodoDoble(Object valor, NodoDoble s, NodoDoble a){
  this.imagenes= new ListaDCircular();
  this.valor=valor;
  siguiente=s;
  anterior=a;
  
  }  
  public NodoDoble(){}
  


    public Object getValor() {
        return valor;
    }

    
    public NodoDoble getSiguiente() {
        return siguiente;
    }

    
    public NodoDoble getAnterior() {
        return anterior;
    }

    
    public void setValor(Object valor) {
        this.valor = valor;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the imagenes
     */
    public ListaDCircular getImagenes() {
        return imagenes;
    }

    /**
     * @param imagenes the imagenes to set
     */
    public void setImagenes(ListaDCircular imagenes) {
        this.imagenes = imagenes;
    }

   
    
    
}
