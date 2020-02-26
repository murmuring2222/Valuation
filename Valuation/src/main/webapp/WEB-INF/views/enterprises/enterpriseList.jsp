<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>기업 목록</title>
</head>
<body>

	<h1>기업 목록 페이지입니다!</h1>
	
	<c:forEach items="${elist}" var="elist">
		<c:out value="${elist.enterprise_code}" /> <br>
		<c:out value="${elist.enterprise_name}" /> <br>
		<c:out value="${elist.stock_price}" /> <br>
	</c:forEach>

</body>
</html>