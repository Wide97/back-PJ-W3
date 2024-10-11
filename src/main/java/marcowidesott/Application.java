package marcowidesott;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import marcowidesott.elementsDAO.ElementoBibliotecarioDAO;
import marcowidesott.entities.Libro;
import marcowidesott.entities.Periodicita;
import marcowidesott.entities.Rivista;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("backpjw3");
        EntityManager em = emf.createEntityManager();

        ElementoBibliotecarioDAO dao = new ElementoBibliotecarioDAO(em);

        Libro libro = new Libro("1234567890", "Il Signore degli Anelli", 1954, 1000, "J.R.R. Tolkien", "Fantasy");
        Rivista rivista = new Rivista("0987654321", "National Geographic", 2023, 120, Periodicita.MENSILE);

        dao.save(libro);
        dao.save(rivista);

        dao.findAll().forEach(elemento -> {
            System.out.println("Titolo: " + elemento.getTitolo());
        });

        em.close();
        emf.close();
    }
}