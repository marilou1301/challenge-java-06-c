package fr.wildcodeschool.java06;

public class Wilder {

	// attributs
    private String firstname;
    private boolean aware;

    // constructeur    
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }
    // accesseurs (getters)
    public String getFirstName() {
        return this.firstname;
    }
    
    public boolean getAware() {
        return this.aware;
    }
    // méthode instanciée
    public String whoAmI() {
        String etatAware = "je suis aware";
        if (!this.getAware()) { 
        	etatAware="je ne suis pas aware";
        }
    	return "Je m'appelle " + this.getFirstName() + " et " + etatAware + ".";
    }
}