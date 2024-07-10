<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Article Details</title>
</head>
<body>
	<h2>Article Details</h2>
	<div>
		<label>ID:</label> <span>${article.id}</span>
	</div>
	<div>
		<label>Title:</label> <span>${article.title}</span>
	</div>
	<div>
		<label>Category:</label> <span>${article.category}</span>
	</div>
	<div>
		<label>Last Modified:</label>
		<span>${article.lastModified}</span>		
	</div>
	<a href="${pageContext.request.contextPath}/articles/article-list">Back to
		Articles List</a>
</body>
</html>
