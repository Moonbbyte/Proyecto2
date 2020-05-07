package proyecto_2;

import java.io.Serializable;

public class ListaDCircular extends EstructuraDeDatos implements Serializable {

    private static final long serialVersionUID = 1L;

  
    private NodoCircular primero, ultimo;
    private static NodoCircular tempo;
    
    
    private int size;

    public ListaDCircular() {
        primero = ultimo = null;
    }

    @Override
    public void add(Object e) {
        NodoCircular nuevo = new NodoCircular();
        nuevo.setValor(e);
        if (getPrimero() == null) {
            setPrimero(nuevo);
            getPrimero().setSiguiente(getPrimero());
            nuevo.setAnterior(getUltimo());
            setUltimo(nuevo);
        } else {
            getUltimo().setSiguiente(nuevo);
            nuevo.setSiguiente(getPrimero());
            nuevo.setAnterior(getUltimo());
            setUltimo(nuevo);
            getPrimero().setAnterior(getUltimo());
        }
        size++;

    }

    @Override
    public Object peek() {
        Object temp = getPrimero().getValor();
        return temp;
    }
@Override
    public Object find(Object e) {
        NodoCircular actual = new NodoCircular();
        actual = getPrimero();
        int contador = 0;
        while (actual != null) {
            if (actual.getValor().equals(e)) {
                break;
            } else {
                actual.getSiguiente();
                contador++;
                
            }
        }
        return contador;
    }
    
    public Object find2(Object e) {
        NodoCircular actual = getPrimero();
        int contador = 0;
        actual = getPrimero();
        Object t;
         if (getPrimero() == null) {
                contador = 60;

         }
         else {
        for (int i = 0; i < size; i++) {

            
           if (actual.getValor().equals(e)) {
                break;    
            }
           contador++;    
           if(contador==size){
            contador=60;
            break;
            }         
            actual =actual.getSiguiente();
        }}

        return contador;
    }
    
    
    
    @Override
    public Object getNext() {
        NodoCircular actual = new NodoCircular();
        actual = getPrimero().getSiguiente();
        Object valor = actual.getValor();
        return valor;

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object get(int i) {
        int contador = 0;
        NodoCircular temp = getPrimero();
        while (contador < i) {
            temp = temp.getSiguiente();
            contador++;
        }
        return temp.getValor();
    }
/////////////////////////////////////siguiente
    
    
    public NodoCircular getSigui(){
    tempo=tempo.getSiguiente();
    return tempo;
    }
    
    @Override
    public Object pop() {
        Object r = "se elimino con exito el primer valor";
        setPrimero(getPrimero().getSiguiente());
        getUltimo().setSiguiente(getPrimero());
        getPrimero().setAnterior(getUltimo());
        size--;

        return r;
    }

    @Override
    public void delete(Object e) {
        NodoCircular actual = new NodoCircular();
        NodoCircular anterior = new NodoCircular();
        actual = getPrimero();
        anterior = getUltimo();
        do {
            if (actual.getValor().equals(e)) {
                if (actual == getPrimero()) {
                    setPrimero(getPrimero().getSiguiente());
                    getUltimo().setSiguiente(getPrimero());
                    getPrimero().setAnterior(getUltimo());
                } else if (actual == getUltimo()) {
                    setUltimo(anterior);
                    getPrimero().setAnterior(getUltimo());
                    getUltimo().setSiguiente(getPrimero());
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(anterior);

                }

            }

            anterior = actual;
            actual = actual.getSiguiente();
        } while (actual != getPrimero());
        size--;
    }

    public void imprimir() {
        NodoCircular nv = new NodoCircular();
        nv = getPrimero();
        do {
            System.out.println(nv.getValor());
            nv = nv.getSiguiente();

        } while (nv != getPrimero());

    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the primero
     */
    public NodoCircular getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoCircular primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoCircular getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoCircular ultimo) {
        this.ultimo = ultimo;
    }
 
}
