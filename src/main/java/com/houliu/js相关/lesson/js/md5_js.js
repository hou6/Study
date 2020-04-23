function check() {

    var p, u, t, h, v, token;

    p = $("#pwd").val();

    authcode = $("input[name='authcode']").val();

    u = $("#uid").val();

    verify = $("input[name='verify']").val();

    pa = authcode + p;

    pass = SparkMD5.hash(pa); //前端md5加密

    var url = "{:U('Public/dologin')}";

    $.ajax({

        beforeSend:function(){

            var $sub=$("#sub");

            $sub.text($sub.attr("data-loadingmsg"));

        },

        type:"POST",

        url: url,

        data: {

            uid: u, hash: pass, verify: verify

        },

        dataType:"json"

    }).done(function(result){

        if (result.err == 3) {

            $(".tips_error").text(result.msg);

            window.location.href = "{:U('Index/index')}";

        } else {

            $(".tips_error").text(result.msg);

            $(".verifycode-wrapper>img").trigger("click");

            $("#sub").text("登录");

        }

    });

}



//回车时，默认是登陆

function on_return() {

    $("body").on("keyup",function(e){

        if(e.keyCode==13){

            $("#sub").trigger("click");

        }

    })

}
