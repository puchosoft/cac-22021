<%-- 
    Document   : header
    Created on : 15/07/2022, 14:36:00
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CaC - Homebanking</title>
        <link rel="stylesheet" href="/css/tags.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body style="display:grid; grid-template-rows: 1fr 5fr 1fr; min-height: 100vh;">
        <header>
            <div class="d-flex flex-row justify-content-around align-items-center h-100 bg-success text-center text-light">
                <a href="/">
                    <img class="rounded" style="height: 70px;" src="/img/cac_logo.png" alt="cac_logo"/>
                </a>
                <h1>Codo a Codo - Homebanking</h1>
                <%
                    boolean isLogin;
                    if(session.isNew()){
                        session.setAttribute("isLogin", false); 
                    }
                    isLogin = (boolean) session.getAttribute("isLogin");
                %>
                <p></p>
                <ul class="nav nav-pills">
                    <li class="nav-item mx-2" style="display: <%= isLogin?"none":"initial" %> ;">
                        <a class="nav-link active" href="/views/login.jsp">Ingresar</a>
                    </li>
                    <li class="nav-item mx-2" style="display: <%= isLogin?"none":"initial" %> ;">
                        <a class="nav-link active" href="/views/registro.jsp">Registrarme</a>
                    </li>
                    <li class="nav-item mx-2" style="display: <%= !isLogin?"none":"initial" %> ;">
                        <a class="nav-link active" href="/usuario/viewUser">Mi cuenta</a>
                    </li>
                    <li class="nav-item mx-2" style="display: <%= !isLogin?"none":"initial" %> ;">
                        <a class="nav-link active" href="/usuario/logoutUser">Salir</a>
                    </li>
                </ul>

                
            </div>
        </header>
