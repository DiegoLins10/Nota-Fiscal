/* @author Diego Lins
 * @version 13/11/2020
 */
public class NotaFiscal {

	private int numero, naturezaOp;
	private String dtEmissão;
	private Cliente cliente;
	private ListaDeProdutos lista;

	public NotaFiscal(int numero, int naturezaOp, String dtEmissão, Cliente cliente, ListaDeProdutos lista) {
		this.numero = numero;
		this.naturezaOp = naturezaOp;
		this.dtEmissão = dtEmissão;
		this.cliente = cliente;
		this.lista = lista;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNaturezaOp() {
		return naturezaOp;
	}

	public void setNaturezaOp(int naturezaOp) {
		this.naturezaOp = naturezaOp;
	}

	public String getDtEmissão() {
		return dtEmissão;
	}

	public void setDtEmissão(String dtEmissão) {
		this.dtEmissão = dtEmissão;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ListaDeProdutos getLista() {
		return lista;
	}

	public void setLista(ListaDeProdutos lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return " NotaFiscal { numero: " + numero +
				" naturezaOp: " + naturezaOp + 
				", Data Emissão: " + dtEmissão + 
				", Cliente: "+ cliente.toString() + 
				", lista: " + lista.toString() + '}';
	}
	

}
