<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form>
      <input type="text" name="username" id="idname">
      <input id="tibtn" type="button" value="btn">
   </form>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
    $("#tibtn").click(function(){
	var username=document.getElementById("idname").value;
	$.ajax({
		url:"/proscenium/getUser",
		data:{username:username},
		dataType:"json",
		success:function(data){
			console.log(data);
		}
	});
}); 

</script>

</body>
</html>