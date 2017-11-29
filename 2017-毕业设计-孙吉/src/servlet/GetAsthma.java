package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constant.CommmonConstant;
import exception.ParameterException;
import model.Asthma;
import service.AsthmaService;
import service.impl.AsthmaServiceImpl;
import util.FormatTransUtil;

/**
 * Servlet implementation class GetAsthma
 */
@WebServlet("/getAsthma")
public class GetAsthma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAsthma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String pmId = request.getParameter(CommmonConstant.PM_ID);
		AsthmaService asthmaService = new AsthmaServiceImpl();
		Asthma asthma = new Asthma();
		try {
			asthma = asthmaService.getAsthmaByPmId(FormatTransUtil.transInteger(pmId));
			request.setAttribute(CommmonConstant.ASTHMA, asthma);
			request.getRequestDispatcher("jsp/search_detail.jsp").forward(request, response);
		} catch (ParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
