/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aly Macome
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class CollecaoUtilitario {
    
    public static void main(String[] args) {
        
        List <String> B = new ArrayList();
        B.add("apolu");
        B.add("sergio");
        B.add("santos");
        B.add("jorge");
        B.add("ricardo");
        
        System.out.println(B);
        
        Collections.sort(B);
        System.out.println(B);//ordena os elemntos em ordem alfabetica
        
        Collections.reverse(B);//reverte a ordem
        System.out.println(B);
        
        Collections.addAll(B,"Mauro","pinto");//adiciona os elementos na lista
        System.out.println(B);
        
        ;
        System.out.println(Collections.frequency(B,"pinto"));//indica a frequencia do elemnto na lista
    }
    
}
