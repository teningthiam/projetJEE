<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Liste des livres</title>
</head>
<body>
<h2>Liste des livres</h2>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Titre</th>
        <th>Auteur</th>
        <th>Année de Publication</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="livre" items="${livres}">
        <tr>
            <td>${livre.id}</td>
            <td>${livre.titre}</td>
            <td>${livre.auteur}</td>
            <td>${livre.anneePublication}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="afficheLivre.jsp">Ajouter un livre</a>
</body>
</html>