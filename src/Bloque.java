
public class Bloque extends EtatCoffre {

	private static EtatCoffre instance;
	
	public synchronized static EtatCoffre getInstance() {
		if (instance == null) {
			instance = new Bloque();
		}
		return instance;
	}
}
