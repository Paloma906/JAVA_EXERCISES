/*
Em um país imaginário denominado Lisarb,todos os habitantes ficam felizes em pagar seus impostos,
pois sabem que nele não existem políticos corruptos e os recursos arrecadados são 
utilizados em benefício da população,sem qualquer desvio.
A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao sálario de uma pessoa de Lisarb.
Em seguida, calcule e mostre e o valor que esta pessoa deve pagar de Imposto de Renda,
segundo a tabela abaixo.

de 0.00 a R$ 2000.00 = ISENTO
de R$ 2001.00 até R$ 3000.00 = 8%
de R$ 3001.00 até R$ 4500.00 = 18%
acima de R$ 4500.00 = 28%
*/

package com.mycompany.exercise5;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        
        double calculoImposto;
        
        if (valor <= 2000.00){
        
            calculoImposto = 0.0;
        }
        else if (valor > 2000.00 && valor < 3000.00){
            
            calculoImposto = (valor*0.08);
            
        } 
        else if (valor >= 3000.00 && valor < 4500){
           calculoImposto =(valor*0.18);
            
        }
        else{
           calculoImposto =(valor*0.28);
           
        }
        System.out.printf("O valor do imposto será R$ %.2f%n", calculoImposto);
        
        sc.close();
    }
}
