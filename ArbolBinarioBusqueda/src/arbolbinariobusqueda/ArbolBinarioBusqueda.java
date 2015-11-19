package arbolbinariobusqueda;

public class ArbolBinarioBusqueda {

    public static void main(String[] args) {
    
    Arbol arbolb = new Arbol();       
           
    arbolb.insertar(20);
    arbolb.insertar(24);
    arbolb.insertar(4);
    arbolb.insertar(30);
    arbolb.insertar(21);
    arbolb.insertar(5);
    
    

    System.out.println("Raiz: "+arbolb.raiz.dato);
    System.out.println("Derecha: "+arbolb.raiz.derecha.dato);
    System.out.println("Izquierda: "+arbolb.raiz.izquierda.dato);
    System.out.println("hijo derecho de  24: "+arbolb.raiz.derecha.derecha.dato);
        System.out.println("Hijo izquierdo de 24: "+arbolb.raiz.derecha.izquierda.dato);
        System.out.println("Hijo derecho de 4:"+ arbolb.raiz.izquierda.derecha.dato);
    System.out.println("hijo derecho de 20: "+ arbolb.buscaHijoDer(20));
    System.out.println("hijo derecho de 4: "+arbolb.buscaHijoDer(4));
        
    System.out.println("Recorrido Preorder: ");
    arbolb.recorridoPreorden();
    
    System.out.println("\nRecorrido Posorder");
        arbolb.recorridoPosorden();
        
        System.out.println("\nRecorrido Inorder");
        arbolb.recorridoInorden();
   
    }
    
}
