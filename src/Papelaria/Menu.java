package Papelaria;

import java.util.Scanner;

import Papelaria.Controller.ProdutoController;
import Papelaria.model.Produto;
import Papelaria.model.ProdutoBrinquedo;
import Papelaria.model.ProdutoMaterial;

public class Menu {

	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();
		
		Scanner leia = new Scanner(System.in);
		
		String nome,carrinho = "", caneta = "";
		float preco;
		int op,tipo,id;
	
	
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
			sobre();
            leia.close();
			System.exit(0);
		}
        
        switch(op) {// casos que receberao os metodos 
        case 1:
        	System.out.println("\nCadastrar Produto");
        	System.out.println("\nDigite o nome do produto: ");
        	nome = leia.next();
        	System.out.println("\nDigite o preco do produto: ");
        	preco = leia.nextInt();
        	
        	do {
				System.out.println("\nDigite o tipo do produto (1- Material ou 2- Brinquedo): ");
				tipo = leia.nextInt();
				
			}while(tipo < 1 && tipo > 2);
        
        	switch(tipo){	
			case 1 -> {
				produtos.criarProduto(new ProdutoMaterial(produtos.gerarid(),tipo,nome,preco,caneta));
			}
			case 2 -> {
				produtos.criarProduto(new ProdutoBrinquedo(produtos.gerarid(),tipo,nome,preco,carrinho));
				}
			}	break;
       
        case 2:
        	System.out.println("Listar todos os produtos ");
        	produtos.listarProdutos();
        	break;
        case 3:
        	System.out.println("\n Buscar produto por ID ");
        	System.out.println("\n Digite o numero da conta: ");
        	id = leia.nextInt();
        	produtos.consultarProdutoPorId(id);
        	break;
        case 4:
        	System.out.println("\nAtualizar produto");
        	
        	System.out.println("\nDigite o id do produto: ");
        	id = leia.nextInt();
        	var buscaProduto = produtos.buscarNaCollection(id);
        	
        	if(buscaProduto != null) {
        		
        		System.out.println("\nDigite o nome do produto: ");
            	nome = leia.next();
            	System.out.println("\nDigite o preco do produto: ");
            	preco = leia.nextInt();
            	
            	do {
    				System.out.println("\nDigite o tipo do produto (1- Material ou 2- Brinquedo): ");
    				tipo = leia.nextInt();
    				
    			}while(tipo < 1 && tipo > 2);
            
            	switch(tipo){	
    			case 1 -> {
    					produtos.atualizarProduto(new ProdutoMaterial(id,tipo,nome,preco,caneta));
    			}
    			case 2 -> {
    				produtos.atualizarProduto(new ProdutoBrinquedo(id,tipo,nome,preco,carrinho));
    				}
    			default ->{
    				System.out.println("TIPO DE PRODUTO INVALIDO!");
    			}
    		}
        		
        	}else {
    			System.out.println("O PRODUTO NAO FOI ENCONTRADO!!");
        	}
        	
        case 5:
        	System.out.println("Apagar Produto");
        	System.out.println("\n Digite o id do produto: ");
        	id = leia.nextInt();
        	produtos.deletarProduto(id);
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
