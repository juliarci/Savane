import java.util.Random;

public class Zebre extends Animal {

	public Zebre(String a, Sexe b) throws NomException {
		super(a, b);
	}

	public String manger() {
		return "Je mange de l'herbe " + toString();
	}

	public void rencontrer(Animal ani, Savane savane) throws NomException {
		Random r = new Random();
		if (ani instanceof Zebre) {
			if (this.sexe != ani.sexe) {
				int w = r.nextInt(2);
				if (w == 0) {
					Zebre z = new Zebre((this.nom + ani.nom), Sexe.MALE);
					savane.ajouter(z);
					System.out.println("Un nouveau zèbre naît " + z.toString());
				} else {
					Zebre z2 = new Zebre((this.nom + ani.nom), Sexe.FEMELLE);
					savane.ajouter(z2);
					System.out.println("Un nouveau zèbre naît " + z2.toString());
				}
			}
		} else {
			ani.manger();
			savane.supprimer(this);
			System.out.println(ani.toString() + " mange " + this.toString());
		}

	}
}
