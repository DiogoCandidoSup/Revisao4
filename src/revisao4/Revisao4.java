/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao4;

import java.util.Scanner;

/**
 *
 * @author Mirian Marcio Diogo
 */
public class Revisao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor a pagar");
        double valor = scan.nextDouble();
        
        System.out.println("Digite um numero");
        System.out.println("1 - A vista com dinheiro ou cheque: 10% desconto");
        System.out.println("2 - A vista com cartao: 15% desconto");
        System.out.println("3 - 2X: Preco normal");
        System.out.println("4 - 2X: Juros 10%");
        int condicao = scan.nextInt();
        
        switch (condicao) {
            case 1:
                valor = valor * 0.9;
                break;
            case 2:
                valor = valor * 0.85;
                break;
            case 3:
                valor = valor * 1;
                break;
            case 4:
                valor = valor * 1.1;
                break;
            default:
                System.out.println("O numero digitado nao e valido");
                break;
        }
        
        System.out.println("Valor a pagar: " + valor);
    }
    
}
