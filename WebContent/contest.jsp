<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>레시피 볼래?</title>

</head>
<body>

	<!--HTML 코드 작성 시작-->

	<jsp:include page="top_menu.jsp" />

	<div style="width: 90%; overflow: hidden; margin: 0 auto">
		<div style="width: 30%; float: left">
			<jsp:include page="login.jsp" />
		</div>

		<div style="width: 60%; float: left">


			<form id='selPic' name='selPic' action='contest.jsp' method="post">
				<h1>레시피 경쟁</h1>
				<h2>
					<center>오늘의 경쟁 메뉴 :
				</h2>
			</form>

			<table style="width: 100%" border="2">
				<tr>
					<th><h3>
							<center>김치볶음밥(OOO)
						</h3></th>
					<th><h3>
							<center>김치볶음밥(OOO)
						</h3></th>
				</tr>
				<tr>
					<form method="post" action="./count1.do" name = "pic1">
						<td><img
							src='http://shopping.phinf.naver.net/20160708_24/08aa487f-1c5d-4fad-94fa-1547c19b6017.jpg'
							style="width: 100%">
							<center>
								<input type="submit" value="투표하기"></td>
					</form>
					<!-- <form action='./count2.do' method="post" name = "pic2"> -->
					<form action='./count1.do' method="post" name = "pic2">
						<td><img
							src='http://shopping.phinf.naver.net/20160708_24/08aa487f-1c5d-4fad-94fa-1547c19b6017.jpg'
							style="width: 100%">
							<center>
								<input type="submit" value="투표하기"></td>
					</form>
				</tr>
			</table>
			
			<form action="./result.do" method = "post">
				<h3>
					<center>
						<input type="submit" value="결과보기" name = "vote">
				</h3>
			</form>
		</div>
	</div>


</body>
</html>