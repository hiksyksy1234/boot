<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>View Test Page2</title>
</head>
<body>
<h2>Hello! ${name}</h2>
<div>JSP List Test</div>
<c:forEach var="item" items="${list}" varStatus="idx">
${idx.index}, ${item} <br />
</c:forEach>
</body>
</html>