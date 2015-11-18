package arbolbinariobusqueda;


public class Arbol {
    
    
    Nodo raiz=null;
    
   /*void Insertar(int pDato){
       
       Nodo n = new Nodo(pDato);
       
       if(raiz==null){
           raiz = n;
       
       }else{
       if(raiz.dato == n.dato){
              
           }else{
           
               if(n.dato < raiz.dato){
               raiz.izquierda = n;
                   
               }else{
               raiz.derecha = n;
               }
           }
       }  
   }*/
    
    void insertar (int pDato){
        Nodo n = new Nodo (pDato);
        
         if(raiz==null){
           raiz = n;
       
       }else{
             Nodo aux=raiz, padre=null;
             while (aux!=null){
                 padre = aux;
                 if(n.dato > aux.dato){
                     aux = aux.derecha;
                 }else{
                     aux = aux.izquierda;
                 }
             }
             if (n.dato > padre.dato){
                  padre.derecha = n;
             }else {
                 padre.izquierda = n;
             }
                 
         }
    }
    
 }