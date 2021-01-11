<%@ page contentType="text/plain; charset=UTF-8" %> 
<%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %>


<%
/* String name = request.getParameter("name");
String product = request.getParameter("product");
int price = Integer.parseInt(request.getParameter("price")); */

JSONArray list = new JSONArray(); // 배열

JSONObject json = new JSONObject(); // 배열에 추가할 객체
json.put("name", "유용준");
json.put("product", "인도네시아 만델링");
json.put("price", 3500);
list.put(json); // 배열의 객체 추가

json = new JSONObject();
json.put("name", "홍길동");
json.put("product", "에티오피아 예가체프");
json.put("price", 4000);
list.put(json);

json = new JSONObject();
json.put("name", "아무개");
json.put("product", "콜롬비아 수프리모");
json.put("price", 5000);
list.put(json);

out.println(list.toString()); // JSON 출력
%>







