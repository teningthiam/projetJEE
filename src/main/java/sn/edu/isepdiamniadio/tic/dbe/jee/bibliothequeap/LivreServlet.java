package sn.edu.isepdiamniadio.tic.dbe.jee.bibliothequeap;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/livres")
public class LivreServlet extends HttpServlet {
    @EJB
    private LivreService livreService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Livre> livres = livreService.obtenirTousLesLivres();
        request.setAttribute("livres", livres);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titre = request.getParameter("titre");
        String auteur = request.getParameter("auteur");
        Livre livre = new Livre();
        livre.setTitre(titre);
        livre.setAuteur(auteur);
        livreService.ajouterLivre(livre);
        response.sendRedirect("afficheLivre.jsp");
    }
}
