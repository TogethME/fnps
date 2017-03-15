

$(function(){
    $(".ce > li > a").click(function(){
	     $(this).addClass("xz").parents().siblings().find("a").removeClass("xz");
		 $(this).parents().siblings().find(".er").hide(300);
		 $(this).siblings(".er").toggle(300);
		 $(this).parents().siblings().find(".er > li > .thr").hide().parents().siblings().find(".thr_nr").hide();
		
	});
	
    $(".er > li > a").click(function(){
        $(this).addClass("sen_x").parents().siblings().find("a").removeClass("sen_x");
        $(this).parents().siblings().find(".thr").hide(300);	
	    $(this).siblings(".thr").toggle(300);	
	});

    $(".thr > li > a").click(function(){
	     $(this).addClass("xuan").parents().siblings().find("a").removeClass("xuan");
		 $(this).parents().siblings().find(".thr_nr").hide();	
	     $(this).siblings(".thr_nr").toggle();
	});
	/*小宝收车后台*/
	$(".applyList .td1").click(function(){
	    $(".user_mess").show();
	    $("#userMess1").show();
	    $(".chooseCom").hide();
	    $("#userMess2").hide();
	});
	$(".applyList .td2").click(function(){
	    $(".user_mess").show();
	    $(".chooseCom").show();
	    $(".userMess").hide();
	});
	$(".applyList .td4").click(function(){ 
	    $(".user_mess").show();
	    $("#userMess2").show();
	    $(".chooseCom").hide();
	    $("#userMess1").hide();
	});
	$(".user_mess .close1").click(function(){
	    $(".user_mess").hide();
	});
	/*竞价大厅*/
	$(".slideDown").click(function(){
		$(".slideDown").fadeOut("fast");
		$(".slideUp").fadeIn("fast");
		$(".listmore").slideDown("slow");
	});
	$(".slideUp").click(function(){
		$(".slideUp").fadeOut("fast");
		$(".slideDown").fadeIn("fast");
		$(".listmore").slideUp("slow");
	});
	$('#tab_t01 li').click(function(){
		$(this).addClass('active').siblings().removeClass('active');
		var index=$(this).index();
		$('.tab_t').hide().eq(index).show();
	});
	/*首页*/
	$('#tab_t li').mousemove(function(){
		$(this).addClass('active').siblings().removeClass('active');
		var index=$(this).index();
		$('.tab_t').hide().eq(index).show();
	});
	$('#tab_t li').mouseleave(function(){
			$(this).addClass('active').siblings().removeClass('active');
			var index=$(this).index();
			$('.tab_t').hide();
		});
	

	
	/*确认订单-添加地址*/
	$("#addDz").click(function(){
		$(".addressDiv").show();
		$(".add h2").text("新增地址");
	});
	$(".close").click(function(){
		$(".addressDiv").hide();
	})
	
	/*缺货登记-添加数量*/
	$(".add").click(function(){
		$(".addnumber").show("slow");
	});
	$(".close").click(function(){
		$(".addnumber").hide("slow");
	});
	
	/*index_jmcs*/
	$(".jmcs_item02 ol li").hover(function(){

		$(this).find(".onLi01").stop().animate({top: '-0px'}, "slow");
	},function(){
		$(this).find(".onLi01").stop().animate({top: '+210px'}, "slow");
	});


	//点单拆解车型详情
	$(".ddcjList ul li,.ddcjList01 ul li").click(function(){
		$(".carMess").slideDown();
		$("body").css({overflow:"hidden"})
	});
	$(".close").click(function(){
		$(".carMess").fadeOut();
		$("body").css({overflow:"auto"})
	});
	//点单拆解选择拆车厂
	$(".select_com").click(function(){
		$(".select_com_bg").slideDown();
	});
	$(".close").click(function(){
		$(".select_com_bg").fadeOut();
	});
	$('.select-dq li').click(function(){
		$(this).addClass('active').siblings().removeClass('active');
	});
	
	//注册弹窗
	$('#tab_t02 li').click(function(){
		$(this).addClass('active').siblings().removeClass('active');
		var index=$(this).index();
		$('.registerCont.tab').hide().eq(index).show();
	});
	$("#register").click(function(){
		$(".registerPage").fadeIn();
		$("body").css({overflow:"hidden"})
	});
	$(".close").click(function(){
		$(".registerPage").fadeOut();
		$("body").css({overflow:"auto"})
	});
	//汽配超市tab切换
	$('#tab li').click(function(){
		$(this).addClass('active').siblings().removeClass('active');
	});
	//产品详情tab切换鼠标悬浮效果
	$('#tab-hover li').mousemove(function(){
		$(this).addClass('active').siblings().removeClass('active');
		$('.qpcs_tab_bg').show();
		var index=$(this).index();
		$('.qpcs_tab.tab').hide().eq(index).show();
	});
	$('#tab-hover li').mouseleave(function(){
		$(this).addClass('active').siblings().removeClass('active');
		var index=$(this).index();
		$('.qpcs_tab.tab').hide();
		$('.qpcs_tab_bg').hide();
	});
	
	
	//编辑地址
	$(".edit-addr").click(function(){
		$(".addressDiv").show();
		$(".add h2").text("编辑地址");
	});
	//选择地址
	$('.order-a li').click(function(){
		$(this).addClass('active').siblings().removeClass('active');
	});
	/*确认订单-发票*/
	$(".tbxg").click(function(){
		$(".fpmess").show();
	});
	$(".close").click(function(){
		$(".fpmess").hide();
	});
	$('.fp_mess dl dd a').click(function(){
		$(this).addClass('cur').siblings().removeClass('cur');
		if($("#invoice-pt").hasClass("cur")){
			$(".rise-pt").show();
			$("#radio01").click(function(){
				if($(this).attr("checked")){
					$(".rise-pt font").text("个人抬头");
				}
			});
			$("#radio02").click(function(){
				if($(this).attr("checked")){
					$(".rise-pt font").text("公司抬头");
				}
			});
		}else{
			$(".rise-pt").hide();
		};
		if($('#invoice-zy').hasClass("cur")){
			
			$('.rise-zy').show();
		}else{
			$('.rise-zy').hide();
		};
	});
	
	
})



























