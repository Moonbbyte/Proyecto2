/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

/**
 *
 * @author brand
 */
public class Proyecto_2 {
    public static void main(String[] args) {
       ListUsuario l= new ListUsuario();
     l.add(12);
     l.add(23);
     l.add("Sofia");
     l.add(5);
     l.imprimir();
        System.out.println("\n"+l.peek());
        System.out.println(l.find(5));
        System.out.println(l.getNext());
        l.delete(1);
        System.out.println("\n\n\n");
        
        l.imprimir();
        System.out.println(l.getSize());
             
        
    }
    
}
