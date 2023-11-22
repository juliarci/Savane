import java.util.ArrayList;
import java.util.Random;

public class Savane {

	private ArrayList<Animal> savane;

	public Savane() {
		savane = new ArrayList<Animal>();
	}

	public void ajouter(Animal ani) {
		savane.add(ani);

	}

	public void supprimer(Animal ani) {
		savane.remove(ani);

	}

	public String toString() {
		String Savane = " " + savane;
		return Savane;
	}

	public void mangerDansLaSavane() {
		for (Animal ani : savane) {
			ani.manger();
		}
	}

	public void dormirDansLaSavane() {
		for (Animal ani : savane) {
			ani.dormir();

		}

	}

	public int rencontrer() throws NomException {
		Random r = new Random();
		Random r2 = new Random();
		int s = r.nextInt(savane.size());
		int d = r2.nextInt(savane.size());
		int ret = savane.size();
		while (ret > 1) {
			if (s != d) {
				savane.get(d).rencontrer(savane.get(s), this);
				ret = savane.size();
			}
			s = r.nextInt(savane.size());
			d = r2.nextInt(savane.size());
		}
		return ret;
	}

	public void afficheSurvivants() {
		System.out.println("Les survivants sont : ");
		for (Animal a : savane) {
			System.out.println(a);
		}

	}
}
