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
<form method="post" action="${action}" th:object="${faculties}">
    <div class="form-floating mb-3 mt-3">
        <select class="form-select" th:field="*{facultiesId}" id="facultiesId" name="facultiesId">
            <option th:each="faculty : ${faculties}" th:value="${faculty.id}"
                    th:text="${faculty.name}" th:selected="${faculty.id == facultiesId}"></option>
        </select>
        <label for="facultiesId" class="form-label">Danh mục khoa</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <input type="text" class="form-control" id="description" 
               th:field="*{description}" placeholder="Miêu tả" />
        <label for="description">Miêu tả</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <input type="number" step="100" class="form-control" id="score" 
               th:field="*{score}" placeholder="Điểm số" />
        <label for="score">Điểm số</label>
    </div>
    <div class="form-floating mb-3 mt-3">

        <input type="submit"  value="Thêm thông tin" class="btn btn-success" />


    </div>
</form>
<!-- ... -->
