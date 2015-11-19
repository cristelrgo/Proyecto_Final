package arbolbinariobusqueda;

public class ArbolBinarioBusqueda {

    public static void main(String[] args) {
    
    Arbol arbolb = new Arbol();       
           
    arbolb.insertar(20);
    arbolb.insertar(24);
    arbolb.insertar(4);
    arbolb.insertar(30);
    arbolb.insertar(5);
    arbolb.insertar(21);
    

    
    System.out.println("Raiz: "+arbolb.raiz.dato);
    System.out.println("Hijo derecho de raiz: "+arbolb.buscaHijoDer(20));
    System.out.println("Hijo izquierdo de raiz: "+arbolb.buscaHijoIzq(20)+"\n");
    System.out.println("eliminar 24  "+arbolb.eliminar(24));
        
        
   
       
    System.out.println("\nRecorrido Preorder: ");
    arbolb.recorridoPreorden();
    
    System.out.println("\n\nRecorrido Posorder");
        arbolb.recorridoPosorden();
        
    System.out.println("\n\nRecorrido Inorder");
    arbolb.recorridoInorden();
   
    }
    
}
