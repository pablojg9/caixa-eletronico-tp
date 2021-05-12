package caixaeletronico;

import java.util.Scanner;

public class Menu {
    
   public void executarMenu(){
        
        
        Scanner input = new Scanner(System.in);
        
        Conta objConta = new Conta();
       
        
        System.out.println("1 - SALDO");
        System.out.println("2 - DEPÓSITO");
        System.out.println("3 - SAQUE\n");
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        
        int operacao = input.nextInt();
        float valor = 0;

        if (operacao == 1) {

            //System.out.println("ESCOLHEU A OPÇÃO DE SALDO");
            objConta.verificarSaldo();

        }else if (operacao == 2) {

            //System.out.println("ESCOLHEU A OPÇÃO DE DEPÓSITO");
            System.out.println("Digite o valor de depósito".toUpperCase());
            
            valor = input.nextFloat();
            objConta.realizarDeposito(valor);
            objConta.verificarSaldo();
            

        }else if (operacao == 3) {

           // System.out.println("ESCOLHEU A OPÇÃO DE SAQUE");
            System.out.println("DIGITE O SAQUE SOLICITADO");
            valor = input.nextFloat();
            objConta.realizarSaque(valor);
            objConta.verificarSaldo();
            

        }else{

            System.out.println("OCORREU UM ERRO!!!");
        }
        
        
    }
       
}
    
    
    

