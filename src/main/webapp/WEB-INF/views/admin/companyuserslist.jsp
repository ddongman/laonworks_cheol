<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="../common/commonlist.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>기업 회원 목록</title>
    <%-- <script src="<%=request.getContextPath() %>/admin/masking.js"></script> --%>
</head>
<body>
<div class="container">
    <h2>기업 회원 목록</h2>
    <div class="panel panel-default">
        <div class="panel-heading">전체 회원 수(일반 회원): ${totalCompanyUsers}</div>
        <div class="panel-body">

            <div id="ajaxList"></div>
        </div>
    </div>
</div>
</body>
</html>
