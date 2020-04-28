package proyecto_2;

import java.io.Serializable;

public class ListUsuario extends EstructuraDeDatos implements Serializable {

    private static final long serialVersionUID = 1L;

    private NodoUsuario cabeza;
    private int size;

    public ListUsuario() {
        cabeza = null;
        size = 0;
    }

    @Override
    public void add(Object e) {
        if (cabeza == null) {
            cabeza = new NodoUsuario(e);
        } else {
            NodoUsuario temp = cabeza;
            NodoUsuario nuevo = new NodoUsuario(e);
            nuevo.setSiguiente(temp);
            cabeza = nuevo;
        }
        size++;

    }

    @Override
    public Object peek() {
        Object temp;
        temp = cabeza.getValor();
        return temp;
    }

    @Override
    public Object find(Object e) {
        NodoUsuario temp = cabeza;
        Object t;
        int contador = 0;

        for (int i = 0; i < size - 1; i++) {
            temp = temp.getSiguiente();

            if (cabeza.getValor().equals(e)) {
                contador = 0;
                contador = 50;
                break;
            } else if (temp.getValor().equals(e)) {
                contador = 50;

                break;
            }
            contador++;
        }

        return contador;
    }

    public Object find2(Object e) {
        NodoUsuario temp = cabeza;
        Object t;
        int contador = 0;
        if (cabeza == null) {
            contador = 60;
        } else {
            for (int i = 0; i < size; i++) {
               

                if (temp.getValor().equals(e)) {
                    break;
                }
                contador++;
            if (contador == size) {
                    contador = 60;
                    break;
                }
                temp = temp.getSiguiente();

            }

        }

        return contador;

    }
    ////////////////////retorno de nodos
    public NodoUsuario getNodo(int e){
    NodoUsuario temp= cabeza;
    int contador=0;
   if(e==0){
   }else{
   while(contador<e){
   temp=temp.getSiguiente();
   contador++;
   
   }
   
   }
    return temp;
    }
    
    

    @Override
    public Object getNext() {
        Object temp = cabeza.getSiguiente().getValor();
        return temp;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object get(int i) {
        int contador = 0;
        NodoUsuario temp = cabeza;
        while (contador < i) {
            temp = temp.getSiguiente();
            contador++;
        }
        return temp.getValor();
    }

    @Override
    public Object pop() {
        Object r = "Borrado el primer dato con exito";
        cabeza = cabeza.getSiguiente();
        size--;
        return r;
    }

    @Override
    public void delete(Object e) {
        NodoUsuario actual = new NodoUsuario();
        NodoUsuario anterior = new NodoUsuario();
        actual = cabeza;
        while (actual != null) {
            if (actual.getValor().equals(e)) {
                if (actual.equals(cabeza)) {
                    cabeza = cabeza.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }

        size--;
    }

    public NodoUsuario getCabeza() {
        return cabeza;
    }

    public void imprimir() {
        System.out.println("-------IMPRIMIENDO------------------");
        for (NodoUsuario actual = this.getCabeza(); actual != null; actual = actual.getSiguiente()) {
            System.out.println(actual.getValor());
        }
    }

    public void setCabeza(NodoUsuario cabeza) {
        this.cabeza = cabeza;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
