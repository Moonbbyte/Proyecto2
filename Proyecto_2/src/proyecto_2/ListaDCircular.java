package proyecto_2;

public class ListaDCircular extends EstructuraDeDatos {

    private NodoCircular primero, ultimo;
    private int size;

    public ListaDCircular() {
        primero = ultimo = null;
    }

    @Override
    public void add(Object e) {
        NodoCircular nuevo = new NodoCircular();
        nuevo.setValor(e);
        if (primero == null) {
            primero = nuevo;
            primero.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
            primero.setAnterior(ultimo);
        }
        size++;

    }

    @Override
    public Object peek() {
        Object temp = primero.getValor();
        return temp;
    }

    @Override
    public Object find(Object e) {
        NodoCircular actual = new NodoCircular();
        int contador = 0;
        actual = ultimo;
        do {
            if (actual.getValor().equals(e)) {
                break;
            }

            actual = actual.getAnterior();
            contador++;
        } while (actual != ultimo);

        return contador;
    }

    @Override
    public Object getNext() {
       NodoCircular actual = new NodoCircular();
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
        NodoCircular temp = primero;
        while (contador < i) {
         temp=temp.getSiguiente();
         contador++;
        }
        return temp.getValor();
    }

    @Override
    public Object pop() {
     Object r="se elimino con exito el primer valor";
        primero=primero.getSiguiente();
         ultimo.setSiguiente(primero);
         primero.setAnterior(ultimo);
         size--;
         
      return r;
    }

    @Override
    public void delete(Object e) {
     NodoCircular actual= new NodoCircular();
     NodoCircular anterior= new NodoCircular();
     actual=primero;
     anterior=ultimo;
     do{
     if(actual.getValor().equals(e)){
         if(actual==primero){
         primero=primero.getSiguiente();
         ultimo.setSiguiente(primero);
         primero.setAnterior(ultimo);
         }else if(actual==ultimo){
         ultimo=anterior;
         primero.setAnterior(ultimo);
         ultimo.setSiguiente(primero);
         }else{
         anterior.setSiguiente(actual.getSiguiente());
         actual.getSiguiente().setAnterior(anterior);
         
         }
         size--;
     }
         
     anterior=actual;
     actual=actual.getSiguiente();
     }while(actual!=primero);
     
    
    
    }

    public void imprimir() {
        NodoCircular nv = new NodoCircular();
        nv = primero;
        do {
            System.out.println(nv.getValor());
            nv = nv.getSiguiente();

        } while (nv != primero);

    }

}
