package proyecto_2;

public class ListImag extends EstructuraDeDatos implements java.io.Serializable{

    private NodoDoble primero, ultimo;
    private int size = 0;

    public ListImag() {
        primero = ultimo = null;
    }

    @Override
    public void add(Object e) {
        NodoDoble nuevo = new NodoDoble(e, null, null);
        if (primero == null) {
            primero = nuevo;
            nuevo.setAnterior(null);
            nuevo.setSiguiente(null);
            ultimo = primero;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            nuevo.setSiguiente(null);
            ultimo = nuevo;
        }
        size++;
    }

    @Override
    public Object peek() {
        Object temp = ultimo.getValor();
        return temp;
    }

    @Override
    public Object find(Object e) {
        NodoDoble actual = new NodoDoble();
        actual = primero;
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

    @Override
    public Object getNext() {
        NodoDoble actual = new NodoDoble();
        actual = primero.getSiguiente();
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
        NodoDoble temp = primero;
        while (contador < i) {
            temp = temp.getSiguiente();
            contador++;
        }
        return temp.getValor();
    }

    @Override
    public Object pop() {
        Object r = "Borrado el primer dato con exito";
        primero=primero.getSiguiente();
        primero.setAnterior(null);
        
        size--;
        return r;
    }

    @Override
    public void delete(Object e) {
        NodoDoble actual = new NodoDoble();
        NodoDoble atras = new NodoDoble();
        actual = primero;
        atras= null;
        while (actual != null) {
           
            if (actual.getValor().equals(e)) {
               
                if (actual.equals(primero)) {
                   primero= primero.getSiguiente();
                   primero.setAnterior(null);
                } else {
                    atras.setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }

            }
            atras=actual;
            actual = actual.getSiguiente();
        }
        size--;

    }

    public void ImprimirReversa() {
        NodoDoble actual = new NodoDoble();
        actual = ultimo;
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getAnterior();
        }

    }

    public void Imprimir() {
        NodoDoble actual = new NodoDoble();
        actual = primero;
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getSiguiente();
        }

    }

}
