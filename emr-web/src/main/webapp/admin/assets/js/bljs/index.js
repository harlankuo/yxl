// JavaScript Document

$(function(){
	none();
	fliexd();
	enter();
	aaaa();
})
$(window).resize(function(){
	aaaa();
})
//首页大模块轮换并鼠标拖动滑动
function fliexd(){
	$(".main_visual").hover(function(){
	$("#btn_prev,#btn_next").fadeIn()
	},function(){
	$("#btn_prev,#btn_next").fadeOut()
	})
	$dragBln = false;
	$(".main_image").touchSlider({
		flexible : true,
		speed : 200,
		btn_prev : $("#btn_prev"),
		btn_next : $("#btn_next"),
		paging : $(".flicking_con a"),
		counter : function (e) {
			$(".flicking_con a").removeClass("on").eq(e.current-1).addClass("on");
		}
	});
	$(".main_image").bind("mousedown", function() {
		$dragBln = false;
	})
	$(".main_image").bind("dragstart", function() {
		$dragBln = true;
	})
	$(".main_image a").click(function() {
		if($dragBln) {
			return false;
		}
	})

}
//最后一行没有描边
function none(){
	$('.mode .number:last').css('border-right',0);
		
	$('.place ul').find('li:last').css('border-bottom',0);
	$('.place:last').css('border-bottom',0);
	}
	
//鼠标移上去滑上滑下
function enter(){
	$('.mode').hover(function(){
		$(this).find('.moveenter').animate({top:0+'px'},200);
    }, function(){
		$(this).find('.moveenter').animate({top:172+'px'},200);
    });	
	$('.announce').hover(function(){
		$(this).find('.moveenter').animate({top:0+'px'},200);
    }, function(){
		$(this).find('.moveenter').animate({top:331+'px'},200);
    });
}
//右侧根据屏幕宽度滑入滑出
function aaaa(){	
	var wh=$(window).height();
	$("#main").css("height",wh+"px");
	$(".right-side").css("height",wh+"px");
	if($(window).width()<=1258){
			$('.right-side').hide();
			$('#col').hide();
			$('#exp').show();
			$('.left-side').animate({left: 0+'px'},'slow').css('margin','92px auto 0');
			$('#col').click(function(){
				$(this).hide();
				$('#exp').show();
				$('.right-side').stop();
				$('.left-side').stop();
				$('.right-side').animate({right: -330+'px'},'slow').show();
				$('.left-side').animate({left: 0+'px'},'slow').css('margin','92px auto 0');
			})
			$('#exp').click(function(){
				$(this).hide();
				$('#col').show();
				$('.right-side').stop();
				$('.left-side').stop();
				$('.right-side').animate({right: 0+'px'},'slow').show();
				$('.left-side').animate({left: -258+'px'},'slow').css('margin','92px auto 0');
			});
		}
	else{
		$('.right-side').show().css('right',0);
		$('#col').hide();
		$('#exp').hide();
		$('.left-side').css('margin','92px 330px 0 0');
		
		}
}

