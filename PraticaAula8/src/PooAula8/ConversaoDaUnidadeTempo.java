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
    
    public static double diaHora(double dia){
        return dia * 24;
    }
    
    public static double semanaDia(double semana){
        return semana * 7;
    }
   
    public static int mesDia(int mes){
        return mes * 30;
    }
    
    public static double anoDia(double ano){
        return ano * 365.25;
    }
    
    public static void main(String[] args) {
       int x;
        System.out.println("1 - Minuto para Segundos");
        System.out.println("2 - Hora para Minutos");
        System.out.println("3 - Dia para horas");
        System.out.println("4 - Semana para dias");
        System.out.println("5 - Mes para dias");
        System.out.println("6 - Ano para dias");
    }
}
