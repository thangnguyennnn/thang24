 <%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Quản lý Sách</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style_1.css" type="text/css">
    <style>
        .modal-6 {
          -moz-box-shadow: 0 2px 2px #333;
          -webkit-box-shadow: 0 2px 2px #333;
          box-shadow: 0 2px 2px #333;
          -moz-border-radius: 50px;
          -webkit-border-radius: 50px;
          border-radius: 50px;
        }
        .modal-6 a {
          border-color: #ddd;
          color: #999;
          background: #fff;
          padding: 10px 15px;
        }
        .modal-6 a:hover {
          color: #E34E48;
          background-color: #eee;
        }
        .modal-6 a.prev {
          -moz-border-radius: 50px 0 0 50px;
          -webkit-border-radius: 50px;
          border-radius: 50px 0 0 50px;
          width: 50px;
          position: relative;
        }
        .modal-6 a.prev:after {
          content: '';
          position: absolute;
          width: 10px;
          height: 100%;
          top: 0;
          right: 0;
          background-image: -moz-linear-gradient(left, rgba(0, 0, 0, 0) 0%, rgba(0, 0, 0, 0.2) 100%);
          background-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0) 0%, rgba(0, 0, 0, 0.2) 100%);
          background-image: linear-gradient(to right, rgba(0, 0, 0, 0) 0%, rgba(0, 0, 0, 0.2) 100%);
        }
        .modal-6 a.next {
          -moz-border-radius: 0 50px 50px 0;
          -webkit-border-radius: 0;
          border-radius: 0 50px 50px 0;
          width: 50px;
          position: relative;
        }
        .modal-6 a.next:after {
          content: '';
          position: absolute;
          width: 10px;
          height: 100%;
          top: 0;
          left: 0;
          background-image: -moz-linear-gradient(left, rgba(0, 0, 0, 0.2) 0%, rgba(0, 0, 0, 0) 100%);
          background-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0.2) 0%, rgba(0, 0, 0, 0) 100%);
          background-image: linear-gradient(to right, rgba(0, 0, 0, 0.2) 0%, rgba(0, 0, 0, 0) 100%);
        }
        .modal-6 a.active {
          border-color: #bbb;
          background: #fff;
          color: #E34E48;
          -moz-box-shadow: 0 0 3px rgba(0, 0, 0, 0.25) inset;
          -webkit-box-shadow: 0 0 3px rgba(0, 0, 0, 0.25) inset;
          box-shadow: 0 0 3px rgba(0, 0, 0, 0.25) inset;
        }
    </style>
</head>

<body style="font-family: sans-serif;display: ${sessionScope.isAdmin == "1" && sessionScope.Logining != null ? "block":"none"}">
    <jsp:include page="header.jsp"></jsp:include>

    <!-- Hero Section Begin -->
    <section class="hero hero-normal">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="hero__categories">
                        <div class="hero__categories__all">
                            <i class="fa fa-bars"></i>
                            <span>All departments</span>
                        </div>
                        <ul>
                            <c:forEach items="${listC}" var="c">
                                <li><a href="loadListByCateID?cateID=${c.cID}">${c.cName}</a></li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="hero__search">
                        <div class="hero__search__form">
                            <form action="#">
                                <div class="hero__search__categories">
                                    All Categories
                                    <span class="arrow_carrot-down"></span>
                                </div>
                                <input type="text" placeholder="What do yo u need?">
                                <button type="submit" class="site-btn">SEARCH</button>
                            </form>
                        </div>
                        <div class="hero__search__phone">
                            <div class="hero__search__phone__icon">
                                <i class="fa fa-phone"></i>
                            </div>
                            <div class="hero__search__phone__text">
                                <h5>+65 11.188.888</h5>
                                <span>support 24/7 time</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Hero Section End -->

    <!-- Breadcrumb Section Begin -->
    <section class="breadcrumb-section set-bg" data-setbg="img/breadcrumb.jpg">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <div class="breadcrumb__text">
                        <h2>Quản Lý Sách</h2>
                        <div class="breadcrumb__option">
                            <a href="loadHomePage">Trang chủ</a>
                            <span>Quản lý sách</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Breadcrumb Section End -->

    <!-- Shoping Cart Section Begin -->
    <section class="shoping-cart spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__table">
                        <div class="col-lg-9">
                            <div class="hero__search">
                                <div class="hero__search__form">
                                    <form action="#">
                                        <input oninput="search(this)" type="text" placeholder="Sách bạn tìm kiếm?">
                                        <button type="submit" class="site-btn">Tìm</button>
                                    </form>
                                </div>
                                <div class="hero__search__phone" style="cursor: pointer" title="Thêm sách">
                                    <div class="hero__search__phone__icon">
                                        <a href="loadAddBookPage"><i class="fa fa-plus"></i></a>
                                    </div>
                                </div>
                                <div class="hero__search__phone" style="cursor: pointer" title="Thêm Thể Loại Mới">
                                    <div class="hero__search__phone__icon">
                                         <a href="loadAddCatePage"><i class="fa fa-plus"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <table>
                                <thead>
                                    <tr>
                                        <th class="shoping__product" style="width: 30%">Sách</th>
                                        <th style="width: 15%">ID</th>
                                        <th style="width: 30%">Tác giả</th>
                                        <th style="width: 30%">Lượt mượn</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody id="containerResult">
                                
                                <c:forEach items="${listB}" var="b">
                                    <tr>
                                        <td class="shoping__cart__item">
                                            <a href="loadViewInfoBookPage?bookID=${b.bookID}">
                                                <img style="width: 120px;" src="${b.anhMH}" alt="${b.tenSach}" title="${b.tenSach}">
                                                <h5>${b.tenSach}</h5>
                                            </a>
                                        </td>
                                        <td class="shoping__cart__quantity">
                                            ${b.bookID}
                                        </td>
                                        <td class="shoping__cart__quantity">
                                            ${b.tacGia}
                                        </td>
                                        <td class="shoping__cart__quantity">
                                            ${b.luotMuon}
                                        </td>
                                        <td class="shoping__cart__item__close">
                                            <span class="icon_close"></span>
                                        </td>
                                    </tr>
                                </c:forEach>



                                </tbody>
                            </table>
                    </div>
                </div>
            </div>
            <div class="row" id="indexListB">
                <div class="col-lg-12">
                    <ul class="pagination modal-6">
                        <li style="display:${in == 1 ? "none":"block"}"><a href="loadManagerBookPage?indexB=${in-1}" class="prev">&laquo</a></li>
                      <c:forEach begin="1" end="${index}" var="i">
                      <li> <a href="loadManagerBookPage?indexB=${i}" class="${i == in ? "active":""}">${i}</a></li>
                        </c:forEach>
                      <li style="display:${in == index ? "none":"block"}"><a href="loadManagerBookPage?indexB=${in+1}" class="next">&raquo;</a></li>
                    </ul>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-6">
                    <div class="shoping__checkout">
                        <h5>Danh sách</h5>
                        <ul>
                            <li>Tổng số lượng <span>${sls}</span></li>
                        </ul>
                        
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Shoping Cart Section End -->

    <jsp:include page="footer.jsp"></jsp:include>

    <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>

    <script>
        function search(param) {
             var nameBook = param.value;
            $.ajax({
               url: "searchBook",
               type: "post",
               data: {
                   nameBook : nameBook
               },
               success: function (data){
                   var result = document.getElementById("containerResult");
                   var index = document.getElementById("indexListB");
                   result.innerHTML = data;
                   index.innerHTML = "";
               }
            });
        }
    </script>
</body>

</html>