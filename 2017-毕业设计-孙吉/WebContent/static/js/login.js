/**
 * Created by sunji on 2017/2/24.
 */
$(function () {
	//验证用户名密码石佛错误
    $(".login_button").click(function(){
        var $userName = $(".user_name").val();
        var $password = $(".password").val();
        if(!$userName||!$password) {
            $(".login_information").html("用户名或密码不能为空");
            setTimeout(function(){
                $(".login_information").html("");
            },3000);
        } else {
            $.get(
                "http://localhost:8080/2017-毕业设计-孙吉/login",
                {userName: $userName, password: $password},
                function (data) {
                    if(data=="true") {
                    	window.location.href = "home.jsp";
                    } else {
                    	$(".login_information").html(data);
                    }
                }
            );
        }
    });
})