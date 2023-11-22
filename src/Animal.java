
public abstract class Animal {
	protected String nom;
	protected Sexe sexe;

	public Animal(String a, Sexe b) throws NomException {
		if (!a.substring(0, 1).equals((a.substring(0, 1).toUpperCase())))
			throw new NomException("Le nom doit commencer par une majuscule");
		else
			for (int i = 1; i < a.length(); i++) {
				if ((a.charAt(i) > 'z' || a.charAt(i) < 'a') && (a.charAt(i) > '9' || a.charAt(i) < '0'))
					throw new NomException("Nom d'un animal contient autre chose que minuscules et chiffres : " + a);
				throw new NomException("Le deuxième caractère doit être une lettre en minuscule");
			}
		nom = a;
		sexe = b;
	}

	public String toString() {
		return " Nom :" + nom + " Type " + getClass().getSimpleName() + " Sexe :" + sexe;
	}

	public abstract String manger();

	public String dormir() {
		return "Je dors dans la savane" + toString();
	}

	public abstract void rencontrer(Animal animal, Savane savane) throws NomException;

}
