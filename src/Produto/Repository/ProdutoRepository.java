package Produto.Repository;

import Papelaria.model.Produto;

public interface ProdutoRepository {

	// CRUD
	public void criarProduto(Produto produto);
	public void listarProdutos();
	public void consultarProdutoPorId(int id);
	public void atualizarProduto(int id, Produto produto);
	public void deletarProduto(int id);
}
