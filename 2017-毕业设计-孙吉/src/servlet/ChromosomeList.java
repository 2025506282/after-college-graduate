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
import model.Chromosome;
import service.AsthmaService;
import service.impl.AsthmaServiceImpl;

/**
 * Servlet implementation class ChromosomeList
 */
@WebServlet("/ChromosomeList")
public class ChromosomeList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChromosomeList() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Chromosome> list = new ArrayList<Chromosome>();
		AsthmaService asthmaService = new AsthmaServiceImpl();
		Chromosome chromosome = new Chromosome();
		String chromosomeType = request.getParameter(CommmonConstant.CHROMOSOME_TYPE);
		try {
			chromosome.setChromosomeType(chromosomeType);
			list = asthmaService.findChromosomeList(chromosome);
			System.out.println(list.size());
			request.setAttribute(CommmonConstant.LIST, list);
			request.getRequestDispatcher("jsp/browse_detail.jsp").forward(request, response);
		} catch (ParameterException e) {
			// TODO Auto-generated catch block
			request.getRequestDispatcher("jsp/browse.jsp").forward(request, response);
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
