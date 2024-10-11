package marcowidesott.elementsDAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import marcowidesott.entities.ElementoBibliotecario;

import java.util.List;

public class ElementoBibliotecarioDAO {
    private EntityManager em;

    public ElementoBibliotecarioDAO(EntityManager em) {
        this.em = em;
    }

    public void save(ElementoBibliotecario elemento) {
        em.getTransaction().begin();
        em.persist(elemento);
        em.getTransaction().commit();
    }

    public List<ElementoBibliotecario> findAll() {
        TypedQuery<ElementoBibliotecario> query = em.createQuery("SELECT e FROM ElementoBibliotecario e", ElementoBibliotecario.class);
        return query.getResultList();
    }
}
