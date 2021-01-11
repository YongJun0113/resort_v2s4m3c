package dev.mvc.test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestCont {
  
  @ResponseBody
  @RequestMapping(value = "/test/json_array.do",
                            method = RequestMethod.GET,
                            produces = "text/plain;charset=UTF-8")
  public String array() {
    JSONArray list = new JSONArray();
    
    JSONObject json = new JSONObject();
    json.put("name", "유용준");
    json.put("product", "인도네시아 만델링");
    json.put("price", 3500);
    list.put(json); // 배열의 객체 추가
 
    System.out.println(list.toJSONObject(list));
    
    return json.toString(); 

  }

}
