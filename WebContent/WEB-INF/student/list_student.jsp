<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
%>
<jsp:include page="/WEB-INF/common/header.jsp"/>
		
        <script language="javascript">
           function del(id)
           {
               if(confirm('您确定删除该条记录吗？'))
               {
                   window.location.href="<%=path %>/StudentServlet?action=delete&id="+id;
               }
           }
           
          
       </script>
	</head>

	<body leftmargin="2" topmargin="2">
	
					&emsp;<button onclick="location.href='StudentServlet?action=list'">返回主界面</button>
				       <span style="color:red">${msg}</span>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#FAFAF1">
			
					<td height="14" colspan="1" >&nbsp;学生列表&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
				
					<td width="12%">学号</td>
					<td width="12%">学生姓名</td>
					<td width="12%">性别</td>
					<td width="12%">专业</td>
					<td width="12%">年级</td>
					<td width="12%">班级</td>
					<td width="12%">密码</td>
					<td width="14%">操作</td>
		        </tr>	
				<c:forEach items="${list}" var="s" >
				<tr align='center' bgcolor="#FAFAF1"  height="22">
					<td width="12%" bgcolor="#FFFFFF" align="center">
						${s.stuno}
					</td>
					<td width="12%" bgcolor="#FFFFFF" align="center">
						${s.sname}
					</td>
					<td width="12%" bgcolor="#FFFFFF" align="center">
					    ${s.sex}
					</td>
					<td width="12%" bgcolor="#FFFFFF" align="center">
					    ${s.major}
					</td>
					<td width="12%" bgcolor="#FFFFFF" align="center">
					    ${s.grade}
					</td>
					
					<td width="12%" bgcolor="#FFFFFF" align="center">
					    ${s.bj}
					</td>
					<td width="12%" bgcolor="#FFFFFF" align="center">
					    ${s.pwd}
					</td>
					
					<td width="12%" bgcolor="#FFFFFF" align="center">
						<a href="StudentServlet?action=query&id=${s.id }" class="pn-loperator">修改</a>
						<a href="#" onclick="del(${s.id})" class="pn-loperator">删除</a>
					</td>
				</tr>
				</c:forEach>
				
			</table>
			<br>
			
			
			
	</body>
</html>
