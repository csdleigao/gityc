<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-3.0.0.min.js"></script>
<title>测试checkbox</title>
<script type="text/javascript">
	$(function(){
		console.info($("[name='ck']").attr("checked"));
		$("[name='ck']").click(function() {
			if(!($("[name='ck']").is(":checked"))){
				console.info("---123---");
				$("[name='sbt']").attr("disabled",true);
			}else{
				console.info("---456---");
				$("[name='sbt']").attr("disabled",false);
			}
		})
		
	});
</script>
</head>
<body>
<input type="checkbox" checked="checked" name="ck" id="ck"/>请你同意一下声明<br/><br/>
<input type="submit" value="注册" name="sbt" id="subm"/>
</body>
</html>