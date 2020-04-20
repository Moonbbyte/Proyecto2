
package proyecto_2;


public class NodoCircular {
    private Object valor;
    private NodoCircular siguiente,anterior;

    /**
     * @return the valor
     */
    public Object getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Object valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public NodoCircular getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoCircular getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoCircular anterior) {
        this.anterior = anterior;
    }
    
}
