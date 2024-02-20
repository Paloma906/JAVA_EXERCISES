
/*Questão 1: Leia dois valores inteiros (A e B).Após, o programa deve mostrar uma mensagem "São múltiplos"
ou "Não são múltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder
ser digitados em ordem crescente ou decrescente*/




package com.mycompany.primeiroprograma;


import java.util.Scanner;


public class PrimeiroPrograma {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        if (n1 % n2 == 0 ||n2 % n1 == 0){
        System.out.println("São múltiplos entre si");
    }
        else{
            System.out.println("Não são múltiplos entre si");
            }
        
        sc.close();
        
    }
            
     
}
