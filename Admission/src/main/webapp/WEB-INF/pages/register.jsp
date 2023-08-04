<%-- 
    Document   : register
    Created on : Jul 30, 2023, 1:55:52 PM
    Author     : vutrongthang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<c:url value="/register" var="action" />

<div class="container mt-5">
    <h1 class="text-center mb-5">ĐĂNG KÝ TÀI KHOẢN</h1>

    <c:if test="${err != null}">
        <div class="alert alert-danger">
            <strong>Failed</strong> ${err}
        </div>
    </c:if>

    <form:form method="post" action="${action}" modelAttribute="users" enctype="multipart/form-data">
        <div class="mb-3">
            <label for="name" class="form-label">Username</label>
            <form:input type="text" class="form-control" id="name" path="name" placeholder="Enter name" />
            <form:errors path="name" class="text-danger" />
        </div>

        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <form:input type="password" class="form-control" id="password" path="password" placeholder="Enter password" />
            <form:errors path="password" class="text-danger" />
        </div>

        <div class="mb-3">
            <label for="confirmPassword" class="form-label">Confirm Password</label>
            <form:input type="password" class="form-control" id="confirmPassword" path="confirmPassword" placeholder="Confirm password" />
            <form:errors path="confirmPassword" class="text-danger" />
        </div>

        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <form:input type="text" class="form-control" id="email" path="email" placeholder="Enter email" />
            <form:errors path="email" class="text-danger" />
        </div>

        <button type="submit" class="btn btn-primary">Đăng ký</button>
    </form:form>
</div>

