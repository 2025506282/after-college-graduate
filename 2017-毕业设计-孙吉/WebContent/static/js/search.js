/**
 * Created by sunji on 2017/3/16.
 */
$(function() {
	var currentPage = $("#currentPage").attr("value");
	var keyWord = "%";
	var index = $("#activeIndex").attr("value");
	var maxPage = parseInt($(".last_page").children(0).html());
	getNumber(index, currentPage, keyWord);
//	var selectIndex = $("#search_type_select option:selected").attr("index");
//	alert(selectIndex);
	var selectValue = $("#search_type_select option:selected").text();
	//$("#search_type_select").find("option[text=Thesis]").attr("selected",true);
	/*
	 * var pageIndex = $(this).children(0).html(); var middleIndex =
	 * $(".number_scroll") if (pageIndex>2) {
	 * $(".suspension").clone().insertAfter($(".number_scroll:first"));
	 * $(".number_scroll:first").clone().insertAfter($(".suspension:first"));
	 * $(".number_scroll:first").clone().insertAfter($(".suspension:first")); }
	 */
 
	$(".sure_search").click(function() {
		selectType = $("#search_type_select option:selected").text();
		selectTypeValue = $(".search_type_value").val();
		//if (selectTypeValue) {
			index = 0;
			currentPage = 1;
			submitForm(index, currentPage, keyWord);
		//}
	});
	$(".number_scroll").click(function() {
		index = $(".number_scroll").index($(this));
		currentPage = $(this).children(0).html();
		submitForm(index, currentPage, keyWord);
	});
	$(".prev_page").click(function() {
		if (currentPage > 1) {
			var oldActiveNode = $(".search").find(".active");
			index = $(".active").index(".number_scroll") - 1;
			currentPage = oldActiveNode.children(0).html() - 1;
			submitForm(index, currentPage, keyWord);
		}

	});
	$(".next_page").click(function() {
		if (currentPage < maxPage) {
			var oldActiveNode = $(".search").find(".active");
			index = $(".active").index(".number_scroll") + 1;
			currentPage = parseInt(oldActiveNode.children(0).html()) + 1;
			submitForm(index, currentPage, keyWord);
		}
	});
	function getNumber(index, currentPage, keyWord) {
		currentPage = parseInt(currentPage);
		index = parseInt(index);

		if (index == null) {
			index = 0;
		}
		if (currentPage == 0) {
			currentPage = 1;
		}
		if (index == 0) {
			if (currentPage == 1) {
				$(".number_scroll").eq(1).children(0).html(currentPage + 1);
				$(".number_scroll").eq(2).children(0).html(currentPage + 2);
				$(".number_scroll").eq(3).children(0).html(currentPage + 3);
				$(".number_scroll").eq(4).children(0).html(currentPage + 4);
				$(".number_scroll").eq(5).children(0).html(currentPage + 5);
				$(".number_scroll").eq(6).children(0).html(currentPage + 6);
				$(".number_scroll").eq(7).children(0).html(currentPage + 7);
				$(".number_scroll").eq(8).children(0).html(currentPage + 8);
				$(".number_scroll").eq(9).children(0).html(currentPage + 9);
				$(".number_scroll").eq(0).addClass("active").siblings()
						.removeClass("active");
			}
			$(".prev_page").addClass("negative");
			$(".next_page").removeClass("negative");
		}
		if (index > 0 && index < 10) {
			if (currentPage < maxPage - 4 && currentPage > 5) {
				$(".number_scroll").eq(1).children(0).html(currentPage - 4);
				$(".number_scroll").eq(2).children(0).html(currentPage - 3);
				$(".number_scroll").eq(3).children(0).html(currentPage - 2);
				$(".number_scroll").eq(4).children(0).html(currentPage - 1);
				$(".number_scroll").eq(5).children(0).html(currentPage);
				$(".number_scroll").eq(6).children(0).html(currentPage + 1);
				$(".number_scroll").eq(7).children(0).html(currentPage + 2);
				$(".number_scroll").eq(8).children(0).html(currentPage + 3);
				$(".number_scroll").eq(9).children(0).html(currentPage + 4);
				$(".number_scroll").eq(5).addClass("active").siblings()
						.removeClass("active");
			}
			if (currentPage <= 5) {
				$(".number_scroll").eq(1).children(0).html(2);
				$(".number_scroll").eq(2).children(0).html(3);
				$(".number_scroll").eq(3).children(0).html(4);
				$(".number_scroll").eq(4).children(0).html(5);
				$(".number_scroll").eq(5).children(0).html(6);
				$(".number_scroll").eq(6).children(0).html(7);
				$(".number_scroll").eq(7).children(0).html(8);
				$(".number_scroll").eq(8).children(0).html(9);
				$(".number_scroll").eq(9).children(0).html(10);
				$(".number_scroll").eq(currentPage - 1).addClass("active")
						.siblings().removeClass("active");
			}
			if (currentPage >= maxPage - 4) {
				$(".number_scroll").eq(1).children(0).html(maxPage - 9);
				$(".number_scroll").eq(2).children(0).html(maxPage - 8);
				$(".number_scroll").eq(3).children(0).html(maxPage - 7);
				$(".number_scroll").eq(4).children(0).html(maxPage - 6);
				$(".number_scroll").eq(5).children(0).html(maxPage - 5);
				$(".number_scroll").eq(6).children(0).html(maxPage - 4);
				$(".number_scroll").eq(7).children(0).html(maxPage - 3);
				$(".number_scroll").eq(8).children(0).html(maxPage - 2);
				$(".number_scroll").eq(9).children(0).html(maxPage - 1);
				$(".number_scroll").eq(10 + currentPage - maxPage).addClass(
						"active").siblings().removeClass("active");
			}
			$(".prev_page").removeClass("negative");
			$(".next_page").removeClass("negative");

		}
		if (index == 10) {
			$(".number_scroll").eq(1).children(0).html(maxPage - 9);
			$(".number_scroll").eq(2).children(0).html(maxPage - 8);
			$(".number_scroll").eq(3).children(0).html(maxPage - 7);
			$(".number_scroll").eq(4).children(0).html(maxPage - 6);
			$(".number_scroll").eq(5).children(0).html(maxPage - 5);
			$(".number_scroll").eq(6).children(0).html(maxPage - 4);
			$(".number_scroll").eq(7).children(0).html(maxPage - 3);
			$(".number_scroll").eq(8).children(0).html(maxPage - 2);
			$(".number_scroll").eq(9).children(0).html(maxPage - 1);
			$(".number_scroll").eq(10).addClass("active").siblings()
					.removeClass("active");
			$(".next_page").addClass("negative");
			$(".prev_page").removeClass("negative");
		}

	}
	function submitForm(index, currentPage, keyWord) {
		$("#currentPage").attr("value", currentPage);
		$("#keyWord").attr("value", keyWord);
		$("#activeIndex").attr("value", index);
		$(".search").submit();
	}
});
