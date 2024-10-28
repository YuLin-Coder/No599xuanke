<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
String path = request.getContextPath();
%>
<jsp:include page="/WEB-INF/common/header.jsp"/>
		
	</head>
  <body>
       
<h4 style="color:red">修改成功</h4>
<button type="button"  onclick="location.href='StudentServlet?action=findMyInfo&stuno=${sessionScope.student.stuno}'">返回查看我的信息</button>
  </body>
</html>
