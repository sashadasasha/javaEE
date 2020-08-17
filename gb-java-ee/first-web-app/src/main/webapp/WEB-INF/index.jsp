<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<!doctype html>--%>
<%--<html lang="en">--%>

<%--<head>--%>
<%--    <!-- Required meta tags -->--%>
<%--    <meta charset="utf-8">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">--%>

<%--    <!-- Bootstrap CSS -->--%>
<%--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"--%>
<%--          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">--%>
<%--    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"/>--%>
<%@include file="/WEB-INF/header.jsp" %>
    <title>Shopping application</title>
</head>
<body>

<%@include file="/WEB-INF/nav-menu.jsp" %>
<div class="container">
    <div class="row py-2">
        <div class="col-12">
            <c:url value="/new" var="newProduct"/>
            <a class="btn btn-primary" href="${newProduct}">Add product</a>
        </div>

        <div class="col-12">
            <table class="table table-bordered my-2">
                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Description</th>
                    <th scope="col">Price</th>
                    <th scope="col">Actions</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="prod" items="${requestScope.products}">
                <tr>
                    <th scope="row"><c:out value="${prod.id}"/></th>
                    <td><c:out value="${prod.name}"/></td>
                    <td><c:out value="${prod.description}"/></td>
                    <td><c:out value="${prod.price}"/></td>
                    <td>
                        <c:url value="/edit" var="productEditUrl">
                            <c:param name="id" value="${prod.id}"/>
                        </c:url>
                        <a class="btn btn-success" href="${productEditUrl}"><i class="fas fa-edit"></i></a>
                        <a class="btn btn-danger" href="#"><i class="far fa-trash-alt"></i></a>
                    </td>
                    </c:forEach>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>

<%@include file="/WEB-INF/footer.jsp" %>
