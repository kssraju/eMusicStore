<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/view/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Details</h1>
            <p class="lead">Here is the detail information about the product</p>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="<c:url value="/resources/images/${product.productId}.png" />" alt="image"
                             style="width:100%"/>
                </div>
                <div class="col-md-5">
                    <h3>${product.productName}</h3>
                    <p>${product.productDescription}</p>
                    <p><strong>${product.productManufacturer}</strong></p>
                    <p><strong>${product.productCategory}</strong></p>
                    <p><strong>${product.productCondition}</strong></p>
                    <h4>${product.productPrice} USD</h4>
                </div>
            </div>
        </div>

<%@include file="/WEB-INF/view/template/footer.jsp" %>