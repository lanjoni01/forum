package segunda.aep;

public class PatineteEletrico {
	private String nomePatinete;
	private boolean desbloqueado;
	private int codigo;
	private double preco;

	public PatineteEletrico(String nomePatinete, int codigo, double preco) {
		this.nomePatinete = nomePatinete;
		this.codigo = codigo;
		this.desbloqueado = false;
		this.preco = preco;
	}

	public boolean getDesbloqueado() {
		return this.desbloqueado;
	}	
	
    private void avisar(){
    	System.out.println("nome do seu Patinete:" +this.nomePatinete);
    	System.out.println("o código do patinete é:" + this.codigo);
    	System.out.println("Para desbloquear é:" + this.preco);
    }
    
	public void verificarSituacaoDoPatinete() {
		if (!this.getDesbloqueado()) {
			throw new RuntimeException("Esse Patinete não esta disponivel!.");
		}
	}
 
	public boolean pesquisaPatineteEletrico() {
		try {
			this.verificarSituacaoDoPatinete();
			this.avisar();
			System.out.println("Patinete eletrico Desbloqueado");
		
			return true;
		} catch (Exception erro) {
			this.avisar();
			System.out.println("Mensagem de exceção: " + erro.getMessage());
			return false;
		}
	}

	public void desbloquearPatinete() {
		this.desbloqueado = true;
	}
	
	public void bloquearPatinete() {
		this.desbloqueado = false;
	}

}
