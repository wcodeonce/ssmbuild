<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>修改书籍</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <div class="form-group">
            <label for="bookName">书籍名称:</label>
            <input type="text" class="form-control" id="bookName" name="bookName" required value="${books.bookName}">
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量:</label>
            <input type="text" class="form-control" id="bookCounts" name="bookCounts" required value="${books.bookCounts}">
        </div>
        <div class="form-group">
            <label for="detail">书籍描述:</label>
            <input type="text" class="form-control" id="detail" name="detail" required value="${books.detail}">
        </div>
        <div class="form-group">
            <input type="hidden" value="${books.bookID}" name="bookID">
            <input type="submit" class="form-control btn-primary" value="修改">
        </div>
    </form>

</div>
</body>
</html>
