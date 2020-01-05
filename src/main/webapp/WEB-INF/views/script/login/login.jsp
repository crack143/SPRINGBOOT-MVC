
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<script type="text/javascript" src="${path}/entites/login/login.js"></script>
<jsp:include page="../../header/decorator.jsp"></jsp:include>
<jsp:include page="../../header/decorator.jsp"></jsp:include>
<%@ page isELIgnored="false"%>

<form action="login" method="POST">
	<div class="row" style="margin-top: 14%">
		<div class="col-sm-4 col-sm-offset-4">
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					name="email" aria-describedby="emailHelp" placeholder="Enter email">
				<small id="emailHelp" class="form-text text-muted">We'll
					never share your email with anyone else.</small>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					name="password" placeholder="Password">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</div>
</form> 