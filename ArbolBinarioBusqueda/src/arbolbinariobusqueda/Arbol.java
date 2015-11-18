package arbolbinariobusqueda;


public class Arbol {
    
    
    Nodo raiz=null;
    
   void Insertar(int dato){
       
       Nodo NewHoja = new Nodo(dato);
       
       if(raiz==null){
           
           raiz = NewHoja;
           
       }else{
       
           if(raiz.dato == NewHoja.dato){
              
           }else{
           
               if(raiz.dato<NewHoja.dato){
               
                   raiz.derecha = NewHoja;
                   
               }else{
               
                   raiz.izquierda = NewHoja;
               }
           }
       }  
   } 
    
}
