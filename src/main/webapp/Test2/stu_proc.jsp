<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="org.json.JSONObject" %>
 
<%
 
String name = request.getParameter("name");
String product = request.getParameter("product");
int price = Integer.parseInt(request.getParameter("price"));


JSONObject json = new JSONObject(); 
json.put("name", name);
json.put("product", product);
json.put("price", price);
out.println(json.toString());
 
%> 