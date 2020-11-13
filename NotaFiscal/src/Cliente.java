/* @author Diego Lins
 * @version 13/11/2020
 */
public class Cliente {

	private String id;
	private String endereco;
	private String nome;
	
	
	public Cliente(String nome, String id, String endereco) {
	
		this.nome = nome;             // CONSTRUTOR CLASSE ALUNO//
		this.id = id;
		this.endereco = endereco;
	}

									// GETTERS AND SETTERS DA CLASSE CLIENTE//
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "CPF ou CNPJ: " + id  + ", nome: " + nome + ", Endereco: " + endereco ;
	}
	
	

}
