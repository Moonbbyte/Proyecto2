
package proyecto_2;

public class ListUsuario extends EstructuraDeDatos{
private NodoUsuario cabeza;
private int size;
    
    @Override
    public void add(Object e) {
       if(cabeza==null){
       cabeza=new NodoUsuario(e);
       }else{
       NodoUsuario temp=cabeza;
       NodoUsuario nuevo= new NodoUsuario(e);
       nuevo.setSiguiente(temp);
       cabeza=nuevo;
       
       }
        
        
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

   
    public NodoUsuario getCabeza() {
        return cabeza;
    }

   
    public void setCabeza(NodoUsuario cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
