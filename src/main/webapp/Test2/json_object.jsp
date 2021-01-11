<%@ page contentType="text/plain; charset=UTF-8" %> 
<%@ page import="org.json.JSONObject" %> 

<%
/* {
"name": "유용준",
"math": 80,
"English": 90.5
} */

 JSONObject json = new JSONObject();
 json.put("name", "유용준");
 json.put("math", 80);
 json.put("English", 90.5);
 
 out.println(json.toString());
 %>