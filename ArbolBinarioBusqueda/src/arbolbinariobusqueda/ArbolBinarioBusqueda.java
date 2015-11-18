package arbolbinariobusqueda;

public class ArbolBinarioBusqueda {

    public static void main(String[] args) {
        Arbol arbolb = new Arbol();       
           
    arbolb.Insertar(2);
    arbolb.Insertar(3);
    arbolb.Insertar(1);
    
    
    System.out.println("Raiz derecha: "+arbolb.raiz.derecha.dato);
    System.out.println("Raiz: "+arbolb.raiz.dato);
    System.out.println("Raiz izquierda: "+arbolb.raiz.izquierda.dato);
        
        
    }
    
}
