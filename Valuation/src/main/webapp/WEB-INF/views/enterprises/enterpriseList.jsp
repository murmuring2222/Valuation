<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>기업 목록</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
	
	<ul class="list-group">
		<c:forEach items="${elist}" var="elist">
			<li class="list-group-item list-group-item-info">
				기업 코드 : <c:out value="${elist.enterpriseCode}" /> <br>
				기업명 : <c:out value="${elist.enterpriseName}" /> <br>
				주가 : <c:out value="${elist.stockPrice}" /> <br>
			</li>
		</c:forEach>
	</ul>

</body>
</html>