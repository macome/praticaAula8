
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aly Macome
 */
public class CollecaoList {
    
     public static void main(String[] args) {
        
        List <String> lista = new ArrayList();
        lista.add("fotebol");
        lista.add("tenis");
        lista.add("volei bol");
        lista.add("fotebol");// lista permite repetir elementos
        
         System.out.println(lista.toString());
        
         for (int i = 0; i < lista.size(); i++) {//percorre toda lista
             
             String A = lista.get(i);//pega os elemntos da lista na posicao i 
             lista.set(i, A.toUpperCase());//atribui esse elementos no indice i a A
             
         }
        
        System.out.println(lista.toString());
        System.out.println(lista.indexOf("tenis"));//nao est a funcionar ver porque
        System.out.println(lista.subList(1, 3));//cria uma sublista dosindices lindicados
        lista.subList(1, 3).clear();//retira a sublista da lista
        System.out.println(lista.toString());
        
    }
    
}
