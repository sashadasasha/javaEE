<%--
  Created by IntelliJ IDEA.
  User: sasha
  Date: 17.08.2020
  Time: 7:31
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/header.jsp" %>
<title>Cart</title>
</head>
<body>
<c:url value="/order" var="submitOrder"/>
<%@include file="/WEB-INF/nav-menu.jsp" %>
<div class="container">
    <h1>Cart</h1>
    <a class="btn btn-primary" href="${submitOrder}">Submit</a>
</div>

<%@include file="/WEB-INF/footer.jsp" %>

