<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!-- jQuery -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
		integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	
	<title>Blog Baord</title>
	
	<style>
	
		body {
			padding-top: 70px;
			padding-bottom: 30px;
		}
	
	</style>
	<script>

		$(document).on('click', '#btnWriteForm', function(e){
			e.preventDefault();
			location.href = "${pageContext.request.contextPath}/board/postForm";
		});

	</script>
</head>
<body>
	
	<article>
	<div class="container">
		<div class="table-responsive">
		<h2>Post List</h2>
			<table class="table table-hover">
				<colgroup>
					<col style="width:10%;" />
					<col style="width:auto;" />
					<col style="width:15%;" />
					<col style="width:10%;" />
					<col style="width:15%;" />
				</colgroup>
		
				<thead class="thead-dark">
					<tr align="center">
						<th>NO</th>
						<th>글제목</th>
						<th>작성자</th>
						<th>조회수</th>
						<th>작성일</th>
					</tr>
				</thead>
		
				<tbody>
					<c:choose>
						<c:when test="${empty postList}" >
							<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
						</c:when> 
						<c:when test="${!empty postList}">
							<c:forEach var="list" items="${postList}">
								<tr align="center">
									<td><c:out value="${list.pid}"/></td>
									<td align="left"><c:out value="${list.title}"/></td>
									<td><c:out value="${list.author}"/></td>
									<td><c:out value="${list.view_cnt}"/></td>
									<td><c:out value="${list.created}"/></td>
								</tr>
							</c:forEach>
						</c:when>
					</c:choose>
				</tbody>
			</table>
		</div>
		<div >
			<button type="button" class="btn btn-sm btn-dark" id="btnWriteForm">글쓰기</button>
		</div>
	</div>
	</article>
</body>
</html>