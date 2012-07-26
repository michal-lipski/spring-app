<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<div id="ingredient">
    <h2>Ingredient list</h2>

    <c:forEach var="ingredient" items="${ingredientList}">
        <div>
            name: ${ingredient.name}
        </div>
    </c:forEach>
</div>