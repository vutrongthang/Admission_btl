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
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Thông tin tuyển sinh</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Thông tin khoa-ngành</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Thông tin tham khảo</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Liên hệ</a>
                        </li>
                        <!-- Add more navigation items here -->
                    </ul>
                </div>
            </div>
        </nav>

        <!-- Display banners here -->
        <c:forEach var="banner" items="${banners}">
            <div class="banner">
                <img src="${banner.image}" alt="banner">
            </div>
        </c:forEach>



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
                                <a href="#" class="btn btn-primary">Learn more</a>
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


