/* @author Diego Lins
 * @version 13/11/2020
 */
public class Produto {

	private int codigo;
	private String descricao, lote;
	private double preco;

	public Produto(int codigo, String descricao, String lote, double preco) {	
		this.codigo = codigo;
		this.descricao = descricao;
		this.lote = lote;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto: " + codigo + " , Descricao: " + descricao 
				+ " , Lote: " + lote +
				" , Preco: " + String.format("%.2f", preco);
	}

	
}
