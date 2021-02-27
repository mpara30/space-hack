package app;

/* @author Iulian */
public class Persoana {
    private String nume;
    private String prenume;
    private int CNP;
    private int telefon;
    private String EMail;
    
    public Persoana(String nume, String prenume, int CNP, int telefon, String EMail){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.telefon = telefon;
        this.EMail = EMail;
    }
    
    public String getNume(){
        return nume;
    }
    public String getPrenume(){
        return prenume;
    }
    
    
}
