<%-- 
    Document   : header
    Created on : Apr 28, 2023, 4:03:57 PM
    Author     : vutrongthang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="<c:url value="/"/>">Trang chủ</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <select class="form-select me-2" aria-label="Thông tin tuyển sinh" onchange="location = this.value;">
                        <option selected>Thông tin tuyển sinh</option>
                        <c:forEach items="${admission_info}" var="admission">
                            <option >${admission.admissionType}</option>
                        </c:forEach>

                        <!-- Add more options here -->
                    </select>                        </li>

                <li class="nav-item">
                    <select class="form-select" aria-label="Thông tin khoa-ngành" onchange="location=this.value;">
                        <option value="/" selected>Thông tin khoa-ngành</option>
                        <option value="/Admission">Các khoa</option>
                        <option value="/Admission">Bệnh viện</option>
                        <option value="/Admission">Trung tâm</option>
                        <option value="/Admission">Đơn vị</option>
                    </select>
                </li>
              

                <li class="nav-item">
                    <select class="form-select" aria-label="Thông tin khoa-ngành" onchange="location = this.value;">
                        <option selected>Tin Tức</option>
                        <option value="1">Sự kiện</option>
                        <option value="2">Thông báo</option>
                        <!-- Add more options here -->
                    </select> 
                </li>
                <!-- Add more navigation items here -->
            </ul>
        </div>
        <!-- Right-aligned items -->

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <!-- Your existing code here -->

                <!-- Search bar -->
                <form class="d-flex ms-auto mt-3">
                    <input class="form-control me-2" type="search" placeholder="Tìm kiếm" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Tìm</button>
                </form>

                <!-- Login and Register buttons -->
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="<c:url value="/login"/>">Đăng nhập</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="<c:url value="/register"/>">Đăng ký</a>
                    </li>
                </ul>
            </div>
        </nav>






    </div>
</nav>

