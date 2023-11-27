package Papelaria.model;

public class ProdutoBrinquedo extends Produto{

	private String carrinho = "Hot Wheels";
	public ProdutoBrinquedo(int id, int tipo, String nome, float preco, String carrinho) {
		super(id, tipo, nome, preco);
		this.carrinho = carrinho;
	}
	public String getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(String carrinho) {
		this.carrinho = carrinho;
	}
	
	//metodos vizualizar do brinquedo
		@Override
		public void visualizar() {
			super.visualizar();
			System.out.println("O tipo do " + this.getTipo()+ " é " +this.getCarrinho());
		}

}
