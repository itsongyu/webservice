<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello,web!!!</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/jquery-3.0.0/jquery-3.0.0.min.js"></script>
<%--<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>--%>
<script type="text/javascript">

    function fun1() {
        //window.location:重定向到另外的一个页面

        var we = document.getElementById("we").value;
        if (we == undefined) {
            we = "日本";
        }
        window.location.href = "queryByName.do?we=" + we;
        alert(we);
    }

    function fun2() {
        //window.location:重定向到另外的一个页面

        var number = document.getElementById("number").value;
        if (number == undefined) {
            number = "18303752050";
        }

        window.location.href = "queryById.do?number=" + number;
        alert(number);
    }

    function fun3() {

        var v = $("input[name='x']").val();
        alert(v);

        $.ajax({
            url: "restful/user/queryi/"+v,
            type: "get",
            dataType: "jsonp",
            jsonp:"callback",

            success: function (result) {
                alert(result);
                alert(result[0].name);
            }, error: function () {
                alert("获取失败！！！");
            }
        });

    }
</script>
<body>

<h1 align="cent">这是登陆界面</h1>
姓名：${byname}<br/>
地址：${byid}<br/>
查询1：<input  type="text" name="we">
<input type="button" onclick="fun1()" value="确定"><br/>

查询2：<input  type="text" name="number">
<input type="button" onclick="fun2()" value="确定"><br/>

刷新3：<input  type="text" name="x">
<input type="button" onclick="fun3()" value="确定"><br/>

</body>
</html>