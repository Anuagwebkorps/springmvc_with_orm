<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page isELIgnored="false" %>
<h4>Mark of Student</h4>

<c:forEach var="item" items="${marks}">
<h1>${item}</h1>
</c:forEach>