<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>기업 등록 페이지</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>

	<form action="insertEnterpriseResult" method="post">
		<label for="enterprise_code">기업 코드</label>
		<input type="number" id="enterprise_code" name="enterprise_code"> <br>
		<label for="enterprise_name">기업명</label>
		<input type="text" id="enterprise_name" name="enterprise_name"> <br>
		<label for="industry_name">업종</label>
 		<select id="industry_name" name="industry_name">
			<c:forEach items="${iclist}" var="iclist">
				<option>
					<c:if test="${iclist.industryCode == 1}">서비스업</c:if>
					<c:if test="${iclist.industryCode == 2}">전기, 전자</c:if>
					<c:if test="${iclist.industryCode == 3}">IT S/W & SVC</c:if>
				</option>
			</c:forEach>
		</select> <br>		
		<input type="submit" value="등록">
	</form>

</body>
</html>