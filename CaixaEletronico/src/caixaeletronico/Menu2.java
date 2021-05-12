package caixaeletronico;

import java.util.Scanner;

public class Menu2 {
    
    
    public void executarMenu() {
        
        System.out.println("1 - SALDO");
        System.out.println("2 - DEPÓSITO");
        System.out.println("3 - SAQUE\n");
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        
        //OBJETOS
        Scanner input = new Scanner(System.in);
        Conta objConta = new Conta();
        
        //ATRIBUTOS
        int operacao = input.nextInt();
        float valor = 0;
        
        
        switch (operacao) {
            case 1:
                objConta.verificarSaldo();
                break;
            
            case 2:
                System.out.println("Digite o valor de depósito".toUpperCase());
            
                valor = input.nextFloat();
                objConta.realizarDeposito(valor);
                objConta.verificarSaldo();
                break;
            
            case 3:
                System.out.println("DIGITE O SAQUE SOLICITADO");
                valor = input.nextFloat();
                objConta.realizarSaque(valor);
                objConta.verificarSaldo();
                break;
                
            default:
                System.out.println("OCORREU UM ERRO!!!");
              
        }
        
    }
    
    
}
