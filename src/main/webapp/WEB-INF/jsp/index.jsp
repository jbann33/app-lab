<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <c:url value="/webjars/jquery/2.1.4/jquery.min.js" var="jquery"/>
    <script src="${jquery}"></script>

    <c:url value="/webjars/bootstrap/3.3.4/js/bootstrap.min.js" var="bootstrapJS"/>
    <script src="${bootstrapJS}"></script>

    <c:url value="/static/css/bootswatch_lux.css" var="bootstrapCSS" />
    <link href="${bootstrapCSS}" rel="stylesheet" media="screen" />


    <title>Vehicle Mgmt App</title>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <a class="navbar-brand" href="/vehicle">Vehicle Management</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarColor01">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/vehicle/add">Add Vehicle</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/vehicle/list">List All Vehicles</a>
            </li>
        </ul>
    </div>
</nav>

</body>
</html>



