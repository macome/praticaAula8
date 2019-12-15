
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
    }
    
}
