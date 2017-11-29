package model;

import constant.CommmonConstant;
import util.PropertyUtil;

public class Pagination {
	private Integer pageSize;// 每页有多少条
	private Integer totalPage;// 总共多少页
	private Integer totalSize;// 总共多少条
	private Integer pageIndex;// 当前第几页
	private Integer activeIndex; //当前活跃的button
	private String keyWordValue;
	private String keyWord;

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getKeyWordValue() {
		return keyWordValue;
	}

	public void setKeyWordValue(String keyWordValue) {
		this.keyWordValue = keyWordValue;
	}

	public Integer getActiveIndex() {
		return activeIndex;
	}

	public void setActiveIndex(Integer activeIndex) {
		this.activeIndex = activeIndex;
	}

	public void setPageSize() {
		pageSize = Integer
				.valueOf(PropertyUtil.getValue(CommmonConstant.PAGINATION_PROPERTIES_PATH, CommmonConstant.PAGE_SIZE));
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer setTotalPage(Integer totalSize) {
		pageSize = Integer
				.valueOf(PropertyUtil.getValue(CommmonConstant.PAGINATION_PROPERTIES_PATH, CommmonConstant.PAGE_SIZE));
		totalPage = totalSize / pageSize;
		if (totalSize % pageSize != 0) {
			totalPage++;
		}
		return totalPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public Integer getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public Integer getPageIndex() {
		if (pageIndex <= 0) {
			pageIndex = 1;
		}
		if (pageIndex > totalPage) {
			pageIndex = totalPage;
		} 
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

}
