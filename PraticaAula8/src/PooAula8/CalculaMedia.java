/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooAula8;
import java.util.Scanner;

/**
 *
 * @author Aly Macome
 */
/*
3.	Faça um método que calcule a média de um aluno de acordo com o critério definido neste curso. 
        Além disso, faça um outro método que informe o status do aluno de acordo com a tabela a seguir: 
•	Nota acima de 6 à “Aprovado”
•	Nota entre 4 e 6 à Conceito “Candidato ao Exame” 
•	Nota abaixo de 4 à Conceito “Reprovado”

*/
public class CalculaMedia {
    static double media;
    static double test1,test2;
    
    Scanner s = new Scanner(System.in);
   
    
            
    public static void media(double test1, double test2){
        media = (test1 + test2)/2;
    }

    public static double getMedia() {
        return media;
    }
     
    public static String status(){
        String estado = null;
        
        if(getMedia() > 6) {
            estado = "Aprovado";
        }
        else if(getMedia() > 4 && getMedia() < 6){
            estado = "Candidato ao Exame";
        }
        else if(getMedia() < 4){
            estado = "Reprovado";
        }
        
        return estado;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("indique o valor do teste1");
        test1 = s.nextDouble();
        System.out.println("indique o valor do teste2");
        test2 = s.nextDouble();
        media(test1, test2);
        System.out.println("A media do aluno e " +getMedia()+ " e foi "+status());
    }
    
}
