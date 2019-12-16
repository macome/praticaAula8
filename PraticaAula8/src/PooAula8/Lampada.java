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
public class Lampada {
    
    /*
    1.	Crie uma classe Lâmpada cujos atributos são: cor, estado, tipo, voltagem, 
    grau de luminosidade (de 0 a 100)
a)	Adicione os construtores necessários
b)	Adicione os getters e setters
c)	Adicione o método toString
d)	Adicione métodos para ligar, desligar a luz
e)	Adicione um método que mostre a mensagem “Luz Ligada” ou “Luz Desligada”.
f)	Adicione um método que verifica se a lâmpada esta fundida
g)	Adicione um método para verificar se 2 lâmpadas têm a mesma voltagem
h)	Adicione um método que verifica se 2 lâmpadas são iguais
i)	Adicione um método que aumente ou reduz o grau de luminosidade (de 5 em
j)	Quando uma lâmpada ultrapassa o grau de luminosidade máximo (100) funde 
    (isto é, não pode ligar ou desligar mais).

    */
    
    String cor;
    String estado;
    String tipo;
    int voltagem;
    int grauDeLuminosidade;
    
     void ligarDesligar(){
         
        
        
        
    
    }
     
     private Lampada(String cor, int voltagem, int grauDeLuminosidade){
         
         this.cor = cor;
         this.grauDeLuminosidade = grauDeLuminosidade;
         this.voltagem = voltagem;         
     
     }
     
     public String getCor(){
         
        return cor; 
     
     }
     
     public void setCor(String cor){
         
         this.cor = cor;
     
     }
    
}
