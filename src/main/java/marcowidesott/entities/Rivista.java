package marcowidesott.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("RIVISTA")
public class Rivista extends ElementoBibliotecario {
    private Periodicita periodicita;

    public Rivista() {
    }

    public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    // Getters and Setters

    public Periodicita getPeriodicita() {
        return periodicita;
    }
}
