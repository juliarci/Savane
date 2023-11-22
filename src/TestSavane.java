import java.util.Scanner;

/**
 *
 * @author nicolas
 */
public class TestSavane {

	/**
	 *
	 * @param args @
	 * @throws NomException
	 */
	public static void main(String args[]) throws NomException {
		Savane savane = new Savane();

		for (int i = 0; i < 50; i++) {
			if (i < 5) {
				savane.ajouter(new Zebre("Verdure" + i, Sexe.MALE));
				savane.ajouter(new Lion("Fauve" + i, Sexe.MALE));
			} else {
				savane.ajouter(new Zebre("Verdure" + i, Sexe.FEMELLE));
				savane.ajouter(new Lion("Fauve" + i, Sexe.FEMELLE));
			}
		}
		savane.mangerDansLaSavane();

		savane.dormirDansLaSavane();

		// 100 rencontres dans la savane
		int ret, i = 0;

		do {
			ret = savane.rencontrer();
			System.out.println(" ");
			i++;
		} while (i <= 50 && ret == -1);

		// on affiche les survivants
		savane.afficheSurvivants();
	}
}
