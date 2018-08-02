<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!--this category needs to be filled with the help of category List  coming from categoryDAOImpl 
 for that we add c for each element  -->
 
<p class="lead">Shop Name</p>

<div class="list-group">

  <c:forEach items="${categories}" var="category">
	
		<a href="#" class="list-group-item">${category.name}</a>
		
</c:forEach>

</div>