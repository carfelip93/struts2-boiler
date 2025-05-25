<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1.0"
    />
    <title>Struts2 Application</title>
    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <!-- Bootstrap CSS -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <!-- Bootstrap JS Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Custom CSS -->
    <style>
      .container {
        margin-top: 2rem;
      }
      .user-list {
        margin-top: 1rem;
      }
      .error-message {
        color: #dc3545;
      }
      .success-message {
        color: #198754;
      }
    </style>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container-fluid">
        <a
          class="navbar-brand"
          href="<s:url action='home'/>"
          >Struts2 App</a
        >
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div
          class="collapse navbar-collapse"
          id="navbarNav"
        >
          <ul class="navbar-nav">
            <li class="nav-item">
              <a
                class="nav-link"
                href="<s:url action='hello' namespace='/'/>"
                >Home</a
              >
            </li>
            <li class="nav-item">
              <a
                class="nav-link"
                href="<s:url action='list' namespace='/user'/>"
                >Users</a
              >
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container"></div>
  </body>
</html>
