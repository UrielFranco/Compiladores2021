/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Uriel Franco
 */
public class Nodo {
    
    

   
    int nodoinicial;
    int nodofinal;
    char letra;

    

    public int getNodoinicial() {
        return nodoinicial;
    }

    public void setNodoinicial(int nodoinicial) {
        this.nodoinicial = nodoinicial;
    }

    public int getNodofinal() {
        return nodofinal;
    }

    public void setNodofinal(int nodofinal) {
        this.nodofinal = nodofinal;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

   
    

     public Nodo(int nodoinicial, int nodofinal, char letra) {
        this.nodoinicial = nodoinicial;
        this.nodofinal = nodofinal;
        this.letra = letra;
    }
    
     public Nodo() {
        
    } 

    
    
}
