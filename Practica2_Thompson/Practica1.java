/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;


import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Uriel Franco
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Scanner entrada= new Scanner(System.in);
       ArrayList<Nodo> nodos;
        nodos = new ArrayList<>();
        
        String expresion;
       // System.out.println("Escribe la expresion...");
        expresion="(a|b)*abb";
        System.out.println("La cadena es..."+expresion);
        
         int inicio=0;
         int ultimo =0;
         int contador=0;
        for(int i=1;i<expresion.length();i++){
            
           char c = expresion.charAt(i);
           
                     
          //NOdos auxiliares para lacreacion de las "plantillas" de las operaciones or y cerradura
            Nodo aux,aux1,aux2,aux3,aux4,aux5;
             aux = new Nodo();
             aux1= new Nodo(); 
             aux2= new Nodo(); 
             aux3= new Nodo(); 
             aux4= new Nodo(); 
             aux5= new Nodo(); 
             
             int operador; 
             
             
           if(c=='(' || c==')'){
               operador=0;
           }
           else{
            
            if(c=='|')
               operador=1;
           else{
               if(c=='*')
                   operador=2;
               else{
               operador=3;
               }
           }
            
        }
             
             
           

            
           
           
            switch (operador){
                
                case 0:
                    
                break;
                
                case 1:
                    inicio=contador;
                    int j=contador;
                    char anterior = expresion.charAt(i-1);
                    char siguiente= expresion.charAt(i+1);
                    int ini=j;
                    
                    
                    aux1.setNodoinicial(j);
                    j++;
                    aux1.setNodofinal(j);
                    aux1.setLetra('E');
                    nodos.add(aux1);
                    
                                 
                    aux2.setNodoinicial(j);
                    j++;
                    aux2.setNodofinal(j);
                    aux2.setLetra(anterior);
                    nodos.add(aux2);
                    
                    aux3.setNodoinicial(j);
                    j++;
                    aux3.setNodofinal(j);
                    aux3.setLetra('E');
                    nodos.add(aux3);
                    int fin=j;
                    
                    
                    
                    aux4.setNodoinicial(ini);
                    j++;
                    aux4.setNodofinal(j);
                    aux4.setLetra('E');
                    nodos.add(aux4);
                    
                    aux5.setNodoinicial(j);
                    j++;
                    aux5.setNodofinal(j);
                    aux5.setLetra(siguiente);
                    nodos.add(aux5);
                    
                    aux.setNodoinicial(j);
                    aux.setNodofinal(fin);
                    aux.setLetra('E');
                    nodos.add(aux);
                    
                    contador=j;
                    ultimo=fin;
                    i++;
                    break;
            
                case 2:
                    
                    //reliza la trancicion de regreso
                    aux.setNodoinicial(ultimo);
                    aux.setNodofinal(inicio);
                    aux.setLetra('E');
                    nodos.add(aux);
                    
                    int w=contador+1;
                    int y=contador+2;
                    
                    
                    aux1.setNodoinicial(ultimo);
                    aux1.setNodofinal(w);
                    aux1.setLetra('E');
                    nodos.add(aux1);
                    
                    aux2.setNodoinicial(y);
                    aux2.setNodofinal(inicio);
                    aux2.setLetra('E');
                    nodos.add(aux2);
                    
                    
                    //transicion de los nuevos nodos creados
                    aux3.setNodoinicial(y);
                    aux3.setNodofinal(w);
                    aux3.setLetra('E');
                    nodos.add(aux3);
                    
                    contador=contador+2;
                    inicio=y;
                    ultimo=w;
                    
                    
                    break;
                 
                case 3:
                    
                    
                    char x = expresion.charAt(i-1);
                    if(x!='(' && x!=')' && x!='|' ){
                        aux.setNodoinicial(ultimo);
                        contador=contador+1;
                        aux.setNodofinal(contador);
                        aux.setLetra(c);
                        nodos.add(aux);
                        ultimo=contador;
                    }
                    
                    break;
            
                default:
                    break;
            }
        
        }
        
        System.out.println("Las transiciones son...");
        for(int i = 0; i < nodos.size(); i++) {
            System.out.println(nodos.get(i).getNodoinicial()+"--"+nodos.get(i).getLetra()+"-->"+nodos.get(i).getNodofinal());
        }
        
        System.out.println("\nel estado de inicio..."+inicio);
        System.out.println("el estado final es..."+ultimo);
        
        
    }
    
}
