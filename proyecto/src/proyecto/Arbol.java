package proyecto;

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
    
    
    void recorridoPreorden(){
        imprimePre(raiz);
    }
    
    void imprimePre(Nodo nodo){
        if(nodo == null)
            return;
         
        System.out.print(nodo.dato + " ");     
        imprimePre(nodo.izquierda);   
        imprimePre(nodo.derecha);     
    }
     
    void recorridoInorden() {
        imprimeIno(raiz);
    }
     
    void imprimeIno(Nodo nodo){
        if(nodo == null)
            return;
         
        imprimeIno(nodo.izquierda);
        System.out.print(nodo.dato + " ");
        imprimeIno(nodo.derecha);
    }
     
    void recorridoPosorden(){
        imprimePos(raiz);        
    }
     
    void imprimePos(Nodo nodo){
        if( nodo == null )
            return;
         
        imprimePos(nodo.izquierda);
        imprimePos(nodo.derecha);
        System.out.print(nodo.dato + " ");
    }
    
    public boolean eliminar(int pDato){
        Nodo aux=raiz;
        Nodo tem=raiz;
        boolean hijoIzq = true;
        while (aux.dato !=pDato){
            tem = aux;
            if (pDato < aux.dato){
                hijoIzq = true;
                aux = aux.izquierda;
            }else {
                hijoIzq = false;
                aux = aux.derecha;
            }
            if(aux == null){
                return false;
            }
        }//fin del while
        if(aux.izquierda==null && aux.derecha==null){
            if(aux==raiz){
                raiz=null;
            }else if(hijoIzq){
                tem.izquierda=null;
            }else{
                tem.derecha=null;
            }
        }else if(aux.derecha==null){
            if(aux==raiz){
                raiz=aux.izquierda;   
            }else if (hijoIzq){
                tem.izquierda=aux.izquierda;
            }else{
                tem.derecha=aux.izquierda;
            }
        }else if (aux.izquierda==null){
            if(aux==raiz){
                raiz = aux.derecha;
            }else if(hijoIzq){
                tem.izquierda=aux.derecha;
            }else{
                tem.derecha = aux.izquierda;
            }
        }else{
            Nodo reemplazo = obtenerNodo(aux);
            if (aux==raiz){
                raiz = reemplazo;
            }else if (hijoIzq){
                tem.izquierda=reemplazo;
            }else{
                tem.derecha=reemplazo;
            }
            reemplazo.izquierda = aux.izquierda;
        }
        return true;
    }
    
    public Nodo obtenerNodo(Nodo nodoReem){
        Nodo reemPadre = nodoReem;
        Nodo reemplazo = nodoReem;
        Nodo aux = nodoReem.derecha;
        
        while(aux!=null){
            reemPadre = reemplazo;
            reemplazo = aux;
            aux = aux.izquierda;
        }
        if(reemplazo != nodoReem.derecha){
            reemPadre.izquierda =reemplazo.derecha;
            reemplazo.derecha=nodoReem.derecha;  
        }
        return reemplazo;
    } 
}
    

