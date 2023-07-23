<%-- 
    Document   : index
    Created on : Jul 21, 2023, 11:28:13 PM
    Author     : vutrongthang
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Hỗ trợ tuyển sinh</title>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="#">Trang chủ</a>
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
                            <select class="form-select" aria-label="Thông tin khoa-ngành" onchange="location = this.value;">
                                <option selected>Thông tin khoa-ngành</option>
                                <c:forEach items="${faculties}" var="f">
                                    <option >${f.name}</option>
                                </c:forEach>
                                <!-- Add more options here -->
                            </select>                        </li>
                        <li class="nav-item">
                            <select class="form-select" aria-label="Thông tin khoa-ngành" onchange="location = this.value;">
                                <option selected>Thông tin tham khảo</option>
                                <option selected>Tạp chí y học</option>

                                <!-- Add more options here -->
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
                <div class="d-flex">
                    <a class="btn btn-outline-primary me-2 " href="#">Đăng ký</a>
                    <a class="btn btn-primary " href="#">Đăng nhập</a>
                </div>

            </div>
        </nav>



        <!-- Display banners here -->
        <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <c:forEach var="banner" items="${banners}" varStatus="status">
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="${status.index}" class="${status.index == 0 ? 'active' : ''}" aria-label="Slide ${status.index + 1}"></button>
                </c:forEach>
            </div>
            <div class="carousel-inner">
                <c:forEach var="banner" items="${banners}" varStatus="status">
                    <div class="carousel-item ${status.index == 0 ? 'active' : ''}">
                        <img src="${banner.image}" class="d-block w-100" alt="Slide ${status.index + 1}">
                    </div>
                </c:forEach>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>





        <!-- Faculties section -->
        <div class="container mt-3">
            <div class="row">
                <!-- Display faculties here -->
                <c:forEach var="faculty" items="${faculties}">
                    <div class="col-md-4 mb-4">
                        <div class="card">

                            <div class="card-body">
                                <h5 class="card-title">${faculty.name}</h5>
                                <p class="card-text">${faculty.description}</p>
                                <p class="card-text">${faculty.score}</p>
                                <a href="${facutly.website}" class="btn btn-primary">Chi tiết</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>


        <!-- Bootstrap JS (requires jQuery) -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>

</html>


