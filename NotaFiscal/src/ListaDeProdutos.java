/* @author Diego Lins
 * @version 13/11/2020
 */
public class ListaDeProdutos {

	private Produto	 dados[];
	private int tamanho;
	public ListaDeProdutos(int capMax) {
		dados = new Produto[capMax];
	}
	public void adicionaInicio(Produto e){
	       if (dados.length != tamanho) {
	           for (int i = tamanho; i>=1; i--){
	               dados[i] = dados[i-1];
	           }
	           dados[0]=e;
	           tamanho++;
	       }else{
	           System.out.println("ERRO! Lista Cheia");
	       }
	   }
	
	public boolean cheia() {
		return tamanho==dados.length;
	}
	
	public void adiciona(Produto e, int	 p){
	       if (p>=1 && p<=tamanho+1){
	           if (cheia()){
	               System.out.println("ERRO! Lista Cheia.");
	           }else{
	               for (int i = tamanho; i>=p; i--){
	                    dados[i] = dados[i-1];
	                }
	               dados[p-1]=e;
	               tamanho++;
	           }
	       }else {
	           System.out.println("Posi��o Invalida!");
	       }
	   }
	   
	   public Produto removeInicio(){
	       Produto r= null;
	       if (tamanho==0) {
	           r=dados[0];
	           for (int i = 0; i<tamanho-1; i--){
	               dados[i] = dados[i+1];
	           }
	           tamanho--;
	       }else{
	           System.out.println("ERRO! Lista Cheia");
	       }
	       return r;
	   }
	    
	    public Produto remove(int p){
	       Produto r=null;
	       if (p>=1 && p<=tamanho){
	            if (tamanho!=0) {
	                r=dados[p-1];
	                for (int i = p-1; i<tamanho-1; i++){
	                    dados[i] = dados[i+1];
	                }
	                tamanho--;
	            }else{
	                System.out.println("ERRO! Lista Vazia");
	            }
	       }else{
	           System.out.println("Posi��o Invalida!");
	       }
	        return r;
	    }
	    
	   public void adicionaFinal (Produto e){
	        if (dados.length != tamanho) {
	            // não está cheia
	            dados[tamanho] = e;
	            tamanho = tamanho + 1;
	        } else {
	            //sim está cheia
	            System.out.println("ERRO! Lista Cheia");
	        }
	    }
	    
	   public Produto removeFinal (){
	        Produto r = null;
	        if (tamanho != 0) {
	            // não está vazia
	            r = dados[tamanho-1] ;
	            tamanho = tamanho - 1;
	        } else {
	            //sim está vazia
	            System.out.println("ERRO! Lista Vazia");
	        }
	        return r;
	    }
	        
	    public String toString(){
	        String r = "";
	        for (int i=0;i<tamanho;i++){
	            r = r + dados[i].toString() + " \n";
	        }

	        return r;
	    }
	}

