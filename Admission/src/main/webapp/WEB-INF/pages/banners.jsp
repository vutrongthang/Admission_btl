<%-- 
    Document   : banners
    Created on : Aug 10, 2023, 2:05:59 PM
    Author     : vutrongthang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="#">Quản trị banners</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <c:url value="/admin/faculties" var ="detail"/>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="${detail}">Faculty</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Banners</a>
                </li>

            </ul>
        </div>
    </div>
</nav>

    <!-- Content Area -->
    <div class="container mt-4">
        <h1>Banners Management</h1>
        
        <!-- Add Banner Button -->
        <a href="#" class="btn btn-primary mb-3">Add Banner</a>
        
        <!-- Banner List -->
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Title</th>
                    <th>Image</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>Summer Sale</td>
                    <td><img src="banner1.jpg" alt="Banner 1" class="img-fluid" style="max-width: 100px;"></td>
                    <td>
                        <a href="#" class="btn btn-info btn-sm">Edit</a>
                        <a href="#" class="btn btn-danger btn-sm">Delete</a>
                    </td>
                </tr>
                <!-- Add more rows for other banners -->
            </tbody>
        </table>
    </div>