package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constant.CommmonConstant;
import exception.ParameterException;
import model.Asthma;
import model.Pagination;
import service.AsthmaService;
import service.impl.AsthmaServiceImpl;
import util.FormatTransUtil;

/**
 * Servlet implementation class AsthmaList
 */
@WebServlet("/asthmaList")
public class AsthmaList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AsthmaList() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Asthma> list = new ArrayList<Asthma>();
		Pagination pagination = new Pagination();
		Asthma asthma = new Asthma();
		AsthmaService asthmaService = new AsthmaServiceImpl();
		String pageIndex = request.getParameter(CommmonConstant.PAGE_INDEX);
		String activeIndex = request.getParameter(CommmonConstant.ACTIVE_INDEX);
		String keyWord = request.getParameter(CommmonConstant.KEY_WORD);
		String keyWordValue = request.getParameter(CommmonConstant.KEY_WORD_VALUE);
		System.out.println("keyWord = " + keyWord +"/" + "keyWordValue = " + keyWordValue);
		try {
			pagination.setPageIndex(FormatTransUtil.transInteger(pageIndex));
			pagination.setActiveIndex(FormatTransUtil.transInteger(activeIndex));
			pagination.setPageSize();
			pagination.setTotalSize(asthmaService.getTotalSize());
			pagination.setTotalPage(pagination.getTotalSize());
		    pagination.setKeyWord(keyWord);
			pagination.setKeyWordValue(keyWordValue);
			System.out.println("keyWord = " + pagination.getKeyWord() +"/" + "keyWordValue = " + pagination.getKeyWordValue() + "/" + FormatTransUtil.transSql(pagination.getKeyWord()));
//			asthma.setChromosome(chromosome);
//			asthma.setDisease(disease);
//			asthma.setTitle(title);
//			asthma.setAuthorName(authorName);
//			asthma.setGene(gene);
//			asthma.setThesis(thesis);
//			asthma.setPmId(FormatTransUtil.transInteger(pmId));
			list = asthmaService.findAsthmaList(pagination, asthma);
			request.setAttribute(CommmonConstant.PAGINATION, pagination);
			request.setAttribute(CommmonConstant.LIST, list);
			request.getRequestDispatcher("jsp/search.jsp").forward(request, response);
		} catch (ParameterException e) {
			// TODO Auto-generated catch block
			request.getRequestDispatcher("jsp/search.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
