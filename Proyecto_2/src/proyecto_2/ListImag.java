
package proyecto_2;


public class ListImag extends EstructuraDeDatos{
private NodoDoble primero,ultimo;
private int size=0;

public ListImag(){
primero=ultimo=null;
}

    
    @Override
    public void add(Object e) {
    NodoDoble nuevo= new NodoDoble(e,null,null) ;  
    if(primero==null){
    primero=nuevo;
    nuevo.setAnterior(null);
    nuevo.setSiguiente(null);
    ultimo=primero;
    }else{
    ultimo.setSiguiente(nuevo);
    nuevo.setAnterior(ultimo);
    nuevo.setSiguiente(null);
    ultimo=nuevo;
    }
    size++;
    }

    @Override
    public Object peek() {
        Object temp=ultimo.getValor();
        return temp;
    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getNext() {
       NodoDoble actual= new NodoDoble();
       actual=primero.getSiguiente();
       Object valor=actual.getValor();
       return valor;
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void ImprimirReversa(){
     NodoDoble actual= new NodoDoble();
     actual=ultimo;
     while(actual!=null){
         System.out.println(actual.getValor());    
         actual=actual.getAnterior();
     } 

    }
    public void Imprimir(){
     NodoDoble actual= new NodoDoble();
     actual=primero;
     while(actual!=null){
         System.out.println(actual.getValor());    
         actual=actual.getSiguiente();
     } 

    }
    
}
