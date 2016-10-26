/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.mvillegas.a11;

/**
 *
 * @author Mariana Villegas
 */
public class EDMVillegasA11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deque d = new Deque();
        d.showList();
        d.insertFirst(6);
        d.InsertLast("HOLA");
        d.InsertLast(false);
        d.showList();
        d.popFirst();
        d.popLast();
        System.out.println("");
        System.out.println("El tamaño es :"+d.getSize());
       
        
    }
    
}
