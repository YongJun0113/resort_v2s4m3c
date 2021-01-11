<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 
<!DOCTYPE html> 
<html lang="ko"> 
<head> 
<meta charset="UTF-8"> 
<meta name="viewport" content="user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, width=device-width" /> 
<title>Resort world</title>
 
<link href="../css/style.css" rel="Stylesheet" type="text/css">
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    
<script type="text/javascript">
 
  
</script>
 
</head> 
 
<body>
<jsp:include page="/menu/top.jsp" />
 
  <DIV class='title_line'><a href="./list.do?categrpno=${param.categrpno}">카테고리</a> > ${cateVO.name } 조회(수정)</DIV>
 
  <DIV id='panel_create' style='padding: 10px 0px 10px 0px; background-color: #F9F9F9; width: 100%; text-align: center;'>
    <FORM name='frm_update' id='frm_update' method='POST' action='./update.do'>
      <input type='hidden' name='cateno' id='cateno' value='${cateVO.cateno }'>
      <input type='hidden' name='categrpno' id='categrpno' value='${param.categrpno}'>
        
      <label>그룹 번호</label>
      <input type='number' name='categrpno' value='${cateVO.categrpno }' required="required" 
             min="1" max="99999" style='width: 5%;'>
      
      <label>카테고리</label>
      <input type='text' name='name' value="${cateVO.name }" required="required" style='width: 25%;'>
 
      <label>순서</label>
      <input type='number' name='seqno' value="${cateVO.seqno }" required="required" 
                min='1' max='1000' step='1' style='width: 5%;'>
  
      <label>형식</label>
      <select name='visible'>
        <option value='Y' ${cateVO.visible == 'Y'? "selected='selected'":"" }>Y</option>
        <option value='N' ${cateVO.visible == 'N'? "selected='selected'":"" }>N</option>
      </select>
       
      <button type="submit" id='submit'>저장</button>
      <button type="button" onclick="location.href='./list.do?categrpno=${param.categrpno}'">취소</button>
    </FORM>
  </DIV>
 
  
<TABLE class='table table-striped'>
  <colgroup>
    <col style='width: 10%;'/>
    <col style='width: 40%;'/>
    <col style='width: 20%;'/>
    <col style='width: 10%;'/>    
    <col style='width: 20%;'/>
  </colgroup>
 
  <thead>  
  <TR>
    <TH class="th_bs">순서</TH>
    <TH class="th_bs">대분류명</TH>
    <TH class="th_bs">등록일</TH>
    <TH class="th_bs">출력</TH>
    <TH class="th_bs">기타</TH>
  </TR>
  </thead>
  
  <tbody>
  <c:forEach var="cateVO" items="${list}">
    <c:set var="cateno" value="${cateVO.cateno }"/>
    <tr>
      <td class="td_bs">${cateVO.seqno }</td>
      <td class="td_bs_left">${cateVO.name }</td>
      <td class="td_bs">${cateVO.rdate.substring(0,10) }</td>
      <td class="td_bs">${cateVO.visible }</td>
      <TD class="td_bs">
        <A href="./read_update.do?cateno=${cateno }" title="수정"><span class="glyphicon glyphicon-pencil"></span></A>
        <A href="./read_delete.do?cateno=${cateno }" title="삭제"><span class="glyphicon glyphicon-trash"></span></A>
        <A href="./update_seqno_up.do?cateno=${cateno }" title="우선순위 상향"><span class="glyphicon glyphicon-arrow-up"></span></A>
        <A href="./update_seqno_down.do?cateno=${cateno }" title="우선순위 하향"><span class="glyphicon glyphicon-arrow-down"></span></A>         
      </TD>   
    </tr>
  </c:forEach>
  
 
  </tbody>
 
</TABLE>
 
 
<jsp:include page="/menu/bottom.jsp" />
</body>
 
</html> 