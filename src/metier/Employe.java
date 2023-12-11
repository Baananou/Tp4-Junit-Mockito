package metier;

public class Employe {
    private int matricule;
    private String nom, prenom;
    private double salaire;
    private double tauxCommision;
    private int nbAnneeTravail;
    private Employe ChefDepartement;

    public Employe(int matricule, String nom, String prenom, double salaire, double tauxCommision, int nbAnneeTravail, Employe chefDepartement) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.tauxCommision = tauxCommision;
        this.nbAnneeTravail = nbAnneeTravail;
        this.ChefDepartement = chefDepartement;
    }
    public double getPrime() {
        if (nbAnneeTravail > 15) {
            return tauxCommision * salaire;
        } else {
            return ChefDepartement.getPrimeFixe();
        }
    }

    public double getPrimeFixe() {
        return 1000.0;
    }

    public int getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public double getTauxCommision() {
        return tauxCommision;
    }

    public int getNbAnneeTravail() {
        return nbAnneeTravail;
    }

    public Employe getChefDepartement() {
        return ChefDepartement;
    }
}




