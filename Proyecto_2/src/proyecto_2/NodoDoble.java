
package proyecto_2;


public class NodoDoble {
private NodoDoble siguiente,anterior;
 private Object valor;
 
  public NodoDoble(Object valor, NodoDoble s, NodoDoble a){
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
    
    
    
}
