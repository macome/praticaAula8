/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooAula8;

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
    double media;
    double tes1,test2;
    
    public double media(double test1, double test2){
        //double media;
        return media = (test1 + test2)/2;
    }

    public double getMedia() {
        return media;
    }
     
    public void status(){
        if(this.getMedia() > 6) {
            System.out.println("Aprovado");
        }
        else if(this.getMedia() > 4 && this.getMedia() < 6){
            System.out.println("Candidato ao Exame");
        }
        else if(this.getMedia() < 4){
            System.out.println("Reprovado");
        }
    }
    
}
