/**
 * Created by sunji on 2017/3/4.
 */
$(function(){
//    $(".header_menu>li").click(function(){
//    	
//        changeColor($(this).index());
//        //$(this).children(0).css({"color":"rgb(3,70,147)","background":"white"}).siblings().children(0).css({"color":"white","background-color":"black"});
//    });
    $(".quick_search").click(function(){
        if($(".quick_search_text").val()) {
        	$(".common_header_search_form").submit();
        }
    });
//    function changeColor(n) {
//        for(var i=0;i<$(".header_menu>li").length;i++) {
//            if (i==n) {
//            	//alert($(".header_menu>li").eq(i).css("color")+"/"+$(".header_menu>li").eq(i).children(0).css("background-color"));
//                //$(".header_menu>li").eq(i).css({color:"rgb(3,70,147)","background-color":"white"});
//                //alert($(".header_menu>li").eq(i).css("color")+"/"+$(".header_menu>li").eq(i).children(0).css("background-color"));
//            	/*
//            	alert($(".header_menu>li").eq(i).children(0).css("color")+"/"+$(".header_menu>li").eq(i).children(0).css("background-color"));
//                $(".header_menu>li").eq(i).children(0).css({color:"rgb(3,70,147)","background-color":"white"});
//                alert($(".header_menu>li").eq(i).children(0).css("color")+"/"+$(".header_menu>li").eq(i).children(0).css("background-color"));
//                */
//            } else {
//                $(".header_menu>li").eq(i).children(0).css({"color":"white","background-color":"rgb(3,70,147)"});
//            }
//        }
//    }
});

