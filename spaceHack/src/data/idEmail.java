package data;

public class idEmail {
    private String email;

    public idEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "idEmail{" +
                "email='" + email + '\'' +
                '}';
    }
}
