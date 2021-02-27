package data;

public class idPrenume {
    private String prenume;

    public idPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "idPrenume{" +
                "prenume='" + prenume + '\'' +
                '}';
    }
}
