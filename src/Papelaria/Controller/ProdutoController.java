package Papelaria.Controller;

import java.util.ArrayList;

import Papelaria.model.Produto;
import Produto.Repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{
	
	private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	int id = 0;
	
	@Override
	public void criarProduto(Produto produto) {
		listaProduto.add(produto);
		System.out.println("O Produto "+produto.getNome()+" foi adicionado com sucesso");
	}

	@Override
	public void listarProdutos() {
		for(var produto : listaProduto) {
			produto.visualizar();
		}
		
	}

	@Override
	public void consultarProdutoPorId(int id) {
		var produto = buscarNaCollection(id);
		if (produto != null)
			produto.visualizar();
		else 
			System.out.println("Produto nao encontrado!!");
	}

	@Override
	public void atualizarProduto(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());
		if (buscaProduto != null) {
			listaProduto.set(listaProduto.indexOf(buscaProduto), produto);
			System.out.println("\n O produto "+produto.getId()+" foi atualizado!!");
		}else
			System.out.println("\n O produto "+produto.getId()+" não foi encontrado!!");
		
	}

	@Override
	public void deletarProduto(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			if(listaProduto.remove(produto) == true) {
				System.out.println("\n O produto foi deletado com sucesso !! ");
			}else {
				System.out.println("\n O produto nao foi encontrado!!");
			}
		}
		
	}
	
	public Produto buscarNaCollection(int id) {
		for (var produto : listaProduto) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	
		public int gerarid() {
			return ++ id;
		}
}
