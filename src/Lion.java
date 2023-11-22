import java.util.Random;

public class Lion extends Animal {

	public Lion(String a, Sexe b) throws NomException {
		super(a, b);
	}

	public String manger() {
		return "Je mange de la viande " + toString();
	}

	public void rencontrer(Animal ani, Savane savane) throws NomException {
		Random r = new Random();
		if (ani instanceof Lion) {
			if (this.sexe != ani.sexe) {
				int w = r.nextInt(2);
				if (w == 0) {
					Lion l = new Lion((this.nom + ani.nom), Sexe.MALE);
					savane.ajouter(l);
					System.out.println("Un nouveau lion naît " + l.toString());
				} else {
					Lion l2 = new Lion((this.nom + ani.nom), Sexe.FEMELLE);
					savane.ajouter(l2);
					System.out.println("Un nouveau lion naît " + l2.toString());
				}
			} else {
				if (r.nextInt(11) <= 3) {
					int a = r.nextInt(2);
					if (a == 1) {
						savane.supprimer(ani);
						System.out.println("Un lion meurt " + ani.toString());
					} else {
						savane.supprimer(this);
						System.out.println("Un lion meurt " + this.toString());
					}
				} else {
					savane.supprimer(ani);
					savane.supprimer(this);
					System.out.println("Les deux lions meurent " + ani.toString() + this.toString());
				}
			}
		} else {
			ani.manger();
			savane.supprimer(ani);
			System.out.println(ani.toString() + " mange " + this.toString());
		}

	}
}
