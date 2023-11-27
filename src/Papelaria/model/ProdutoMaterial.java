package Papelaria.model;

public class ProdutoMaterial extends Produto {

	String caneta = "caneta";
	public ProdutoMaterial(int id, int tipo, String nome, float preco, String caneta) {
		super(id, tipo, nome, preco);
		this.caneta = caneta;
	}
	public String getCaneta() {
		return caneta;
	}
	public void setCaneta(String caneta) {
		this.caneta = caneta;
	}
	//metodos vizualizar do caneta
			@Override
			public void visualizar() {
				super.visualizar();
				System.out.println("O tipo do " + this.getTipo()+ " é " + this.getCaneta());
			}
}
