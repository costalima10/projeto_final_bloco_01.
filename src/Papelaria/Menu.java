package Papelaria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int op;//variavel que vou usar para verificar a opção que o uusuario vai digitar
	
	while(true) {
		
        System.out.println("                                                     ");
        System.out.println("\t     				 Papelaria               		 ");
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println("            1 - Cadastrar produto                    ");
        System.out.println("            2 - Listar todos os produtos             ");
        System.out.println("            3 - Buscar produto por ID                ");
        System.out.println("            4 - Atualizar produto                    ");
        System.out.println("            5 - Apagar Produto                       ");
        System.out.println("            6 - Sair                                 ");
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("\tEntre com a opção desejada:                        ");
        op = leia.nextInt();
        
        if (op == 6) {
			System.out.println("\n !! SAINDO DO PROGRAMA !!");
            leia.close();
			System.exit(0);
		}
        
        switch(op) {// casos que receberao os metodos 
        case 1:
        	System.out.println("Cadastrar Produto");
        	break;
        case 2:
        	System.out.println("Listar todos os produtos ");
        	break;
        case 3:
        	System.out.println("Buscar produto por ID ");
        	break;
        case 4:
        	System.out.println("Atualizar produto");
        	break;
        case 5:
        	System.out.println("Apagar Produto");
        	break;
        	default:
        		System.out.println("\\nOpção Inválida!\\n");
        	}
		}
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Gabriel da Costa Lima ");
		System.out.println("\n*********************************************************");
	}

}
