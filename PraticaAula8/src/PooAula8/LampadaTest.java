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
public class LampadaTest {
    
    public static void main(String[] args) {
       Lampada l1 = new Lampada("branca", true, "florescente",100, 60);
       l1.desligar();
        System.out.println(l1.toString());
       
       
    } 
    
}
