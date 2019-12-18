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
    14.	Crie uma classe em Java chamada factura para uma loja de suprimentos de
    informática. A classe deve conter quatro variáveis:

•	o número (String),
•	a descrição (String),
•	a quantidade comprada de um item (int)
•	e o preço por item (double).
    A classe deve ter um construtor e um método get e set para cada variável de instância. 
    Além disso, forneça um método chamado getTotalFatura que calcula o valor da factura e 
    depois retorna o valor como um double. Se o valor não for positivo, ele deve ser configurado como 0. 
    Se o preço por item não for positivo, ele deve ser configurado como 0.0.
    Escreva uma classe de teste chamado FaturaTeste (em outro arquivo) que demonstra as capacidades da classe Factura

*/
public class Factura {
    
    String numero;
    String descricao;
    int quantComprada;
    double preco;
    double soma;

    public Factura(String numero, String descricao, int quantComprada, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantComprada = quantComprada;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getTotalFatura(){
        soma = quantComprada*preco;
        if(soma < 0){
            soma = 0;
        }
        return soma;
    }
    
    
    
}
