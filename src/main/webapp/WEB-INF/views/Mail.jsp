<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Form</title>
<style>
	h2{
		color: tomato;
		background-color: cyan;	
	}
	form{
		background-color: yellow;
	}
	.sample{
	
	width:305px;
	 margin-left: auto ;
  margin-right: auto ;
	}
	
	.sample1{
	width:500px;
	 margin-left: auto ;
  margin-right: auto ;
	}
	.sample2{
	 margin-left: auto ;
  margin-right: auto ;
  width:40px;
  
  border-radius: 25px;
  
	}	
	
</style>
</head>
<body>
	
		<div class="sample"><h2>Gmail Message Sending Page</h2></div>
		<div class="sample1"><c:form action="send" method="post" modelAttribute="message" enctype="multipart/form-data">
		Cc<c:input path="CarbonCopy"/>
		Bcc<c:input path="BlindCopy"/><br/><br/>
		To<c:input path="Email"/><br/><br/>
		Subject
			<c:input path="Subject"/><br/><br/>
		Text<c:textarea path="Message"/></textarea><br/><br/>
		Attachment<input type="file" name="Attachment"><br/><br/>
		</div>
		
                <div class="sample2"><input type="submit" class="dummy" value="send" style="color: red; border-color: green; background-color: blue; border-radius: 25px;"></div>
        
	</c:form>
	
	<center>${me }</center>
	
</body>
</html>