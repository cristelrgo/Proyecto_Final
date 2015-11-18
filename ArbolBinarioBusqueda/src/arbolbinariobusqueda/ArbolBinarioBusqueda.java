package arbolbinariobusqueda;

public class ArbolBinarioBusqueda {

    public static void main(String[] args) {
    
    Arbol arbolb = new Arbol();       
           
    arbolb.insertar(20);
    arbolb.insertar(24);
    arbolb.insertar(4);
    arbolb.insertar(30);
    arbolb.insertar(5);

    System.out.println("Raiz derecha: "+arbolb.raiz.derecha.dato);
    System.out.println("Raiz: "+arbolb.raiz.dato);
    System.out.println("Raiz izquierda: "+arbolb.raiz.izquierda.dato);
    System.out.println(" razi padre derecha"+arbolb.raiz.derecha.derecha.dato);
    System.out.println(" razi padre derecha"+arbolb.raiz.izquierda.derecha.dato);
   
    }
    
}
