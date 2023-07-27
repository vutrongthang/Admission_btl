<%-- 
    Document   : faculty-detail
    Created on : Jul 26, 2023, 3:38:10 PM
    Author     : vutrongthang
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container mt-3">
    <div class="row">
        <div class="col">
            <!-- Display faculty detail here -->
            <div class="card">
                <img src="faculty1.jpg" class="card-img-top" alt="${faculties.name}">
                <div class="card-body">
                    <h5 class="card-title">${faculties.name}</h5>
                    <p class="card-text">${faculties.description}</p>
                    <p class="card-text">Score: ${faculties.score}</p>
                    <a href="#" class="btn btn-primary">Learn more</a>
                </div>
            </div>
        </div>
    </div>
</div>
