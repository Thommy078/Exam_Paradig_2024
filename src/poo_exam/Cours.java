package poo_exam;

public class Cours implements Participable{
	private String titre;
	private String formateur;
	private int duree;
	private int placesRestantes;
	
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getFormateur() {
		return formateur;
	}
	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public int getPlacesRestantes() {
		return placesRestantes;
	}
	public void setPlacesRestantes(int placesRestantes) {
		this.placesRestantes = placesRestantes;
	}
	public void montrerDetails() {
		 System.out.println("Titre: " + titre);
	        System.out.println("Formateur: " + formateur);
	        System.out.println("Durée: " + duree + " heures");
	        System.out.println("Places restantes: " + placesRestantes);
	}
	public void participer() {
        if (placesRestantes > 0) {
            placesRestantes--;
            System.out.println("Un étudiant a participé au cours. Places restantes: " + placesRestantes);
        } else {
            System.out.println("Pas de places disponibles pour ce cours.");
        }
    }

    @Override
    public void quitter() {
        placesRestantes++;
        System.out.println("Un étudiant n'a pas participé au cours. Places restantes: ");
}
    }
