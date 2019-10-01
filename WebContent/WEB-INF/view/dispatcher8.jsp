<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.mycompany.web.dto.Counter" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h4>dispatcher8.jsp</h4>
		<%-- how1 --%>
		<%Counter applicationCounter = (Counter)application.getAttribute("applicationCounter"); %>
		applicationCounter: <%=applicationCounter.getValue() %><br/>
		<%Counter sessionCounter= (Counter)session.getAttribute("sessionCounter"); %>
		sessionCounter: <%=sessionCounter.getValue() %><br/>
		<!--%Counter requestCounter=(Counter)request.getAttribute("requestCounter"); %> 
		requestCounter: %=requestCounter.getValue() %><br/><br/>-->
		<%--how2 --%>
		applicationCounter: ${applicationCounter.value} <br/>
		sessionCounter: ${session.vlaue} <br/>
		requestCounter:${requestCounter.value}<br/> <br/>
	</body>
</html>