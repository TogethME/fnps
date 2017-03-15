$(document).ready(function(){
	$("#head").html('<div class="headBg">\
			<div class="qsbHead">\
				<div class="headL">\
						<span>当月成交额：<b>23165465.00</b>元</span>\
						<span>|</span>\
						<span>新增用户：<b>35165</b>人</span>\
				</div>\
				<div class="headR">\
					<ul class="clearfix">\
						<li><a href="个人用户升级.html">我要加盟</a></li>\
						<li><a href="用户后台（账户中心）基本信息1.html">我的全仕宝</a></li>\
						<li><a href="#"><span class="bule" id="register">注册</span></a><span class="bule">&nbsp;|&nbsp;</span><a href="登陆.html"><span class="bule">登录</span></a></li>\
					</ul>\
				</div>\
				<div class="download-APP">\
					手机APP<i class="option"></i>\
					<div class="download-code">\
						<div class="code-img">\
							<img src="images/wecat.png" alt="download-app"/>\
						</div>\
						<p>下载移动客户端</p>\
					</div>\
				</div>\
			</div>\
		</div>\
		<div class="qsbNavBg">\
			<div class="qsbNav">\
				<div class="navL">\
					<a href="index.html"><img src="images/logo.png" alt="全仕宝logo"></a>\
				</div>\
				<div class="shopCar">\
					<a href="我的购物车2.html">10</a>\
				</div>\
				<div class="navR">\
					<ul class="clearfix">\
						<li><a href="index.html">首页</a></li>\
						<li><a href="汽配超市.html">汽配超市</a></li>\
						<li><a href="加盟厂商.html">加盟厂商</a></li>\
						<li><a href="竞价大厅.html">竞价大厅</a></li>\
						<li><a href="小宝收车.html">小宝收车</a></li>\
						<li><a href="点单拆解.html">点单拆解</a></li>\
					</ul>\
				</div>\
			</div>\
		</div>');
		
	$("#foot").html('<div class="qsbFootMenu">\
			    <div class="qsbFootMenuContent clearfix">\
			    	<dl style="width:240px">\
			    		<dd>中国领先的二手汽配件</dd>\
			    		<dd>电商网站</dd>\
			    		<dd>覆盖全国<strong>70</strong>个省市地区</dd>\
			    		<dd>超过<strong>100</strong>家拆车厂加盟</dd>\
			    		<dd>超过<strong>100000000</strong>在线真实交易额</dd>\
			    	</dl>\
			        <dl>\
			        	<dt>关于全仕宝</dt>\
			        	<dd><a href="#">联系方式</a></dd>\
			        	<dd><a href="#">地理位置图</a></dd>\
			        	<dd><a href="#">公司价值</a></dd>\
			        	<dd><a href="#">公司服务</a></dd>\
			        </dl>\
			        <dl>\
			        	<dt>服务与支持</dt>\
			        	<dd><a href="#">商家服务</a></dd>\
			        	<dd><a href="#">买家服务</a></dd>\
			        	<dd><a href="#">上门自取</a></dd>\
			        	<dd><a href="#">配送服务</a></dd>\
			        </dl>\
			        <dl>\
			        	<dt>友情链接</dt>\
			        	<dd><a href="#">资源go平台</a></dd>\
			        	<dd><a href="#">上海有色网</a></dd>\
			        	<dd><a href="#">二手熊猫网</a></dd>\
			        	<dd><a href="#">携手网</a></dd>\
			        </dl>\
			        <ul class="code clearfix">\
			        	<li style="margin-right:20px">\
			        		<p>APP下载</p>\
			        		<img src="images/APPcode.png" alt="APP下载">\
			        	</li>\
			    		<li>\
			        		<p>请关注微信公众号</p>\
			        		<img src="images/wecode.png" alt="微信">\
			        	</li>\
			        </ul>\
			    </div>\
			</div>\
			<div class="qsbCopyright clearfix" style="float:left;position:relative;">\
			    <div class="qsbCopyrightContent">\
				<img src="images/logo.png">COPYRIGHT BY 全仕宝 2013－2016 备案号：沪备 13020512306 号\
			    </div>\
			</div>');
			
				$(".download-APP").click(function(){
					$(this).toggleClass("rotate");
					$(".download-code").toggle();
				})
});
