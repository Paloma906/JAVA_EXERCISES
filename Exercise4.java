/*
 Questão4: Leia dois valores com uma casa decimal (x e y), que devem representar
as coordernadas de um ponto em um plano.A seguir, determine qual o quadrante ao qual
pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x=y=0).

Se o ponto estiver na origem, escreva a mensagem "Origem".

Se o ponto estiver sobre um dos eixos escreva "Eixo x" ou "Eixo y", conforme for
a situação.
 */

package com.mycompany.exercise4;

import java.util.Scanner;


public class Exercise4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        float x = sc.nextFloat();
        
        System.out.println("Digite o segundo valor: ");
        float y = sc.nextFloat();
        
        if (x == 0 && y ==0){
            System.out.println("Origem");
        } 
        else if (x==0){
            System.out.println("Eixo y");
        }
        else if (y==0){
            System.out.println("Eixo x");
        } 
        else if (x > 0 && y > 0){
            System.out.println("Primeiro Quadrante (+,+)");
        }
        else if (x < 0 && y >0){
            System.out.println("Segundo Quadrante (-,+)");
        }
        else if(x<0 && y<0){
            System.out.println("Terceiro Quadrante (-,-)");
        }
        else {
            System.out.println("Quarto Quadrante (+,-)");
        }
        
        sc.close();
        
    }
}
