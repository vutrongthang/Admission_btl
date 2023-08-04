<%-- 
    Document   : login
    Created on : Jul 30, 2023, 1:55:58 PM
    Author     : vutrongthang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/login" var="action" />

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-lg-6">
            <div class="card">
                <div class="card-body">
                    <h3 class="card-title text-center">Đăng nhập</h3>
                    <c:if test="${param.error != null}">
                        <div class="alert alert-danger alert-dismissible container">
                            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
                            <strong>Tài khoản hoặc mật khẩu không chính xác!</strong>${params.error}
                        </div>
                    </c:if>
                    <form action="${action}" method="post">
                        <div class="mb-3">
                            <label for="name" class="form-label">Tên đăng nhập</label>
                            <input type="name" class="form-control" id="name" name="name" required>
                        </div>
                        <div class="mb-3">
                            <label for="password" class="form-label">Mật khẩu</label>
                            <input type="password" class="form-control" id="password" name="password" required>
                        </div>
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Đăng nhập</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

</div>