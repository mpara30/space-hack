package data;

public class idTelefon {
    private String telefon;

    public idTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "idTelefon{" +
                "telefon='" + telefon + '\'' +
                '}';
    }
}
