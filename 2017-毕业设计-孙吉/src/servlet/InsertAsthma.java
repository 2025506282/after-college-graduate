package servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class InsertAsthma
 */
@WebServlet("/insertAsthma")
public class InsertAsthma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAsthma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AsthmaService asthmaService = new AsthmaServiceImpl();
		Asthma asthma = new Asthma();
		String chromosome = request.getParameter(CommmonConstant.CHROMOSOME);
		String disease = request.getParameter(CommmonConstant.DISEASE);
		String title = request.getParameter(CommmonConstant.TITLE);
		String authorName = request.getParameter(CommmonConstant.AUTHOR_NAME);
		String authorInformation = request.getParameter(CommmonConstant.AUTHOR_INFORMATION);
		String gene = request.getParameter(CommmonConstant.GENE);
		String thesis = request.getParameter(CommmonConstant.THESIS);
		String pmId = request.getParameter(CommmonConstant.PM_ID);
		String doi = request.getParameter(CommmonConstant.DOI);
		asthma.setChromosome(chromosome);
		asthma.setDisease(disease);
		asthma.setTitle(title);
		asthma.setAuthorName(authorName);
		asthma.setAuthorInformation(authorInformation);
		asthma.setGene(gene);
		asthma.setThesis(thesis);
		asthma.setDoi(doi);
		asthma.setPmId(pmId);
		PrintWriter out = response.getWriter();
		try {
			
			System.out.println("chromosome = " + chromosome + " disease = " + disease + " title = " + title + " authorName = " + authorName);
			System.out.println("authorInformation = " + authorInformation + " gene = " + gene + " pmId = " + pmId + " thesis = " + thesis);
			asthmaService.insertAsthma(asthma);
			out.print("aa");
		} catch (ParameterException e) {
			out.print("baa");
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
