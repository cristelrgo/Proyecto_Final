
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
    
        Nodo aux = raiz;
        while(aux.dato != valor){
            if(valor < aux.dato){
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
    
  public void buscaHijoDer(int valor){
    
        if (buscar(valor).derecha != null){
        
        System.out.print(buscar(valor).derecha.dato+" \n");
        
        }else{  
        System.out.print("na");
        }
    }
   public void buscaHijoIzq(int valor){
    
        if (buscar(valor).izquierda != null){
        
        System.out.print(buscar(valor).izquierda.dato+" \n");
        
        }else{  
        System.out.print("na");
        }
    }
    
    
    void imprimePre(){
        recorridoPre(raiz);
    }
    
    void recorridoPre(Nodo nodo){
        if(nodo == null)
            return;
         
        System.out.print(nodo.dato + " ");     
        recorridoPre(nodo.izquierda);   
        recorridoPre(nodo.derecha);     
    }
     
    void imprimeIno() {
        recorridoInorden(raiz);
    }
     
    void recorridoInorden(Nodo nodo){
        if(nodo == null)
            return;
         
        recorridoInorden(nodo.izquierda);
        System.out.print(nodo.dato + " ");
        recorridoInorden(nodo.derecha);
    }
     
    void imprimePos(){
        recorridoPosorden(raiz);        
    }
     
    void recorridoPosorden(Nodo nodo){
        if( nodo == null )
            return;
         
        recorridoPosorden(nodo.izquierda);
        recorridoPosorden(nodo.derecha);
        System.out.print(nodo.dato + " ");
    }
    
    public boolean elimina(int pDato){
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
    

