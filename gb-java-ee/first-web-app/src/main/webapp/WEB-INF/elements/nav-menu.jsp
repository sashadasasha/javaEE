<%--
  Created by IntelliJ IDEA.
  User: sasha
  Date: 17.08.2020
  Time: 7:31
  To change this template use File | Settings | File Templates.
--%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <c:url value="/" var="main"/>
    <a class="navbar-brand" href="${main}">AppleShop</a>

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <c:url value="/" var="main"/>
                <a class="nav-link" href="${main}">Catalogue</a>
                <c:url value="/cart" var="cart"/>
                <a class="nav-link" href="${cart}">Cart</a>
                <c:url value="/about" var="about"/>
                <a class="nav-link" href="${about}">About Us</a>
            </li>
        </ul>
    </div>
</nav>
