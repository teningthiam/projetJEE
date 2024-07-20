package sn.edu.isepdiamniadio.tic.dbe.jee.bibliothequeap;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class LivreServiceImpl implements LivreService {

    @PersistenceContext(unitName = "Bibliotheque")
    private EntityManager em;

    @Override
    public List<Livre> ajouterLivre(Livre livre) {
        em.persist(livre);
        return null;
    }

    @Override
    public void supprimerLivre(int id) {
        Livre livre = em.find(Livre.class, id);
        if (livre != null) {
            em.remove(livre);
        }
    }

    @Override
    public List<Livre> obtenirTousLesLivres() {
        return em.createQuery("SELECT l FROM Livre l", Livre.class).getResultList();
    }
}
