package data;

public class idNume {
    private String nume;

    public idNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "idNume{" +
                "nume='" + nume + '\'' +
                '}';
    }
}

