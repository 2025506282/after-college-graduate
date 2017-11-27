// JavaScript Document
 var section13_index=0;
   $(".section13_top_ul>li").mouseover(function(){
      section13_index=$(this).index();
	  $(".section13_bottom_ul>li").eq(section13_index).show().siblings().hide();
   });