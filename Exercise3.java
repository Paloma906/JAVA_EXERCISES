/*
Exercicio 3: Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem
dizendo em qual dos seguintes intervalos ([0,25],[25,50],[50,75],[75,100]) este
valor se encontra. Obviamente se o valor não estiver em nenhum desses intervalos,
deverá ser impressa a mensagem "Fora do intervalo".
 */

package com.mycompany.exercise3;

import java.util.Scanner;


public class Exercise3 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor:");
        int n = sc.nextInt();
        
        String intervalo;
        
        if(n>= 0 && n<=25){
        intervalo = "[0,25]";
        
        }else if (n>25 && n<=50){
        intervalo = "[25,50]";
        
        }else if (n>50 && n<=75){
        intervalo = "[50,75]";
        
        }else if (n>75 && n<=100){
        intervalo = "[75,100]";
        }else{
        intervalo = "Fora do intervalo";
        }
        
        System.out.println("O valor está no intervalo: " + intervalo);
        
        sc.close();
        
    }
}
