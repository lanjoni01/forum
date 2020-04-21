package segunda.aep;

public class AppPatineteEletrico {
	
	public static void main(String[] args0) {
		PatineteEletrico Patinete1 = new PatineteEletrico("X-FORCE", 22222, 12);

		Patinete1.verificarSituacaoDoPatinete();

		PatineteEletrico Patinete2 = new PatineteEletrico("GTX2001", 22544, 19);
		
		Patinete2.bloquearPatinete();
		Patinete2.verificarSituacaoDoPatinete();


	}
}