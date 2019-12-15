
import java.util.ArrayList;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aly Macome
 */
public class Collecoes {
    
    public static void main(String[] args) {
        
        
        Collection <String> nomes = new ArrayList<>();
        nomes.add("joao");
        nomes.add("mario");
        nomes.add("paulo");
        nomes.remove("paulo");
        nomes.clear();//limpa todos elemntos da collecao
        
        //System.out.println(nomes.toString());
        System.out.println(nomes.isEmpty());//verifica se esta vazio
        System.out.println(nomes.contains("paulo"));//verifica se paulo existe na colleccao
        //System.out.println(nomes.remove("paulo"));//remove paulo da colleca
        System.out.println(nomes.toString());
        
        //trabalhando com grupos
        
        //Collection <String> nomes2 = new Arrays.asList("ALY","ALYCA");
            
    }
    
}
