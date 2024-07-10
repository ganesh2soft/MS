<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Article Form</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Bootstrap Datepicker CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">
</head>
<body>
    <div class="container">
        <h2>${article.id == null ? 'Add New Article' : 'Update Article'}</h2>
        <form action="${article.id == null ? 'save' : 'update'}" method="post">
            <input type="hidden" name="id" value="${article.id}" />
            <div class="form-group">
                <label for="title">Title:</label>
                <input type="text" class="form-control" id="title" name="title" value="${article.title}" required />
            </div>
            <div class="form-group">
                <label for="category">Category:</label>
                <input type="text" class="form-control" id="category" name="category" value="${article.category}" required />
            </div>
            <div class="form-group">
                <label for="lastModified">Last Modified:</label>
                <fmt:formatDate pattern = "yyyy-MM-dd" value = "${article.lastModified ? article.lastModified : ''}" />
                <input type="date" class="form-control" id="lastModified" name="lastModified" required />
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">${article.id == null ? 'Save' : 'Update'}</button>
            </div>
        </form>
    </div>
</body>
</html>
