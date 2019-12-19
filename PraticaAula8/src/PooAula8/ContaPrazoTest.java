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
public class ContaPrazoTest {
    public static void main(String[] args) {
        ContaPrazo c = new ContaPrazo();
        c.definirSaldoInicial(5000);
        c.mostrarValor();
        c.levantar(500);
        c.depositar(100);
        c.mostrarValor();
        c.levantar(1200);
        c.mostrarValor();
        
        
    }
    
    
}
