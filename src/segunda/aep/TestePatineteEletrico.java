package segunda.aep;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TestePatineteEletrico {
	
	@Test
	void TestarDesbloqueado() {
		PatineteEletrico patinete1 = new PatineteEletrico("X-FORCE", 22222, 12);

		assertFalse(patinete1.getDesbloqueado());
	}

	@Test
	void TestarPatineteEletrico() {
		PatineteEletrico patinete2 = new PatineteEletrico("GTX2001", 22544, 19);

    patinete2.desbloquearPatinete();
		assertTrue(patinete2.getDesbloqueado());
	}
	
	@Test
	void verificaDisponibilidadeDoPatinete() {
		PatineteEletrico patinete1 = new PatineteEletrico("RX-5700", 154, 12);
		try {
			patinete1.bloquearPatinete();			
		} catch (Exception e) {
			assertEquals(e.getClass(), Exception.class);
		}
		
		
	}



}