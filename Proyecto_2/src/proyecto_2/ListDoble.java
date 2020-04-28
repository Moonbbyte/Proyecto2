package proyecto_2;

import java.io.Serializable;

public class ListDoble extends EstructuraDeDatos implements Serializable {

    private static final long serialVersionUID = 1L;
    private NodoDoble primero, ultimo;
    private int size = 0;

    public ListDoble() {
        primero = ultimo = null;
    }

    @Override
    public void add(Object e) {
        NodoDoble nuevo = new NodoDoble(e, null, null);
        if (getPrimero() == null) {
            setPrimero(nuevo);
            nuevo.setAnterior(null);
            nuevo.setSiguiente(null);
            setUltimo(getPrimero());
        } else {
            getUltimo().setSiguiente(nuevo);
            nuevo.setAnterior(getUltimo());
            nuevo.setSiguiente(null);
            setUltimo(nuevo);
        }
        size++;
    }

    ////////////////////retorno de nodos
    public NodoDoble getNodo(int e) {
        NodoDoble temp = getPrimero();
        int contador = 0;
        if (e == 0) {
        } else {
            while (contador < e) {
                temp = temp.getSiguiente();
                contador++;

            }
        }
        return temp;

    }

    @Override
    public Object peek() {
        Object temp = getUltimo().getValor();
        return temp;
    }

    @Override
    public Object find(Object e) {
        NodoDoble actual = getPrimero();
        int contador = 0;
        actual = getPrimero();
        Object t;
        if (getPrimero() == null) {
            contador = 60;

        } else {
            for (int i = 0; i < size - 1; i++) {

                if (actual.getValor().equals(e)) {
                    contador = 50;
                    break;
                } else if (actual.getValor().equals(e)) {
                    contador = 50;

                    break;
                }
                actual = actual.getSiguiente();
            }
        }

        return contador;
    }

    public Object find2(Object e) {
        NodoDoble actual = getPrimero();
        int contador = 0;
        actual = getPrimero();
        Object t;
        if (getPrimero() == null) {
            contador = 60;

        } else {
            for (int i = 0; i < size; i++) {

                if (actual.getValor().equals(e)) {
                    break;
                }
                contador++;
                if (contador == size) {
                    contador = 60;
                    break;
                }

                actual = actual.getSiguiente();
            }
        }

        return contador;
    }

    @Override
    public Object getNext() {
        NodoDoble actual = new NodoDoble();
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
        NodoDoble temp = getPrimero();
        while (contador < i) {
            temp = temp.getSiguiente();
            contador++;
        }
        return temp.getValor();
    }

    @Override
    public Object pop() {
        Object r = "Borrado el primer dato con exito";
        setPrimero(getPrimero().getSiguiente());
        getPrimero().getSiguiente().setAnterior(null);

        size--;
        return r;
    }

    @Override
    public void delete(Object e) {
        NodoDoble actual = new NodoDoble();
        NodoDoble atras = new NodoDoble();
        actual = getPrimero();
        atras = null;
        while (actual != null) {

            if (actual.getValor().equals(e)) {

                if (actual.equals(getPrimero())) {
                    setPrimero(getPrimero().getSiguiente());
                    getPrimero().setAnterior(null);
                } else {

                    atras.setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }

            }
            atras = actual;
            actual = actual.getSiguiente();
        }
        size--;

    }

    public void delete2(Object e) {
        NodoDoble actual = new NodoDoble();
        NodoDoble atras = new NodoDoble();
        int contador = 0;

        actual = getPrimero();
        atras = null;

        if ((int) e == 0) {
            setPrimero(getPrimero().getSiguiente());
            getPrimero().getSiguiente().setAnterior(null);
        } else if ((int) e == size - 1) {
            setUltimo(getUltimo().getAnterior());
            getUltimo().setSiguiente(null);

        } else {

            while (contador < ((int) e)) {
                atras = actual;
                actual = actual.getSiguiente();
                contador++;
            }

            atras.setSiguiente(actual.getSiguiente());
            actual.getSiguiente().setAnterior(actual.getAnterior());
        }
        size--;

    }

    public void ImprimirReversa() {
        NodoDoble actual = new NodoDoble();
        actual = getUltimo();
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getAnterior();
        }

    }

    public void Imprimir() {
        NodoDoble actual = new NodoDoble();
        actual = getPrimero();
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getSiguiente();
        }

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
    public NodoDoble getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoDoble primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoDoble getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }

}
