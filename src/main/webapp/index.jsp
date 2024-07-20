
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un livre</title>
</head>
<body>
<h2>Ajouter un nouveau livre</h2>
<form action="livres" method="post">
    <label for="titre">Titre:</label>
    <input type="text" id="titre" name="titre" required><br><br>
    <label for="auteur">Auteur:</label>
    <input type="text" id="auteur" name="auteur" required><br><br>
    <label for="anneePublication">Année de Publication:</label>
    <input type="number" id="anneePublication" name="anneePublication" required><br><br>
    <button type="submit">Ajouter</button>
</form>
<a href="ajouterLivre.jsp">liste des livres</a>
</body>
</html>
