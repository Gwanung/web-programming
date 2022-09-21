var Body = {
    setColor:function(color){
        // document.querySelector('body').style.color = color;
        $("body").css("color", color);
    },
    setBackgroundColor:function(color){
        // document.querySelector('body').style.backgroundColor = color;
        $("body").css("backgroundcolor", color);
    }
} 

var Links = {
    setColor:function(color){
        // var alist = document.querySelectorAll('a');
        // for(var i=0; i<alist.length; i++){
            // alist[i].style.color = color;
            // }
        $("a").css('color', color);
    }
}
function nightDayHandler(self){  //중복되는 것들은 함수를 통해서 반복되는 입력을 줄임. 
    var target = document.querySelector('body');  
    if(self.value === 'night'){  
        Body.setBackgroundColor('black');
        Body.setColor('white');
        self.value = 'day';
        Links.setColor('powderblue');
    }else{
        Body.setBackgroundColor("white");
        Body.setColor('black');
        self.value = 'night';
        Links.setColor('blue');
    }
} //nightDayHandler()