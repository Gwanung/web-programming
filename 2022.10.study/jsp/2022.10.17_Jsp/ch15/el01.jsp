<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int[] array = {10, 20, 30};
pageContext.setAttribute("array", array);

List<String> list = new ArrayList<String>();
list.add("hello");
list.add("world");
pageContext.setAttribute("list", list);

Map<String, String> map = new HashMap<>();
map.put("one", "hello");
map.put("two", "world");
pageContext.setAttribute("map", map);



%>

<%=array[1] %>
<%out.println(array[0]); %>
${array[2]}<br>

${list[0]}<br>
${list.get(1)}<br>

${map.get("one")}<br>
${map["one"]}<br>
${map.two}
</body>
</html>