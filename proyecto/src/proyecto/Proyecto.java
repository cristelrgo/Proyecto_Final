package proyecto;

public class Proyecto {

    public static void main(String[] args) {
    Arbol arbolb = new Arbol();       
           
    arbolb.insertar(20);
    arbolb.insertar(25);
    arbolb.insertar(4);
    arbolb.insertar(2);
    arbolb.insertar(5);
    arbolb.insertar(22);
    arbolb.insertar(23);
    arbolb.insertar(26);
    arbolb.insertar(27);
    

    
    System.out.println("Raiz: "+arbolb.raiz.dato);
    System.out.println("Hijo derecho de raiz: ");
    arbolb.buscaHijoDer(20);
    System.out.println("Hijo izquierdo de raiz: ");
    arbolb.buscaHijoIzq(20);
    System.out.println("borramos el nodo 25:\n ");
    arbolb.elimina(25);
    System.out.println("Hijo derecho de 26: ");
    arbolb.buscaHijoDer(26);
    System.out.println("Hijo izquierdo de 2: ");
    arbolb.buscaHijoIzq(2);
        
   
       
    System.out.println("\nRecorrido Preorder: ");
    arbolb.imprimePre();
    
    System.out.println("\n\nRecorrido Posorder");
    arbolb.imprimePos();
        
    System.out.println("\n\nRecorrido Inorder");
    arbolb.imprimeIno();
  
   
    }
    }

