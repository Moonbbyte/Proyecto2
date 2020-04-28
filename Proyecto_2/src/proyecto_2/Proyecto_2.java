
package proyecto_2;

public class Proyecto_2 {
    public static void main(String[] args) {
    
       
    Menu m= new Menu();
    m.setTitle("Usac Ligthroom");
    m.setVisible(true);     
     
    
        
     ListUsuario lu= new ListUsuario();
     ListDoble lc= new ListDoble();
    lu.add("mario");
    lu.add("alfonso");
    lu.add("pedro");
    lu.getCabeza().getCategorias().add("hola");
     lu.getCabeza().getCategorias().add("manzana");
    
    lu.getCabeza().getSiguiente().getCategorias().add("xD");
    lu.getCabeza().getSiguiente().getCategorias().add("Pato");
    lu.imprimir();
        System.out.println(lu.getCabeza().getCategorias().find2("manzana"));
   
       
      
     lu.getCabeza().getCategorias().getPrimero().getImagenes().add(13);
        System.out.println( lu.getCabeza().getCategorias().getPrimero().getImagenes().getPrimero().getValor());
    }
    
}
