<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.js" ></script>
</head>
<body>
<h1>乒乓球俱乐部</h1>
<span>输入编号查询姓名</span>
<input type="text" id="id" ><button onclick="sel()">查询</button>
<br />
<span id="spp" ></span>
<script type="text/javascript">
function sel(){
	var id =$("#id").val();//document.getElementById("id").value;
	if(id=="" || id==null){
		alert("编号不能为空！");
		return;
	}
	$.ajax({
		url:"getName.do",
		data:{id:id},
		success:function(dd){
			$("#spp").html(dd);
		}
	});
}
</script>
</body>
</html>