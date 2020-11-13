
/* @author Diego Lins
 * @version 13/11/2020
 */
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		PilhaNF pilha = new PilhaNF(10);
		ListaDeProdutos l = new ListaDeProdutos(3);
		Produto p2 = new Produto(124, "Creme", "421", 5.99);
		String menu = "Menu de Opções criando Nota fiscal\n1 - Adicionar produtos\n" + "2 - Remover ultimo produto adicionado\n3 - Adicionar nota fiscal\n4- Remove ultima nota fiscal\n5- ver produtos\n6- ver notas fiscais\n" + "99 - Sair";
		int op = 0, cod;
		double valor;
		String mensagem, nomeP, lote, nomeC;
		while (op != 99) {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cod = Integer.parseInt(JOptionPane.showInputDialog("Codigo produto?"));
				nomeP = JOptionPane.showInputDialog("Nome Produto ?");
				lote = JOptionPane.showInputDialog("Numero lote ?");
				valor = Double.parseDouble(JOptionPane.showInputDialog("Valor Produto? "));
				Produto p1 = new Produto(cod, nomeP, lote, valor);
				mensagem = p1.toString();
				l.adicionaFinal(p1);
				JOptionPane.showMessageDialog(null, mensagem);
				break;
			case 2:
				mensagem = l.toString();
				l.removeFinal();
				JOptionPane.showMessageDialog(null, mensagem);
				break;
			case 3:
				nomeC = JOptionPane.showInputDialog("Nome Cliente?");
				String cpf = JOptionPane.showInputDialog("CPf ou CNPJ cliente ?");
				String endereco = JOptionPane.showInputDialog("digite seu endereço ?");
				Cliente c = new Cliente(nomeC,cpf,endereco);
				mensagem = c.toString();
				JOptionPane.showMessageDialog(null, mensagem);
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero NF?"));
				int nature = Integer.parseInt(JOptionPane.showInputDialog("Codigo da Natureza de Operação ?"));
				String dtEmissao = JOptionPane.showInputDialog("Digita a data da emissao ?");
				NotaFiscal nf = new NotaFiscal(numero, nature, dtEmissao,c , l);
				String mensagem1 = nf.toString();
				JOptionPane.showMessageDialog(null, mensagem1);
				pilha.empilha(nf);
				String mensagem2 = pilha.toString();
				JOptionPane.showMessageDialog(null, mensagem2);
				break;
			case 4:
				mensagem = pilha.toString();
				pilha.desempilha();
				JOptionPane.showMessageDialog(null, mensagem);
				break;
			case 5:
				mensagem = l.toString();
				JOptionPane.showMessageDialog(null, mensagem);
				break;
			case 6:
				mensagem = pilha.toString();
				JOptionPane.showMessageDialog(null, mensagem);
				break;
			}
	
		}
	}
}
