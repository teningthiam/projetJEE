package sn.edu.isepdiamniadio.tic.dbe.jee.bibliothequeap;

import jakarta.ejb.Remote;

import java.util.List;
@Remote
public interface LivreService {
    List<Livre> ajouterLivre(Livre livre);
    void supprimerLivre(int id);
    List<Livre> obtenirTousLesLivres();
}
