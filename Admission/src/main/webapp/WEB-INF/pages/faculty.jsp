<%-- 
    Document   : faculty
    Created on : Aug 10, 2023, 1:52:52 PM
    Author     : vutrongthang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="#">Quản trị thông tin</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <c:url value="/admin/banners" var ="detail"/>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Faculty</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${detail}">Banners</a>
                </li>

            </ul>
        </div>
    </div>
</nav>

<!-- Content Area -->
<div class="container mt-4">
    <h1>Welcome to Admin Dashboard</h1>
</div>
<c:url value="/admin/faculties" var="action" />
<c:if test="${errMsg != null}">
    ${errMsg}
</c:if>
<!-- ... -->
<form:form method="post" action="${action}" modelAttribute="faculties">
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" class="form-control" id="name" 
                    path="name" placeholder="Tên khoa" name="name" />
        <label for="name">Tên khoa</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="number" step="100" class="form-control" id="score" 
                    path="score" placeholder="Điểm số" name="score" />
        <label for="price">Điểm số</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" class="form-control" id="description" 
                    path="description" placeholder="Giới thiệu khoa" name="description" />
        <label for="name">Giới thiệu khoa</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <c:choose>
            <c:when test="${faculties.facultiesId > 0}">
                <form:hidden path="facultiesId" />
                <input type="submit"  value="Cập nhật sản phẩm" class="btn btn-success" />
            </c:when>
            <c:otherwise>
                <input type="submit"  value="Thêm sản phẩm" class="btn btn-success" />
            </c:otherwise>
        </c:choose>

    </div>
</form:form>

<table class="table">
    <tr>
        <th>Id</th>
        <th>Tên Khoa</th>
        <th>Điểm số</th>
        <th>Giới thiệu</th>
        <th></th>
    </tr>
    <c:forEach items="${faculty}" var="faculty">
        <tr id="faculty${faculty.facultiesId}">
            <td>${faculty.facultiesId}</td>
            <td>${faculty.name}</td>
            <td>${faculty.score}</td>
            <td>${faculty.description}</td>
            <td>
                <a href="<c:url value="/admin/faculties/${faculty.facultiesId}" />" class="btn btn-info">Cập nhật</a>
            </td>
        </tr>
    </c:forEach>
</table>
<!-- ... -->
