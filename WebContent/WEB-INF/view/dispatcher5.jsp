<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h4>dispatcher5.jsp</h4>
		<%-- how1 이렇게 하면 그냥 완전 주석이야 클라이언트에도 전달 안돼--%>
		<!-- how1 이렇게 하면 렌더링은 되지는 않지만 클라이언트한테 전달돼 -->
		 
		name:<%= request.getAttribute("name")%> <br/>
		age:<%= request.getAttribute("age")%> <br/> 
		
		
		name:<%= request.getAttribute("name")%> <br/>
		age:<%= request.getAttribute("age")%> <br/>
		
		<%-- how2(Expression Language (EL) --%>
		name: ${name} <br/>
		age: ${age} <br/>
		<%//이 안에는 자바코드만 작성한다 따라서 주석은 //얘랑 /**/얘가 사용된다.%>
	</body>
</html>