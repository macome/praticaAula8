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
       Scanner s = new Scanner(System.in);
                    
        System.out.println("1 - Minuto para Segundos");
        System.out.println("2 - Hora para Minutos");
        System.out.println("3 - Dia para horas");
        System.out.println("4 - Semana para dias");
        System.out.println("5 - Mes para dias");
        System.out.println("6 - Ano para dias");
        
        System.out.print("escolha uma opcao: ");
         x = s.nextInt();
         switch(x){
             case 1:
                 int minuto;
                 System.out.print("Digite o valor em minuto(s): ");
                 minuto = s.nextInt();
                 System.out.println(minuto +" minuto(s) e igual a "+minuSegundo(minuto)+ " segundo(s).");
                 break;
             case 2:
                 int hora;
                 System.out.print("Digite o valor em hora(s): ");
                 hora = s.nextInt();
                 System.out.println(hora +" hora(s) corresponde a "+horaMin(hora)+ " minutos(s).");
                 break;
             case 3:
                 int dia;
                 System.out.print("Indique o (s) dia (s): ");
                 dia = s.nextInt();
                 System.out.println(dia +" dia(s) corresponde a : "+diaHora(dia)+ " hora(s).");
                 break;
              case 4:
                 int semana;
                 System.out.print("Indique a (s) semana (s): ");
                 semana = s.nextInt();
                 System.out.println(semana +" semana (s) corresponde a"+semanaDia(semana)+ " dia (s).");
                 break;
              case 5:
                 int mes;
                 System.out.print("Indique o (s) mes (s): ");
                 mes = s.nextInt();
                 System.out.println(mes +" mes(s) corresponde a "+mesDia(mes)+ " dia (s).");
                 break;
              case 6:
                 int ano;
                 System.out.print("Indique o (s) ano (s): ");
                 ano = s.nextInt();
                 System.out.println(ano +" minuto(s) e igual a "+anoDia(ano)+ " segundo(s).");
                 break;
             default: System.out.print("Opcao Invalida!");
                  
         }
    }
}
