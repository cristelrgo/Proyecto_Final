package arbolbinariobusqueda;


public class Arbol {
    
    
    Nodo raiz=null;
   
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
    
    public Nodo buscar(int valor){
        Nodo tem = raiz;
        Nodo aux = tem;
        
        while (aux.dato!=valor){
            if (valor<aux.dato){
                aux = aux.izquierda;
            }else{
                aux = aux.derecha;
            }
            if (aux==null){
                return null;
            }
        }
        return aux;
    }
    
    public int buscaHijoDer(int valor){
   
      return  buscar(valor).derecha.dato;   
    }
    
    public int buscaHijoIzq(int valor){
        
        return buscar(valor).izquierda.dato;
    }
    
    
    public void recorridoPreorden(){
        imprimePre(raiz);
    }
    
    private void imprimePre(Nodo nodo)
    {
        if(nodo == null)
            return;
         
        System.out.print(nodo.dato + " ");     
        imprimePre(nodo.izquierda);   
        imprimePre(nodo.derecha);     
    }
     
    public void recorridoInorden()
    {
        imprimeIno(raiz);
    }
     
    private void imprimeIno(Nodo nodo)
    {
        if(nodo == null)
            return;
         
        imprimeIno(nodo.izquierda);
        System.out.print(nodo.dato + " ");
        imprimeIno(nodo.derecha);
    }
     
    public void recorridoPosorden()
    {
        imprimePos(raiz);        
    }
     
    private void imprimePos(Nodo nodo){
        if( nodo == null )
            return;
         
        imprimePos(nodo.izquierda);
        imprimePos(nodo.derecha);
        System.out.print(nodo.dato + " ");
    }
}