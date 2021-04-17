package co.com.sahitest.certificacion.models;

public class Login {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
