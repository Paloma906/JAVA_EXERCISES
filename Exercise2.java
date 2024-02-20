/*
ex2: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração 
do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo 
uma duração mínima de 1 hora e máxima de 24 horas.
 */

package com.mycompany.exercise2;

import java.util.Scanner;

/**
 *
 * @author palom
 */
public class Exercise2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a hora inicial do jogo:");
        float horaInicial = sc.nextFloat();
        
        System.out.println("Digite a hora final do jogo");
        float horaFinal = sc.nextFloat();
        
        float duracao;
        
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        
        System.out.println("A duração do jogo foi de " + duracao + " horas");
        
        sc.close();
        
        
    }
}
