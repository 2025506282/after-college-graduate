package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.ParameterException;
import model.Chromosome;
import net.sf.json.JSONArray;
import service.AsthmaService;
import service.impl.AsthmaServiceImpl;

/**
 * Servlet implementation class GetChromosomeCount
 */
@WebServlet("/GetChromosomeCount")
public class GetChromosomeCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetChromosomeCount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AsthmaService asthmaService = new AsthmaServiceImpl();
		List<Chromosome> list= new ArrayList<Chromosome>();
        try {
        	PrintWriter out = response.getWriter();
        	list = asthmaService.getChromosomeCount();
			out.println(JSONArray.fromObject(list));
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
