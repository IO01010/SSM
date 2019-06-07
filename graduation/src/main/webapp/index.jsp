<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<script>
	//JavaScript function 判断输入是否为空
    function check(){
		var membername = $("#membername").val();
		var password = $("#password").val();
		if (membername == "" || password==""){
			$("#message").text("登录名或密码不能为空！ ");
			return false;	
		}
		return true;
	}
</script>

</head>
<body>
	<div>
		<table class="table table-striped">
			<form action="${PATH}/login" method="post" onsubmit="return check()">
			<br/>
			账号:
			<input id = "membername" type="text" name="membername" >
			<br>
			密码: 
			<input id="password" type="password" name="password" >
			<br><br>
			<input type="submit" value="登录">
			<input type="reset"  value="重置">
			<input type="button" value="注册" onclick="window.location.href='${PATH}/toregisted'">
			
			</form> 
			<font color = "red">
				<!-- 错误提示信息 -->
				<span id="message">${msg}</span>
			</font>
		
		</table>
	</div>
</body>
</html>