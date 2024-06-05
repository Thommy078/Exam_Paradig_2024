package poo_exam;

import java.util.Date;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dateInscription = new Date();
        Etudiant etudiant = new Etudiant("Duval", "Thommy",79797, dateInscription, "BACHELOR");

        etudiant.montrerDetails();
        
	}
}


