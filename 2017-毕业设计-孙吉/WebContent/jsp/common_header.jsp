
	<div class="header">
		<div class="header_logo">
		    <h1><i>A&nbsp;s&nbsp;t&nbsp;h&nbsp;m&nbsp;a&nbsp;D&nbsp;B</i></h1>
			
		</div>
		<div class="header_nav">
			<form class="common_header_search_form" method="get"
				action="<%=request.getContextPath()%>/asthmaList">
				<ul class="header_search">
					<li><input type="text" class="quick_search_text" name="gene" /></li>
					<li><input type="button" class="quick_search"
						value="quick&nbsp;&nbsp;serach" /></li>
				</ul>
			</form>
			<ul class="header_menu">
				<li><a href="<%=request.getContextPath()%>/jsp/home.jsp"
					class="nav_home">Home</a></li>
				<li><a href="<%=request.getContextPath()%>/jsp/browse.jsp"
					class="nav_browse">Browse</a>
					</li>
				<li><a href="<%=request.getContextPath()%>/asthmaList"
                    class="nav_search">Search</a></li>
				<li><a href="<%=request.getContextPath()%>/jsp/upload.jsp"
					class="nav_upload">Upload</a></li>
				<li><a href="<%=request.getContextPath()%>/jsp/download.jsp"
					class="nav_download">Dowload</a></li>
				<li><a href="<%=request.getContextPath()%>/jsp/contact_us.jsp"
					class="nav_contact_us">Contact us</a></li>
			</ul>
		</div>
	</div>
