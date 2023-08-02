<%-- 
    Document   : faculty-detail
    Created on : Jul 26, 2023, 3:38:10 PM
    Author     : vutrongthang
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container my-5">
    <div class="row">
        <div class="col-md-6">
            <!-- Display faculty detail here -->         
            <img src="${faculties.image}" class="card-img-top" alt="${faculties.name}">   
        </div>
        <div class="col-md-6">
            <h5 class="card-title">${faculties.name}</h5>
            <p class="card-text">${faculties.description}</p>
            <p class="card-text">Score: ${faculties.score}</p>
            <button class="btn btn-primary">
                <a style="color: black; text-decoration: none" href="${faculties.website}">Website</a></button>
        </div>
    </div>
</div>
