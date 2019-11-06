
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pais {
    private String gentilicio, moneda, idioma, capital;

    public Pais() {
    }

    public Pais(String gentilicio, String moneda, String idioma, String capital) {
        this.gentilicio = gentilicio;
        this.moneda = moneda;
        this.idioma = idioma;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Gentilicio: "+gentilicio + "<br>"+"Moneda: "+moneda+"<br>"+"Idioma: "+idioma+"<br>"+"Capital: "+capital;
    }
    

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getCapital() {
        return capital;
    }

    public String getGentilicio() {
        return gentilicio;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getMoneda() {
        return moneda;
    }
 
            
}
