<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="../layout/app.jsp">
	<c:param name="content">
		<h2>タスク一覧</h2>
		<ul>
			<c:forEach var="task" items="${tasks}">
				<li>
					<a href="${pageContext.request.contextPath}/show?id=${task.id}">
						<c:out value="${task.id}" />
					</a><br>
					　&gt;登録日時：<c:out value="${task.input_date}"></c:out> <br>
					　&gt;更新日時：<c:out value="${task.update_date}"></c:out><br>
					　&gt;<c:out value="${task.content}" /></li>
			</c:forEach>
		</ul>

		<p>
			<a href="${pageContext.request.contextPath}/new">新規タスクの投稿</a>
		</p>

	</c:param>
</c:import>