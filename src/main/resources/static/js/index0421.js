// login

let login_form = {
    init:function(){
        $("#login_btn").click(function(){
            login_form.send();
        });
    },
    send:function(){
        $("#login_form").attr({
            'action':'/loginimpl',
            'method':'post'
        });
        $("#login_form").submit();
    }
};

$(function(){
    login_form.init();
});

// register

let register_form = {
    init:function(){
        $("#register_btn").click(function(){
            register_form.send();
        });
    },
    send:function(){
        $("#register_form").attr({
            'action':'/registerimpl',
            'method':'post'
        });
        $("#register_form").submit();
    }
};

$(function(){
    register_form.init();
});

// jsp01

let jsp01 = {
    data:0,
    init:function(num){
        this.data = num;
        // this.data = '<c:out value="${num}"/>';
        this.display();
    },
    display:function(){
        $('#jsp01').text(this.data+'');
    }
};

$(function(){
    jsp01.init();
});