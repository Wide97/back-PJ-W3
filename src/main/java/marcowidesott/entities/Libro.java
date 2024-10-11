package marcowidesott.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("LIBRO")
public class Libro extends ElementoBibliotecario {
    private String autore;
    private String genere;

    public Libro() {
    }

    public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    // Getters and Setters

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }
}