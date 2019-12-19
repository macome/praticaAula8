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
2.	Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos para conversão
        aproximada das unidades de tempo segundo a lista abaixo. 
•	1 minuto = 60 segundos 
•	1 hora = 60 minutos 
•	1 dia = 24 horas
•	1 semana = 7 dias 
•	1 mês = 30 dias 
•	1 ano = 365.25 dias

*/
public class ConversaoDaUnidadeTempo {
    public static double minuSegundo(double min){
        return min * 60;
    }
    public static double horaMin(double hora){
        return hora * 60;
    }
}
