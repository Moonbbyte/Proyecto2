
package proyecto_2;

public class Proyecto_2 {
    public static void main(String[] args) {
    ListImag li=new ListImag();
    
    li.add(23);
    li.add(34);
    li.add(90);
    li.add(70);
   li.ImprimirReversa();
        System.out.println(li.getSize());
     
   li.delete(90);
         
         li.Imprimir();
         System.out.println(li.find(34));
    
    
             
        
    }
    
}
