package data;

import java.io.Serializable;

public class Contact implements Serializable {
    private String nume;
    private String prenume;
    private String telefon;
    private String email;
    private String cnp;

    public Contact(String nume, String prenume, String cnp, String telefon, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.email = email;
        this.cnp = cnp;
    }

    public static Contact getInstance(String nume, String prenume, String cnp, String telefon, String email){
        if(nume.isEmpty() || prenume.isEmpty() || telefon.isEmpty() || email.isEmpty() || cnp.isEmpty()){
            return null;
        }
        return new Contact(nume, prenume, cnp, telefon, email);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp='" + cnp + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
