
public class PilhaNF {

	private NotaFiscal dados[];
	private int topo;
	
	public PilhaNF(int capMax){
		dados = new NotaFiscal[capMax];
        topo = -1;
    }
    /**
     * Metodo que adiciona novo NF no topo da pilha
     * @param  nova NF
     */
    public void empilha(NotaFiscal e){
        if (cheia()){
            System.out.println("ERRO! Pilha Cheia");
        } else {
            dados[++topo]=e;
            //dados[topo=topo+1]=e
            //dados[topo++]= e; provoca erro quando a pilha 
            //está vazia
        }
    }
    /**
     * Metodo que desempilha um elemento
     * @return Nf removido da pilha
     */
    public NotaFiscal desempilha(){
        NotaFiscal r = null;
        if(vazia()){
            System.out.println("ERRO! Pilha Vazia");
        }else {
            r = dados[topo];
            topo--;
        }
        return r;
    }
    /**
     * Metodo que retorna todos as notasfiscais da Pilha
     * @return String com todos as notasfiscais da Pilha
     */
    public boolean cheia() {
    	return topo == dados.length-1;
    }
    public boolean vazia() {
    	return topo == -1;
    }
    public String toString(){
        String s="";
        for (int i=topo;i>=0;i--)
            s = s + " \t " + dados[i].toString();
        s = s + "\nTotal de produtos: "+(topo+1);
        return s;
    }
}

