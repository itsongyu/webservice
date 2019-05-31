<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>hello,web!!!</title>
</head>
<script type="text/javascript">

  function fun1(){
    //window.location:重定向到另外的一个页面

    var we=document.getElementById("we").value;
    if(we==undefined)
    {
      we="日本";
    }
    window.location.href="queryWeather.do?we="+we;
    alert(we);
  }

  function fun2(){
   //window.location:重定向到另外的一个页面

    var number=document.getElementById("number").value;
     if(number==undefined)
     {
        number="18303752050";
     }

    window.location.href="queryMobileCode.do?number="+number;
    alert(number);
  }
</script>
<body>

  <h1 align="cent">这是登陆界面</h1>
  天气情况：${weather}<br/>
  手机归属地：${MobileCode}<br/>
  <input id="we" type="text"  name="we" value="地区"  onblur="fun1()"><br/>
  <input id="number" type="text" name="number" value="号码" onblur="fun2()"><br/>

</body>
</html>