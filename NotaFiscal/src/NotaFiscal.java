/* @author Diego Lins
 * @version 13/11/2020
 */
public class NotaFiscal {

	private int numero, naturezaOp;
	private String dtEmiss�o;
	private Cliente cliente;
	private ListaDeProdutos lista;

	public NotaFiscal(int numero, int naturezaOp, String dtEmiss�o, Cliente cliente, ListaDeProdutos lista) {
		this.numero = numero;
		this.naturezaOp = naturezaOp;
		this.dtEmiss�o = dtEmiss�o;
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

	public String getDtEmiss�o() {
		return dtEmiss�o;
	}

	public void setDtEmiss�o(String dtEmiss�o) {
		this.dtEmiss�o = dtEmiss�o;
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
				", Data Emiss�o: " + dtEmiss�o + 
				", Cliente: "+ cliente.toString() + 
				", lista: " + lista.toString() + '}';
	}
	

}
