package yolocorp.fowlercastle.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import yolocorp.fowlercastle.model.Coffre;
import yolocorp.fowlercastle.model.FacadeCoffre;
import yolocorp.fowlercastle.model.I_Coffre;



public class CoffreTest {
	
	private I_Coffre coffre;
	private I_Coffre facadeCoffre;

	@Before
	public void setUp() throws Exception {
		coffre = new Coffre();
		facadeCoffre = new FacadeCoffre();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAuDemarrage() {
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliotheque() {
		coffre.oterLivre();
		assertEquals("Ferme",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirRemisLeLivreDansLaBibliothequeSansAvoirTouchePrealablementALaChandelle() {
		coffre.oterLivre();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroiteUneFois() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		assertEquals("PresqueOuvert", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroiteUneFoisEtRemisLeLivre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroiteDeuxFois() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		assertEquals("Ouvert", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirOteLeLivreEtTourneLaChandelleVersLaGauche() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		assertEquals("Bloque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirOteLeLivreEtTourneLaChandelleVersLaGauchePuisRemisLeLivre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		coffre.remettreLivre();
		assertEquals("Bloque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroitePuisVersLaGauche() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersGauche();
		assertEquals("Bloque", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroiteDeuxFoisPuisFermerCoffre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		assertEquals("Ferme", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroiteDeuxFoisPuisFermerCoffreEtRemisLivre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirTourneLaChandelleVersLaDroite() {
		coffre.tournerChandelleVersDroite();
		assertEquals("CacheParBibliotheque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirTourneLaChandelleVersLaGauche() {
		coffre.tournerChandelleVersGauche();
		assertEquals("CacheParBibliotheque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test 
	public void testReouvertureDuCoffreApresUneOuverture() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		
		assertEquals("Ferme", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
		
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		
		assertEquals("Ouvert", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testOterLivreDeuxFois() {
		coffre.oterLivre();
		coffre.oterLivre();
		assertEquals("Ferme", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testFermerCoffreUneFois() {
		coffre.fermerCoffre();
		assertEquals("CacheParBibliotheque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	/*Facade Test*/
	
	@Test
	public void testFacadeApresAvoirOteLeLivreDeLaBibliotheque() {
		facadeCoffre.oterLivre();
		assertEquals("Ferme",facadeCoffre.nomEtat());
		assertFalse(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeApresAvoirRemisLeLivreDansLaBibliothequeSansAvoirTouchePrealablementALaChandelle() {
		facadeCoffre.oterLivre();
		facadeCoffre.remettreLivre();
		assertEquals("CacheParBibliotheque",facadeCoffre.nomEtat());
		assertFalse(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroiteUneFois() {
		facadeCoffre.oterLivre();
		facadeCoffre.tournerChandelleVersDroite();
		assertEquals("PresqueOuvert", facadeCoffre.nomEtat());
		assertTrue(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}

	@Test
	public void testFacadeApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroiteUneFoisEtRemisLeLivre() {
		facadeCoffre.oterLivre();
		facadeCoffre.tournerChandelleVersDroite();
		facadeCoffre.remettreLivre();
		assertEquals("CacheParBibliotheque",facadeCoffre.nomEtat());
		assertFalse(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroiteDeuxFois() {
		facadeCoffre.oterLivre();
		facadeCoffre.tournerChandelleVersDroite();
		facadeCoffre.tournerChandelleVersDroite();
		assertEquals("Ouvert", facadeCoffre.nomEtat());
		assertTrue(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeApresAvoirOteLeLivreEtTourneLaChandelleVersLaGauche() {
		facadeCoffre.oterLivre();
		facadeCoffre.tournerChandelleVersGauche();
		assertEquals("Bloque", facadeCoffre.nomEtat());
		assertFalse(facadeCoffre.chienEstLibere());
		assertTrue(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeApresAvoirOteLeLivreEtTourneLaChandelleVersLaGauchePuisRemisLeLivre() {
		facadeCoffre.oterLivre();
		facadeCoffre.tournerChandelleVersGauche();
		facadeCoffre.remettreLivre();
		assertEquals("Bloque", facadeCoffre.nomEtat());
		assertFalse(facadeCoffre.chienEstLibere());
		assertTrue(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroitePuisVersLaGauche() {
		facadeCoffre.oterLivre();
		facadeCoffre.tournerChandelleVersDroite();
		facadeCoffre.tournerChandelleVersGauche();
		assertEquals("Bloque", facadeCoffre.nomEtat());
		assertTrue(facadeCoffre.chienEstLibere());
		assertTrue(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroiteDeuxFoisPuisFermerCoffre() {
		facadeCoffre.oterLivre();
		facadeCoffre.tournerChandelleVersDroite();
		facadeCoffre.tournerChandelleVersDroite();
		facadeCoffre.fermerCoffre();
		assertEquals("Ferme", facadeCoffre.nomEtat());
		assertTrue(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeApresAvoirOteLeLivreEtTourneLaChandelleVersLaDroiteDeuxFoisPuisFermerCoffreEtRemisLivre() {
		facadeCoffre.oterLivre();
		facadeCoffre.tournerChandelleVersDroite();
		facadeCoffre.tournerChandelleVersDroite();
		facadeCoffre.fermerCoffre();
		facadeCoffre.remettreLivre();
		assertEquals("CacheParBibliotheque", facadeCoffre.nomEtat());
		assertFalse(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeApresAvoirTourneLaChandelleVersLaDroite() {
		facadeCoffre.tournerChandelleVersDroite();
		assertEquals("CacheParBibliotheque", facadeCoffre.nomEtat());
		assertFalse(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeApresAvoirTourneLaChandelleVersLaGauche() {
		facadeCoffre.tournerChandelleVersGauche();
		assertEquals("CacheParBibliotheque", facadeCoffre.nomEtat());
		assertFalse(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	
	@Test 
	public void testFacadeReouvertureDuCoffreApresUneOuverture() {
		facadeCoffre.oterLivre();
		facadeCoffre.tournerChandelleVersDroite();
		facadeCoffre.tournerChandelleVersDroite();
		facadeCoffre.fermerCoffre();
		
		assertEquals("Ferme", facadeCoffre.nomEtat());
		assertTrue(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
		
		facadeCoffre.tournerChandelleVersDroite();
		facadeCoffre.tournerChandelleVersDroite();
		
		assertEquals("Ouvert", facadeCoffre.nomEtat());
		assertTrue(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeOterLivreDeuxFois() {
		facadeCoffre.oterLivre();
		facadeCoffre.oterLivre();
		assertEquals("Ferme", facadeCoffre.nomEtat());
		assertFalse(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	
	@Test
	public void testFacadeFermerCoffreUneFois() {
		facadeCoffre.fermerCoffre();
		assertEquals("CacheParBibliotheque", facadeCoffre.nomEtat());
		assertFalse(facadeCoffre.chienEstLibere());
		assertFalse(facadeCoffre.lapinEstLibere());
	}
	

}
