<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello,web!!!</title>
</head>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/jquery-3.0.0/jquery-3.0.0.min.js"></script>
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
        //window.location:重定向到另外的一个页面
        window.location.href = "query.do?";
    }

    function fun4() {

        var x = $("input[name='x']").val();
        alert(x);

        $.ajax({
            url: "http://127.0.0.1:8080/restful/user/queryi/" + x,
            type: "get",
            dataType: "jsonp",
            jsonp: "callback",

            success: function (result) {
                alert(result[0].name);
            }, error: function () {
                alert("获取失败！！！");
            }
        });
    }

    function fun5() {

        $.ajax({
            url: "http://localhost:8080/rest/user/getJson",
            type: "get",
            dataType: "json",
            success: function (data) {

                // $.each(data, function (i, result) {
                //     // alert("第一次的index是："+i);
                //     // alert("第一次的value是："+result);
                    $.each(data, function (j, value) {
                        // alert("第二次的index是："+j);
                        // alert("第二次的value是："+value);
                        var item = "<tr><td>" + value.uid + "</td><td>" + value.name + "</td><td>" + value.pwd + "</td></tr>";
                        $('.table').append(item);
                    });
                // })

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
查询1：<input type="text" name="we">
<input type="button" onclick="fun1()" value="cxf_restful查询1"><br/>

查询2：<input type="text" name="number">
<input type="button" onclick="fun2()" value="cxf_restful查询2"><br/>

查询3：<input type="text">
<input type="button" onclick="fun3()" value="jersey_restful查询"><br/>

刷新1：<input type="text" name="x">
<input type="button" onclick="fun4()" value="确定"><br/>

刷新2：<input type="text" name="y">
<input type="button" onclick="fun5()" value="确定"><br/>
<table class="table">

</table>
</body>
</html>