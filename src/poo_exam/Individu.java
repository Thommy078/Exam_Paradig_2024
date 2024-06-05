package poo_exam;

public abstract class Individu {
	private String nom;
    private String prenom;
    private int identifiant;
	
public Individu(String nom, String prenom, int identifiant) {
	this.nom = nom;
    this.prenom = prenom;
    this.identifiant = identifiant;
		// TODO Auto-generated constructor stub
	}
public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
public abstract void montrerDetails();  
    
}
