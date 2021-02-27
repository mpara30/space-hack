package data;

public class idCnp {
    private String cnp;

    public idCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "idCnp{" +
                "cnp='" + cnp + '\'' +
                '}';
    }
}
