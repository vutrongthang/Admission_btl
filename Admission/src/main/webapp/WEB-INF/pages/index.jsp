<%-- 
    Document   : index
    Created on : Jul 21, 2023, 11:28:13 PM
    Author     : vutrongthang
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>






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
            <c:url value="/faculties/${faculty.facultiesId}" var ="detail"/>

            <div class="col-md-4 mb-4">
                <div class="card">

                    <div class="card-body">
                        <h5 class="card-title">${faculty.name}</h5>
                        <p class="card-text">${faculty.description}</p>
                        <p class="card-text">${faculty.score}</p>
                        <a href="${detail}" class="btn btn-primary" type="button">Chi tiết</a>
                    </div>
                </div>
            </div>
        </c:forEach>
        
    </div>

</div>





