<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="js/jquery-1.4.4.min.js" type="text/javascript"></script>
    <script src="js/ajaxfileupload.js" type="text/javascript"></script>

  </head>
  
<script type="text/javascript">  
    function ajaxFileUpload() {  
  
        $.ajaxFileUpload({  
            url : "upload",// servlet请求路径  
            secureuri :false,
            type: "post",  
            fileElementId : "fileToUpload",// 上传控件的id  
            dataType : "json",  
            data : {"username" : $("#username").val()}, // 其它请求参数  
            success : function(data, status) {  
              
              	alert(data.msg);
            },  
            error : function(data, status, e) {  
                alert(e);  
            }  
        })  
  
    }  
</script>  
  
  <body>
    
 	 <%--


 	  /* $.ajaxFileUpload({
           url:'/test',
           type:'post',
           fileElementId:'fileuploadId',
           data:{username:$("#username").val()},
           success:function () {

           }

       })*/


 	 --%>
        用户名:<input type="text" id="username" name="username"> <br>  
        <input id="fileToUpload" type="file" size="45" name="fileToUpload"  
            class="input">  
        <button class="button" onclick="return ajaxFileUpload();">上传</button>  
  

  </body>
</html>
