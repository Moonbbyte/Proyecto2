
package proyecto_2;
import java.io.Serializable;
public class auxlistimag extends EstructuraDeDatos implements Serializable {
     private static final long serialVersionUID=1L;
    private NodoDoble primero, ultimo;
    private int size = 0;

    public auxlistimag() {
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
public Object find2(Object e) {
        NodoDoble actual = primero;
        int contador = 0;
        actual = primero;
        Object t;
         if (primero == null) {
                contador = 60;

            } else {
        for (int i = 0; i < size - 1; i++) {

           if (primero.getValor().equals(e)) {
                contador = 0;
                break;
            } else if (primero.getValor().equals(e)) {
                break;    
            }
             contador++;
            primero =primero.getSiguiente();
        }}

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
        primero.getSiguiente().setAnterior(null);
        
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
                } 
                else {
                    
                    atras.setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }

            }
            atras=actual;
            actual = actual.getSiguiente();
        }
        size--;

    }
    
    public void delete2(Object e) {
        NodoDoble actual = new NodoDoble();
        NodoDoble atras = new NodoDoble();
        int contador=0;
        
        actual = primero;
        atras= null;
        
        if((int)e==0){
        primero= primero.getSiguiente();
         primero.getSiguiente().setAnterior(null);
        }else if((int)e==size-1){
        ultimo=ultimo.getAnterior();
        ultimo.setSiguiente(null);
        
        } else{
            
        while(contador<((int)e)){
        atras=actual;
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

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

}
