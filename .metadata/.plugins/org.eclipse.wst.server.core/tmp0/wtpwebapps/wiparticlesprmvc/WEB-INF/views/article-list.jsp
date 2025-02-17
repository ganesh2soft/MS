<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Articles</title>
</head>
<body>
<h2>Articles List</h2>
<a href="new">Add New Article</a>
<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Category</th>
            <th>Last Modified</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="article" items="${article}">
            <tr>
                <td>${article.id}</td>
                <td>${article.title}</td>
                <td>${article.category}</td>
                <td>${article.lastModified}</td>
                <td>
                    <a href="${article.id}">View</a> |
                    <a href="edit/${article.id}">Edit</a> |
                    <a href="delete/${article.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
