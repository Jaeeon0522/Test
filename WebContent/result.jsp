<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge">


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>레시피 볼래?</title>

</head>
<body>

	<!--HTML 코드 작성 시작-->

	<jsp:include page="top_menu.jsp" />

	<c:if test="${errorMessage1 != null}">
		<h5>${errorMessage1}</h5>
	</c:if>
		<div>

			<table style="width: 60%" border="2">
				<tr>
					<td>
						<center>김치볶음밥(OOO)
					</td>
					<th>
						<c:if test="${sessionScope.user != null}">
							<center>${sessionScope.vote.candidate}
						</c:if>
					</th>
				</tr>
				<tr>
					<td>
						<center>김치볶음밥(OOO)
					</td>
					<td>
						<c:if test="${sessionScope.user != null}">
							<center>${sessionScope.vote.candidate}
						</c:if>
					</th>
					</td>
				</tr>
			</table>

		</div>

</body>
</html>