package co.com.sahitest.certificacion.models;

public class CantidadLibros {
    String coreJava;
    String rubyForRail;
    String pythonCookbook;

    public String getCoreJava() {
        return coreJava;
    }

    public String getRubyForRail() {
        return rubyForRail;
    }

    public String getPythonCookbook() {
        return pythonCookbook;
    }

    public CantidadLibros(String coreJava, String rubyForRail, String pythonCookbook) {
        this.coreJava = coreJava;
        this.rubyForRail = rubyForRail;
        this.pythonCookbook = pythonCookbook;
    }
}
